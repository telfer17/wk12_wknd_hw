package Other;

import Behaviours.ISell;

public class Items implements ISell {

    private String name;
    private double pricePaid;
    private double sellingPrice;

    public Items(String name, double pricePaid, double sellingPrice) {
        this.name = name;
        this.pricePaid = pricePaid;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
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

    public double calculateProfit() {
        return this.sellingPrice - this.pricePaid;
    }
}
