import Instruments.Drum;
import Instruments.Guitar;
import Other.Drumstick;
import Other.GuitarPluck;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drum drum;
    GuitarPluck pluck;
    Drumstick drumstick;

    @Before
    public void setup(){
        shop = new Shop("David's Shop");

        guitar = new Guitar("Wood", "Brown", "String", 50, 80, 5);
        drum = new Drum("Steel", "Black", "Percussion", 100, 140);
        pluck = new GuitarPluck("pluck", 10, 20);
        drumstick = new Drumstick("stick", 2, 4);

        shop.addItem(guitar);
        shop.addItem(drum);
        shop.addItem(pluck);
    }

    @Test
    public void canGetName() {
        assertEquals("David's Shop", shop.getName());
    }

    @Test
    public void canGetStockAmount() {
        assertEquals(3, shop.getStockAmount());
    }

    @Test
    public void canAddItems() {
        shop.addItem(drumstick);
        assertEquals(4, shop.getStockAmount());
    }

    @Test
    public void canRemoveItem() {
        shop.removeItem(pluck);
        assertEquals(2, shop.getStockAmount());
    }

    @Test
    public void CanCalculateProfit() {
        assertEquals(80.00, shop.calculateTotalProfit());
    }
}
