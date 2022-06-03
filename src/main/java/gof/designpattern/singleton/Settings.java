package gof.designpattern.singleton;

import java.io.Serializable;

public class Settings implements Serializable {
    private Settings() {
    }

    private static  class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    //readObject() 내부적으로 호출되는 코드
    protected Object readResolve() {
        return getInstance();
    }
}
