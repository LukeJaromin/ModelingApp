public record Point(double x, double y) {

    public String distance(Point point){
        var result = String.format("distance() called for: %s", point.toString());
        System.out.println(result);
        return result;
    }
}
