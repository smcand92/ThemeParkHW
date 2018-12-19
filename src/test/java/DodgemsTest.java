import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("The Dodgems");
        visitor = new Visitor(20, 160, 80.00);
    }

    @Test
    public void hasName(){
        assertEquals("The Dodgems", dodgems.getName());
    }

    @Test
    public void hasPriceFor(){
        assertEquals(4.50, dodgems.priceFor(visitor), 0.01);
    }
}
