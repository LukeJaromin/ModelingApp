import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private final Point point = new Point(1.0, 1.0);
    private final Circle circle = new Circle(point, 2.5);

    @Test
    void getArea_shouldPrintCorrectMessage(){
        assertEquals("getArea() called for: Circle[p=Point[x=1.0, y=1.0], rad=2.5]", circle.getArea());
    }

    @Test
    void getDiameter_shouldPrintCorrectMessage(){
           assertEquals("getDiameter() called for shape: Circle[p=Point[x=1.0, y=1.0], rad=2.5]", circle.getDiameter(circle));
    }
}