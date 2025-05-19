/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

/**
 *
 * @author User
 */
// BankTest.java
public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("A001", 1000);
        BankAccount acc2 = new BankAccount("A002", 500);
        
        System.out.println("Before Transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        Bank bank = new Bank();
        bank.transferMoney(acc1, acc2, 300);

        System.out.println("After Transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}
