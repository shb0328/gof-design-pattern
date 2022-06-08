package gof.designpattern.abstractfactory._02_after;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
