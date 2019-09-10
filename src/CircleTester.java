public class CircleTester {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(new Point(4, -3), 4.77);
        System.out.println(c2);

        // convenience constructor
        Circle c3 = new Circle(5, 346, 3245.36);
        System.out.println(c3.getCenter());

    }
}
