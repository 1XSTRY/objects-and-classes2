public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Andrzej", "Sapkowski");
        Author author2 = new Author("Stephen", "King");

        Book book1 = new Book("Book 1", author1, 2011);
        Book book2 = new Book("Book 2", author2, 2009);

        book1.setPublicationYear(1994);


        System.out.println(book1);
        System.out.println(book2);
    }

}