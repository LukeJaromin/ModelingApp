import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public non-sealed class Section extends Polygon{

    double x;
    double y;

    @Override
    public String getArea() {
        var result = String.format("getArea() called for: %s", this.toString());
        System.out.println(result);
        return result;
    }
}
