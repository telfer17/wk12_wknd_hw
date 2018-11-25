import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void setup(){
        drum = new Drum("Steel", "Black", "Percussion", 100, 140);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Steel", drum.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", drum.getColour());
    }

    @Test
    public void canSetColour() {
        drum.setColour("White");
        assertEquals("White", drum.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("Percussion", drum.getType());
    }

    @Test
    public void canGetPricePaid() {
        assertEquals(100.00, drum.getPricePaid());
    }

    @Test
    public void canSetPricePaid() {
        drum.setPricePaid(80.00);
        assertEquals(80.00, drum.getPricePaid());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(140.00, drum.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        drum.setSellingPrice(150.00);
        assertEquals(150.00, drum.getSellingPrice());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Drums playing", drum.sound());
    }
}
