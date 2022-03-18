public record Circle(Point p, double rad) implements Shape{

    public Circle(Point p, double rad){
        if(rad < 0){
            throw new IllegalArgumentException("Negatives not allowed");
        }
        this.p = p;
        this.rad = rad;
    }

    @Override
    public String getArea() {
        var result = String.format("getArea() called for: %s", this.toString());
        System.out.println(result);
        return result;
    }
}
