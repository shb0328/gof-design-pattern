package gof.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = null;

        Constructor<?>[] constructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> constructor: constructors) {
            constructor.setAccessible(true);
            settings2 = (Settings) constructor.newInstance("INSTANCE"); //Cannot reflectively create enum objects
        }
        System.out.println(settings1 == settings2);
    }
}
