/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author User
 */
// Book.java
public class Book {
    String title;
    String author;
    int copies;

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public void displayInfo() {
        System.out.println(title + " by " + author + " - Copies: " + copies);
    }

    public void decrementCopies(int count) {
        if (copies >= count) {
            copies -= count;
        } else {
            System.out.println("Not enough copies available for: " + title);
        }
    }
}

