public class BookTester {
    public static void main(String[] args) {
        // a tester (AKA driver) is a program that exercises some code
        // test our Book class... run some constructors, some methods, etc.

        // make a book!
        Book bookOne = new Book();
        System.out.println(bookOne); // whenever a string representation of
        // an object is needed, toString() is implicitly called
        // recall Object is the superclass (directly or indirectly) of every
        // class, including our Book!!

        Book bookTwo = new Book("HP1", "JK Rowling", 275);
        System.out.println(bookTwo);
        System.out.println(bookTwo.getTitle());
    }
}
