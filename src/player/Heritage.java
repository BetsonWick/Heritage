package player;

import java.io.File;
import java.util.HashMap;

public class Heritage {
    private HashMap<String, File> heritage;

    public Heritage() {
        heritage = new HashMap<>();
    }

    public void addToHeritage(String name, File file) {
        heritage.put(name, file);
    }
}
