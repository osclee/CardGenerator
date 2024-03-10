package cardgen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardGenerator {
    public static void main(String[] args) throws IOException {
        String frontImagePath;
        String backImagePath;
        String destinationFolder;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to Card Generator.");

        System.out.println("Enter image path for the front of your card");
        frontImagePath = reader.readLine();

        System.out.println("Enter image path for the back of your card");
        backImagePath = reader.readLine();

        System.out.println("Enter destination folder for images to be saved");
        destinationFolder = reader.readLine();

        Generate gen = new Generate(frontImagePath, backImagePath, destinationFolder);

        System.out.println("Generating Images");
        gen.generate(600, 800);

        System.out.println("Saving Images");
        gen.save();

        System.out.println("Done. Images saved to: " + destinationFolder);
    }
}
