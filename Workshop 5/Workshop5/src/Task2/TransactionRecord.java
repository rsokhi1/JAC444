/**********************************************
 Workshop 5 Task 2
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 11-07-2022
 **********************************************/
package Task2;

import java.io.Serializable;

/**
 * This class is stores the data of transactions.
 * */
public class TransactionRecord implements Serializable {
    private int accountNumber;
    private double amount;

    public TransactionRecord(){
        this.accountNumber = -1;
        this.amount = 0.0;
    }

    public TransactionRecord(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
