package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book js = new Book("JS", 1000);
        Book java = new Book("Java", 1200);
        Book cos = new Book("CacheObjectScript", 6300);
        Book cleanCode  = new Book("Clean code", 18);
        Book[] books = {js, java, cos, cleanCode};
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + ": " + book.getCountPage());
        }
        System.out.println();
        System.out.println("revert 0: 3;");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book book: books) {
            System.out.println(book.getName() + ": " + book.getCountPage());
        }
        System.out.println();
        System.out.println("only Clean code;");
        for (Book book: books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + ": " + book.getCountPage());
            }
        }

    }
}
