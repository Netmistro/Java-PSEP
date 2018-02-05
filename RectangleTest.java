/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleareaandperimeter;

import rectangleareaandperimeter.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arnoldbradshaw
 */
public class RectangleTest {

    private double width;
    private double height;
    private Rectangle calc = null;

    public RectangleTest() {
    }

    @Before
    public void setUp() {
        width = 5.0;
        height = 6.0;
        calc = new Rectangle(width, height);
    }

    @After
    public void tearDown() {
        width = 0.0;
        height = 0.0;
        calc = null;
    }

    /**
     * Test of areaRectangle method, of class Rectangle.
     */
    @Test
    public void testAreaRectangle() {
        System.out.println("areaRectangle");
        double expResult = 30.0;
        double result = calc.areaRectangle();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of perimeterRectangle method, of class Rectangle.
     */
    @Test
    public void testPerimeterRectangle() {
        System.out.println("perimeterRectangle");
        double expResult = 22.0;
        double result = calc.perimeterRectangle();
        assertEquals(expResult, result, 0.0);
    }

}
