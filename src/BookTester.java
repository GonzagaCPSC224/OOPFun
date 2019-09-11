// javadoc is a tool for generating code documentation
// it parses your source code and generates html webpage files
// ex: google oracle java api

// two ways to run javadoc
// 1. run from cmd line: javadoc -d doc src/*
// windows src\*
// 2. run from IntelliJ: Tools->Generate Javadoc

// javadoc comments start with /**
// each line * (space)

// each comment has two parts separated by a newline
// part 1: description english
// part 2: tag list

// javadoc for class definitions, some fields (public) fields,
// constructors, and methods

// javadoc is like javac, but for your comments not your source code

/**
 * BookTester is a class that tests the Book class. It makes a few Book objects.
 *
 * @author sprint
 * @version 1.0
 */
public class BookTester {
    /**
     * main() is the main method for the BookTester class.
     *
     * @param args not used in this program
     */
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
