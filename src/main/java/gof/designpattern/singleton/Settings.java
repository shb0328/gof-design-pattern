package gof.designpattern.singleton;

public class Settings {
    private static Settings instance;

    public Settings() {
    }

    public static synchronized Settings getInstance() {
        if(instance == null) instance = new Settings();
        return instance;
    }
}
