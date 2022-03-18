import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public non-sealed class Section extends Polygon{

    private Point pointX = new Point(1.0, 1.0);
    private  Point pointY = new Point(4.0, 4.0);

    @Override
    public String getArea() {
        var result = String.format("getArea() called for: %s", this.toString());
        System.out.println(result);
        return result;
    }
}
