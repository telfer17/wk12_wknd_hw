import Other.Drumstick;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumstickTest {

    Drumstick drumstick;

    @Before
    public void setup(){
        drumstick = new Drumstick("stick", 2, 4);
    }

    @Test
    public void canGetName() {
        assertEquals("stick", drumstick.getName());
    }

    @Test
    public void canGetPricePaid() {
        assertEquals(2.00, drumstick.getPricePaid());
    }

    @Test
    public void canSetPricePaid() {
        drumstick.setPricePaid(1.00);
        assertEquals(1.00, drumstick.getPricePaid());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(4.00, drumstick.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        drumstick.setSellingPrice(5.00);
        assertEquals(5.00, drumstick.getSellingPrice());
    }
}
