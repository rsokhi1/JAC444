/**********************************************
 Workshop 1 Task 1
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 31-05-2022
 **********************************************/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Cryptography m_crypt = new Cryptography();
        int choice = -1;
        Scanner scan = new Scanner(System.in);
        while(choice != 0) {
            int val;
            System.out.println("1) Encrypt");
            System.out.println("2) Decrypt");
            System.out.println("0) Exit");
            System.out.print("> ");
            choice = scan.nextInt();
            if(choice > 2 || choice < 0){
                while(choice > 2 || choice < 0){
                    System.out.println("Value must be between 0 and 2!");
                    System.out.printf("> ");
                    choice = scan.nextInt();
                }
            }

            if(choice == 1){
                val = m_crypt.readData("Enter number: ",true,'E');
                val = m_crypt.encryptData(val);
                System.out.println("Encrypted value: " + val);
            }
            else if (choice == 2) {
                val = m_crypt.readData("Enter number: ",true,'D');
                val = m_crypt.decryptData(val);
                System.out.println("Decrypted value: " + val);
            }
            else if (choice == 0){
                System.out.println("Thank you! Have a good day!");
            }
        }
    }
}
