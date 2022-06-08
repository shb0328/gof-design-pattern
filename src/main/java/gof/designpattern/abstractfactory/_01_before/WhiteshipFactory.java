package gof.designpattern.abstractfactory._01_before;

import gof.designpattern.factorymethod._02_after.Ship;
import gof.designpattern.factorymethod._02_after.ShipFactory;
import gof.designpattern.factorymethod._02_after.WhiteShip;

public class WhiteshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
