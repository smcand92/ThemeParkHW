import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlcoholStallTest {

    AlcoholStall alcoholStall;

    @Before
    public void before(){
        alcoholStall = new AlcoholStall("Moe's", "Moe", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Moe's", alcoholStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Moe", alcoholStall.getOwner());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, alcoholStall.getParkingSpot());
    }

    @Test
    public void hasPriceForVisitor(){
        assertEquals(6.60, alcoholStall.priceForVisitor(), 0.01);
    }
}
