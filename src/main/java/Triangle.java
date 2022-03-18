import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public non-sealed class Triangle extends Polygon{

    double x;
    double y;
    double z;

    @Override
    public String getArea() {
        var result = String.format("getArea() called for: %s", this.toString());
        System.out.println(result);
        return result;
    }
}
