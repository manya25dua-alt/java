package Assignment;

public class Book {

    String bookId;
    String title;
    String author;
    boolean issued;

    void assignData(String id, String title, String author) {

        this.bookId = id;
        this.title = title;
        this.author = author;
        issued = false;
    }

    void issueBook() {

        if (!issued) {
            issued = true;
            System.out.println("Book Issued Successfully.");
        }
        else {
            System.out.println("Book Already Issued.");
        }
    }

    void returnBook() {

        if (issued) {
            issued = false;
            System.out.println("Book Returned Successfully.");
        }
        else {
            System.out.println("Book is Already Available.");
        }
    }

    void displayBook() {

        System.out.println("Book ID : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);

        if (issued)
            System.out.println("Status : Issued");
        else
            System.out.println("Status : Available");
    }
}