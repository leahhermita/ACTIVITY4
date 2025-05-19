/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author User
 */
// Library.java
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void loanBook(Book book, int loanCount) {
        book.decrementCopies(loanCount);
    }

    public void displayLibrary() {
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

