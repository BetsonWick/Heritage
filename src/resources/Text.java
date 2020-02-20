package resources;

import org.newdawn.slick.Graphics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Text {

    public static void draw(String text, int x, int y) {

    }

    public static void drawTextFromFile(File file, int x, int y, Graphics graphics) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int counter = 0;
        while (reader.ready()) {
            graphics.drawString(reader.readLine(), x, y + counter);
            counter += 20;
        }
        reader.close();
    }
}
