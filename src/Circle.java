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

    // NESTED CLASSES
    // a class defined inside the definition of another class
    // a class that contains another class is called "outer" or "enclosing" class
    // outer classes: they can be public or package-private

    // 4 types of nested classes
    // 1. static nested class (we are gonna make Point a static nested class of Circle)
    // 2. non-static nested class (inner class)
    // 3. local inner class (non-static nested class that is defined inside of a method)
    // 4. anonymous local class (non-static nested class defined inside a method with no name)

    // example of 1. static nested
    public static class Point {
        private int x;
        private int y;

        public Point() {
            x = 0;
            y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
