package gof.designpattern.factorymethod._02_after;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("Whiteship", "hyebb@mail.com");
        System.out.println(whiteShip);
    }

}
