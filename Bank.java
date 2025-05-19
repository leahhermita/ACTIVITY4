/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

/**
 *
 * @author User
 */
// Bank.java
public class Bank {
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        if (from.balance >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
        } else {
            System.out.println("Transfer failed: insufficient funds in " + from.accountNumber);
        }
    }
}
