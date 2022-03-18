import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SectionTest {

    private final Section section = new Section(2.0, 2.0);

    @Test
    void getArea_shouldPrintCorrectMessage(){
        assertEquals("getArea() called for: Section(x=2.0, y=2.0)", section.getArea());
    }

    @Test
    void getDiameter_shouldPrintCorrectMessage(){
        assertEquals("getDiameter() called for shape: Section(x=2.0, y=2.0)", section.getDiameter(section));
    }
}
