package gof.designpattern.singleton;

public class Settings {
    public Settings() {
    }

    private static  class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
