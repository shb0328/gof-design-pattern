package gof.designpattern.abstractfactory._02_after;

import gof.designpattern.abstractfactory._01_before.WhiteAnchor;
import gof.designpattern.abstractfactory._01_before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
