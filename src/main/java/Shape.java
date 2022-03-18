public sealed interface Shape permits Circle, Polygon {

    String getArea();

    default String getDiameter(Shape shape){
        return switch(shape){
            case Circle circle -> getResult(circle);

            case Section section -> getResult(section);

            case Triangle triangle -> getResult(triangle);
        };
    }

    private String getResult(Shape shape){
        var result = String.format("getDiameter() called for shape: %s", shape.toString());
        System.out.println(result);
        return result;
    }
}
