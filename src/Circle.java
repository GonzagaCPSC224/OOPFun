public class Circle {
    // fields
    private Point center;
    private double radius;

    // constructors
    public Circle() {
        this.center = new Point();
        this.radius = 1.0;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // convenience constructor
    public Circle(int x, int y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
