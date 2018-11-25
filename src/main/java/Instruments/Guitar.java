package Instruments;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(String material, String colour, String type, double pricePaid, double sellingPrice, int strings) {
        super(material, colour, type, pricePaid, sellingPrice);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String sound(){
        return "Guitar playing";
    }
}
