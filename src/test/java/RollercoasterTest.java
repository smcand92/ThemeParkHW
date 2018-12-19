import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Nemesis");
    }

    @Test
    public void hasName(){
        assertEquals("Nemesis", rollercoaster.getName());
    }

    @Test
    public void hasPriceForVisitor(){
        assertEquals(8.40, rollercoaster.priceForVisitor(), 0.01);
    }
}
