import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    private final Triangle triangle = new Triangle(2.0, 2.0, 4.0);

    @Test
    void getArea_shouldPrintCorrectMessage(){
        assertEquals("getArea() called for: Triangle(x=2.0, y=2.0, z=4.0)", triangle.getArea());
    }

    @Test
    void getDiameter_shouldPrintCorrectMessage(){
        assertEquals("getDiameter() called for shape: Triangle(x=2.0, y=2.0, z=4.0)", triangle.getDiameter(triangle));
    }
}