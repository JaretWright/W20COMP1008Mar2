import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getLength() {
        Rectangle rect = new Rectangle(10,32);
        assertEquals(10, rect.getLength(), 0.0);
    }

    @Test
    public void setLengthInvalid() {
        try{
            Rectangle rect = new Rectangle(10,32);
            rect.setLength(-10);
            fail("length of 0 or less should trigger an exception");
        } catch (IllegalArgumentException e)
        {
            System.out.println("invalid length message: "+e.getMessage());
        }
    }

    @Test
    public void setLengthValid() {
        Rectangle rect = new Rectangle(10,32);
        rect.setLength(15);
        double expResult = 15;
        assertEquals(expResult, rect.getLength(),0.0);
    }

    @Test
    public void getWidth() {
    }

    @Test
    public void setWidth() {
    }
}