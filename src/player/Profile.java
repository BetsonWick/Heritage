package player;

import org.newdawn.slick.Image;

public class Profile {
    private Image image;
    private String name;

    public Profile(Image image, String name) {
        this.image = image;
        this.name = name;
    }

    public Profile(String name) {
        this(null, name);
    }
}
