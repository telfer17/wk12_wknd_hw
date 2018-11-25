package Instruments;

public class Drum extends Instrument {

    public Drum(String material, String colour, String type, double pricePaid, double sellingPrice) {
        super(material, colour, type, pricePaid, sellingPrice);
    }

    public String sound() {
        return "Drums playing";
    }
}
