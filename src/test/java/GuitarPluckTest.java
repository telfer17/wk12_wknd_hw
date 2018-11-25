import Other.GuitarPluck;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarPluckTest {

    GuitarPluck pluck;

    @Before
    public void setup(){
        pluck = new GuitarPluck("pluck", 10, 15);
    }

    @Test
    public void canGetName() {
        assertEquals("pluck", pluck.getName());
    }

    @Test
    public void canGetPricePaid() {
        assertEquals(10.00, pluck.getPricePaid());
    }

    @Test
    public void canSetPricePaid() {
        pluck.setPricePaid(12.00);
        assertEquals(12.00, pluck.getPricePaid());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(15.00, pluck.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        pluck.setSellingPrice(20.00);
        assertEquals(20.00, pluck.getSellingPrice());
    }
}
