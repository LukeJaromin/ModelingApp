public record Circle(Point p, double rad) implements Shape {

    public Circle {
        if (rad < 0) {
            throw new IllegalArgumentException("Negatives not allowed");
        }
    }

    @Override
    public String getArea() {
        var result = String.format("getArea() called for: %s", this.toString());
        System.out.println(result);
        return result;
    }
}
