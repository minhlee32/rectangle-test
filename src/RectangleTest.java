import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        double width = 4;
        double height = 40;
        double expected = 160.0;
        Rectangle rectangle = new Rectangle(width,height);

        double result = rectangle.getArea(width,height);
        assertEquals(expected,result);
    }


    @Test
    void getPerimeter() {
        double width = 4;
        double height = 40;
        double expected = 88.0;
        Rectangle rectangle = new Rectangle(width,height);

        double result = rectangle.getPerimeter(width,height);
        assertEquals(expected,result);
    }

    @Test
    void getArea1() {
        double width = 3.5;
        double height = 35.9;
        double expected = 125.64999999999999;
        Rectangle rectangle = new Rectangle(width, height);

        double result = rectangle.getArea(width, height);
        assertEquals(expected, result);
    }

    @Test
    void getPerimeter1() {
        double width = 3.5;
        double height = 35.9;
        double expected = 78.8;
        Rectangle rectangle = new Rectangle(width, height);

        double result = rectangle.getPerimeter(width, height);
        assertEquals(expected, result);
    }
}