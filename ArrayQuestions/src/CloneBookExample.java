

public class CloneBookExample implements Cloneable {
    private String title;
    private String author;
    private int year;

    public CloneBookExample(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // override the toString method
    @Override
    public String toString() {
        return "Title :: " + title + " Author :: " + author + " Year :: " + year;
    }

    // override the clone method
    @Override
    public CloneBookExample clone() {
        try {
            return (CloneBookExample) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // override the equals method
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CloneBookExample other)) {
            return false;
        }

        return this.author.equals(other.getAuthor()) && this.title.equals(other.getTitle()) && this.year == other.getYear();
    }


    public static void main(String[] args) {
        // Create a Book object and print its details
        CloneBookExample book1 = new CloneBookExample(
                "The Hitchhiker's Guide to the Galaxy",
                "Douglas Adams", 1979);
        System.out.println(book1);

        // Create a clone of the Book object and print its
        // details
        CloneBookExample book2 = book1.clone();
        System.out.println(book2);

        // Check if the two objects are equal
        System.out.println("book1 equals book2: "
                + book1.equals(book2));

        // Get the hash code of the two objects
        System.out.println("book1 hash code: "
                + book1.hashCode());
        System.out.println("book2 hash code: "
                + book2.hashCode());

        // Set book1 to null to trigger garbage collection
        // and finalize method
        book1 = null;

    }
}
