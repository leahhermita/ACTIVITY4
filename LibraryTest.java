/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author User
 */
// LibraryTest.java
public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 3);
        Book b2 = new Book("Brave New World", "Aldous Huxley", 2);

        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("Library Inventory Before Loan:");
        lib.displayLibrary();

        lib.loanBook(b1, 1);

        System.out.println("Library Inventory After Loan:");
        lib.displayLibrary();
    }
}

