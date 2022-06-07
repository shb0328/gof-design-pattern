package gof.designpattern.factorymethod._03_java;

import gof.designpattern.factorymethod._02_after.BlackShip;
import gof.designpattern.factorymethod._02_after.WhiteShip;

public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
