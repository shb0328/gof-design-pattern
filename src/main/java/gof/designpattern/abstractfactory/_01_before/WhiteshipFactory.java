package gof.designpattern.abstractfactory._01_before;

import gof.designpattern.abstractfactory._02_after.ShipPartsFactory;
import gof.designpattern.factorymethod._02_after.Ship;
import gof.designpattern.factorymethod._02_after.ShipFactory;
import gof.designpattern.factorymethod._02_after.WhiteShip;

public class WhiteshipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
