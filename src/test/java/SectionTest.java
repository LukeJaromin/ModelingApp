import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SectionTest {
    private Point pointX = new Point(1.0, 1.0);
    private Point pointY = new Point(2.0, 6.0);
    private final Section section = new Section(pointX, pointY);

    @Test
    void getArea_shouldPrintCorrectMessage(){
        assertEquals("getArea() called for: Section(pointX=Point[x=1.0, y=1.0], pointY=Point[x=2.0, y=6.0])", section.getArea());
    }

    @Test
    void getDiameter_shouldPrintCorrectMessage(){
        assertEquals("getDiameter() called for shape: Section(pointX=Point[x=1.0, y=1.0], pointY=Point[x=2.0, y=6.0]) ", section.getDiameter(section));
    }
}
