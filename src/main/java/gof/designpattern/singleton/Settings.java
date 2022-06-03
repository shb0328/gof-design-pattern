package gof.designpattern.singleton;

public class Settings {
    private static final Settings INSTANCE = new Settings();

    public Settings() {
    }

    public static Settings getInstance() {
        return INSTANCE;
    }
}
