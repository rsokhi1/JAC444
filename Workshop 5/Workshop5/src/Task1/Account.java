/**********************************************
 Workshop 5 Task 1
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 11-07-2022
 **********************************************/
package Task1;

import java.io.Serializable;

/**
 * This is the account class and this class holds the functionalities and properties of a bank account
 * */
public class Account implements Serializable {

    private int accNumber;
    private String fname;
    private String lname;
    private double balance;

    public Account(){
        this(0,"","",0.0);
    }

    public Account(int accNumber, String fname, String lname, double balance) {
        this.accNumber = accNumber;
        this.fname = fname;
        this.lname = lname;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void combine(TransactionRecord tr){
        this.balance = tr.getAmount() + this.balance;
    }
}
