class Library {
    class Book {
        String title;

        Book(String title) {
            this.title = title;
        }

        void show() {
            System.out.println("Book: " + title);
        }
    }
}

public class Main10 {
    public static void main(String[] args) {
        Library lib = new Library();
        Library.Book book = lib.new Book("Java Basics");
        book.show();
    }
}