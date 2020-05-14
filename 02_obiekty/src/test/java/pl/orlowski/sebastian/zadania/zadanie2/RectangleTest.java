package pl.orlowski.sebastian.zadania.zadanie2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle rectangle;
    private Rectangle rectangle2;

    @Before
    public void setUp() {
        rectangle = new Rectangle(3,4);
        rectangle2 = new Rectangle(9, 5);
    }

    @Test
    public void isFieldEquals12() {
        Assert.assertEquals(12.0, rectangle.fieldOfRectangle(), 0.01);
    }

    @Test
    public void isFieldNotEquals100() {
        Assert.assertNotEquals(100.0, rectangle.fieldOfRectangle(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isFieldNull() {
        Rectangle rectangle1 = new Rectangle(1,0);
    }

    @Test
    public void circuitResultIs14() {
        assertEquals(14,rectangle.circuitOfRectangle(), 0.01);
    }

    @Test
    public void circuitResultIsnt100() {
        assertNotEquals(100, rectangle.fieldOfRectangle(), 0.01);
    }

    @Test
    public void diagonalOfRectangleIf5And9() {
      Assert.assertEquals(10.3, rectangle2.diagonalOfRectangle(), 0.01);
    }

    @Test
    public void diagonalOfrectangleIf3And4() {
       Assert.assertEquals(5, rectangle.diagonalOfRectangle(), 0.01);
    }
}