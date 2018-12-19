import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;
    Visitor visitor;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Andy's Candy Floss", "Andy", 2);
        visitor = new Visitor(20, 160, 80.00);
    }

    @Test
    public void hasName(){
        assertEquals("Andy's Candy Floss", candyFlossStall.getName());
    }

    @Test
    public void getOwner(){
        assertEquals("Andy", candyFlossStall.getOwner());
    }

    @Test
    public void getParkingSpot(){
        assertEquals(2, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasPriceForVisitor(){
        assertEquals(4.20, candyFlossStall.priceFor(visitor), 0.01);
    }
}
