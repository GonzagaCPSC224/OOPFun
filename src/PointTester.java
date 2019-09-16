import java.util.Arrays;

public class PointTester {
    public static void main(String[] args) {
        Circle.Point origin = new Circle.Point(); // Math.PI
        System.out.println(origin);

        // array of references
        Circle.Point[] points = new Circle.Point[5];
        // NO Point objects were just made!!

        for (int i = 0; i < points.length; i++) {
            points[i] = new Circle.Point(i, i); // actually make a Point object
        }
        System.out.println(Arrays.toString(points));

    }

    // task 3: in the same project
    // create a Circle class and a CircleTester
    // Circle has radius (double) and center (Point)
    // "has-a" relationship -> composition
    // "is-a" relationship -> inheritance
}
