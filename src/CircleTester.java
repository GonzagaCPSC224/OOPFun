public class CircleTester {
    public static void main(String[] args) {
        // we can pass arguments into our program, similar to a function
        // two ways:
        // 1. cmd line: java CircleTester arg1 arg2
        // 2. IntelliJ: Run->Edit Configurations...->Program Arguments

        // lets pass in cmd line args to create a new circle
        // int int double
        // x    y   radius
        System.out.println(args.length);
        // task: create a Circle from the strings in args
        // Integer.parseInt("545");
        // Double.parseDouble("2234.534");

        if (args.length == 3) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            double rad = Double.parseDouble(args[2]);

            Circle c0 = new Circle(x, y, rad);
            System.out.println(c0);
        }
        else {
            System.out.println("Usage: int int double");
        }


        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(new Point(4, -3), 4.77);
        System.out.println(c2);

        // convenience constructor
        Circle c3 = new Circle(5, 346, 3245.36);
        System.out.println(c3.getCenter());

    }
}
