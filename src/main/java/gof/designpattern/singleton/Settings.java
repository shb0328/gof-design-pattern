package gof.designpattern.singleton;

public class Settings {
    private static volatile Settings instance;

    public Settings() {
    }

    public static Settings getInstance() {
        if(instance == null) {
            synchronized (Settings.class) {
                if(instance == null){
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
