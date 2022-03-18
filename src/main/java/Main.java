public class Main {
    public static void main(String[] args) {

        var point = new Point(1.0,1.0);
        point.distance(point);

        var circle = new Circle(point, 2.0);
        circle.getArea();
        circle.getDiameter(circle);

       var section = new Section(1.24,1.24);
       section.getArea();
       section.getDiameter(section);

       var triangle = new Triangle(3.5, 6.0, 6.0);
       triangle.getArea();
       triangle.getDiameter(triangle);
    }
}
