import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar("Wood", "Brown", "String", 50, 75, 5);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void canSetColour() {
        guitar.setColour("Black");
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetPricePaid() {
        assertEquals(50.00, guitar.getPricePaid());
    }

    @Test
    public void canSetPricePaid() {
        guitar.setPricePaid(60.00);
        assertEquals(60.00, guitar.getPricePaid());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(75.00, guitar.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        guitar.setSellingPrice(100.00);
        assertEquals(100.00, guitar.getSellingPrice());
    }

    @Test
    public void canGetStrings() {
        assertEquals(5, guitar.getStrings());
    }

    @Test
    public void canSetStrings() {
        guitar.setStrings(6);
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Guitar playing", guitar.sound());
    }
}
