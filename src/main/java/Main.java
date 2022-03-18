public class Main {
    public static void main(String[] args) {

        var point = new Point(1.0,1.0);
        var pointX = new Point(2.0, 2.0);
        var pointY = new Point(4.0, 4.0);
        point.distance(point);

        var circle = new Circle(point, 2.0);
        circle.getArea();
        circle.getDiameter(circle);

       var section = new Section(pointX, pointY);
       section.getArea();
       section.getDiameter(section);

       var triangle = new Triangle(3.5, 6.0, 6.0);
       triangle.getArea();
       triangle.getDiameter(triangle);
    }
}
