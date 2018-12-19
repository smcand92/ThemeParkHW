import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(20, 160, 200);
    }

    @Test
    public void hasAge(){
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(160, visitor.getHeight());
    }

    @Test
    public void hasWallet(){
        assertEquals(200, visitor.getWallet(), 0);
    }
}
