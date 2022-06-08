package gof.designpattern.abstractfactory._02_after;

import gof.designpattern.abstractfactory._01_before.WhiteshipFactory;
import gof.designpattern.factorymethod._02_after.Ship;
import gof.designpattern.factorymethod._02_after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
