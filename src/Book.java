public class Book {
    // class: a collection of state and behavior that completely describes something
    // state: fields (AKA attributes)
    // behavior: methods

    // object: an instance of a class
    // a class like a blueprint and an object as a realization of that blueprint

    // fields
    private String title;
    private String author;
    private int numPages;

    // constructors
    // we get a default value constructor (DVC) for free
    // explicit value constructor (EVC)
    public Book(String title, String paramAuthor, int paramNumPages) {
        // this refers to the invoking object
        // in a constructor, this refers to the object being created
        this.title = title; // shadowing... the parameter title shadows the field title
        this.author = paramAuthor;
        this.numPages = paramNumPages;
    }

    // when we define our own constructor, we lose our free DVC
    // DVC
    public Book() {
        title = "BLANK TITLE";
        author = "BLANK AUTHOR";
        numPages = -1;
    }

    // we inherit several useful methods from Object
    // toString()
    // we will override the toString() we inherit from Object

    // ANNOTATIONS
    // metadata/metainformation used by the compiler and IDE
    // not part of the source code
    // @Override @Deprecated @SuppressWarnings
    // don't affect execution of your program

    @Override
    public String toString() {
        // returns a string representation of the object
        return title + " by " + author;
    }

    // access modifiers
    // 1. public (accessible anywhere)
    // 2. package-private (accessible within the package)
    // 3. protected (package-private plus accessible from any subclass (even diff package)
    // 4. private (accessible from this class only)

    // getters and setters
    // you should control access to your class members
    // getter (AKA accessor)
    public String getTitle() {
        // example: when main() calls bookTwo.getTitle()
        // this refers to the same object as bookTwo refers to
        return this.title;
    }

    // setter (AKA mutator)
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    // task 1: define getters and setters for author and numPages
    // Generate code shortcut
    // mac cmd + N windows alt + ins

    // override methods
    // ctrl + o

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // task 2: in this project...
    // create a Point class and a PointTester class
    // a Point represents a point in 2D space
    // x and y
    // toString() example: (0, 0)
    // PointTester should test out your constructors and methods of Point

}
