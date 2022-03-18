import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void distance_shouldReturnCorrectMessage(){
        var point = new Point(1.0, 1.0);
        assertEquals("distance() called for: Point[x=1.0, y=1.0]", point.distance(point));
    }
}
