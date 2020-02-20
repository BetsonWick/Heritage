import org.newdawn.slick.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main extends BasicGame {

    private static int TARGET_FRAMERATE;
    private static int SCREEN_WIDTH;
    private static int SCREEN_HEIGHT;

    public Main(String title) {
        super(title);
    }

    private static void setupArguments() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src\\configuration\\setup.in"));
        while (reader.ready()){
            String[] input = reader.readLine().split(" ");
            int value = Integer.parseInt(input[2]);
            switch (input[0]){
                case "TARGET_FRAMERATE":
                    TARGET_FRAMERATE = value;
                    break;
                case "SCREEN_WIDTH":
                    SCREEN_WIDTH = value;
                    break;
                case "SCREEN_HEIGHT":
                    SCREEN_HEIGHT = value;
                    break;
            }
        }
        reader.close();
    }

    public static void main(String[] args) throws SlickException {
        try {
            setupArguments();
        } catch (IOException e) {
            System.err.println("Setup failed");
            return;
        }
        AppGameContainer container = new AppGameContainer(new Main("Heritage"));
        container.setTargetFrameRate(TARGET_FRAMERATE);
        container.setDisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT, false);
        container.start();
    }

    @Override
    public void init(GameContainer container) throws SlickException {

    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {

    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {

    }
}
