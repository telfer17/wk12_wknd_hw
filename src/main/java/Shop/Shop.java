package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int getStockAmount(){
        return this.stock.size();
    }

    public void addItem(ISell iSell){
        this.stock.add(iSell);
    }

    public void removeItem(ISell iSell){
        this.stock.remove(iSell);
    }

    public double calculateTotalProfit(){
        double totalProfit = 0;

        for(ISell iSell: stock){
            totalProfit += iSell.calculateProfit();
        }
        return totalProfit;
    }
}
