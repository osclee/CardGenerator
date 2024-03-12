package cardgen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Generate {
    private final String frontImagePath;
    private final String backImagePath;
    private final String destinationFolder;
    private final Map<CardType, BufferedImage> images;

    public Generate(String frontImagePath, String backImagePath, String destinationFolder) {
        this.frontImagePath = frontImagePath;
        this.backImagePath = backImagePath;
        this.destinationFolder = destinationFolder;

        images = new HashMap<>();
    }

    public void generate(int imageWidth, int imageHeight) {
        BufferedImage frontImage;
        BufferedImage backImage;

        Map<Suit, BufferedImage> suits = new HashMap<>();

        try {
            frontImage = getImageFromSystem(frontImagePath);
        } catch (IOException e) {
            throw new RuntimeException("Error loading image for the front of card", e);
        }

        try {
           backImage = getImageFromSystem(backImagePath);
        } catch (IOException e) {
            throw new RuntimeException("Error loading image for the back of card", e);
        }

        String basePath = "/";
        try {
            suits.put(Suit.CLUB, getImageFromProgram(basePath + Suit.CLUB.getName() + ".png"));
            suits.put(Suit.DIAMOND, getImageFromProgram(basePath + Suit.DIAMOND.getName() + ".png"));
            suits.put(Suit.HEART, getImageFromProgram(basePath + Suit.HEART.getName() + ".png"));
            suits.put(Suit.SPADE, getImageFromProgram(basePath + Suit.SPADE.getName() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException("Error loading suit resources", e);
        }

        for (CardType cardType : CardType.values()) {
            images.put(cardType, createNewImage(cardType, imageWidth, imageHeight, frontImage, backImage, suits));
        }

    }
    public void save() {
        for (Map.Entry<CardType, BufferedImage> image : images.entrySet()) {
            File output = new File(destinationFolder + "/" + image.getKey().getFullName() + ".png");
            try {
                ImageIO.write(image.getValue(), "png", output);
            } catch (IOException e) {
                throw new RuntimeException("Unable to save image " + image.getKey().getFullName(), e);
            }
        }
    }

    private BufferedImage getImageFromSystem(String path) throws IOException {
        return ImageIO.read(new File(path));
    }

    private BufferedImage getImageFromProgram(String path) throws IOException {
        return ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream(path)));
    }

    private BufferedImage createNewImage(CardType cardType, int width, int height, BufferedImage frontImage, BufferedImage backImage, Map<Suit, BufferedImage> suits) {
        BufferedImage suit = suits.get(cardType.getSuit());

        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = newImage.createGraphics();
        g2.drawImage(cardType.getSuit() != Suit.NONE ? frontImage : backImage, 0, 0, width, height, null);
        g2.drawImage(suit, (width / 5) * 2, width / 2, width / 6, height / 6, null);
        g2.drawString(cardType.getName(), 10, 10);
        g2.drawString(cardType.getName(), width - 50, height - 50);
        g2.dispose();
        return newImage;
    }
}
