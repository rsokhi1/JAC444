/**********************************************
 Workshop 2 Task 1
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 07-06-2022
 **********************************************/
package Lab2Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SalesSlip m_slip = new SalesSlip();
        int choice = -1;
        while(choice != 0 ) {
            System.out.println("1) Generate random numbers");
            System.out.println("0) Exit");
            System.out.print("> ");
            choice = scan.nextInt();
            if(choice != 0 || choice != 1){
                while(choice != 0 || choice != 1){
                    System.out.println("Value should be 0 or 1");
                    System.out.print("> ");
                    choice = scan.nextInt();
                }
            }
            if (choice == 1) {
                m_slip.getRandomValue();
                m_slip.displayVal();
            } else {
                System.out.println("Thank you! Goodbye.");
            }
        }
    }
}
