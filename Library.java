class Book {
    String title;
    String author;
    boolean issued;

    Book(String title, String author) {
        this.title=title;
        this.author=author;
        this.issued=false;
    }

    void issueBook() {
        issued=true;
        System.out.println(title+" issued successfully.");
    }

    void returnBook() {
        issued=false;
        System.out.println(title+" returned successfully.");
    }

    void showBook() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Status: "+(issued?"Issued":"Available"));
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1=new Book("Java Programming", "James Gosling");
        book1.showBook();
        book1.issueBook();
        book1.showBook();
        book1.returnBook();
        book1.showBook();
    }
}


// 10th prg