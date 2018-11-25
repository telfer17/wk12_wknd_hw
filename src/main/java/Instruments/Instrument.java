package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private String type;
    private double pricePaid;
    private double sellingPrice;

    public Instrument(String material, String colour, String type, double pricePaid, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.pricePaid = pricePaid;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public double getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(double pricePaid) {
        this.pricePaid = pricePaid;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateProfit(){
        return this.sellingPrice - this.pricePaid;
    }
}
