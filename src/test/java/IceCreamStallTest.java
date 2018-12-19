import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Big Licks", "Bob", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Big Licks", iceCreamStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Bob", iceCreamStall.getOwner());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasPriceForVisitor(){
        assertEquals(2.80, iceCreamStall.priceForVisitor(), 0.01);
    }
}
