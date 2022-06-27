/**********************************************
 Workshop 1 Task 3
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 31-05-2022
 **********************************************/

import java.util.Random;
import java.util.Scanner;

public class Task3 {

/**
 * The whole game and the conditions have been coded in this main function except
 * the chatter function which gives appropriate message for the condition.
 * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bankBalance = 1000;
        int wager = -1;
        String chat;
        Craps crap = new Craps();
        while(wager != 0 && bankBalance != 0) {
            System.out.println("Enter a wager (Enter 0 to quit!): ");
            wager = scan.nextInt();
            if(wager == 0){
                break;
            }
            if (wager > bankBalance) {
                while (wager > bankBalance) {
                    System.out.println("Wager cannot be more than bankbalance(" + bankBalance + ")");
                    System.out.print("> ");
                    wager = scan.nextInt();
                }
            }
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int sum = dice1 + dice2;
            int point;
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            if (sum == 2 || sum == 3 || sum == 12) {
                chat = crap.chatter(0);
                System.out.println(chat);
                bankBalance -= wager;
            } else if (sum == 7 || sum == 11) {
                chat = crap.chatter(1);
                System.out.println(chat);
                bankBalance += wager;
            } else {
                point = sum;
                System.out.println("Point is (established) set to " + point);
                sum = 0;
                scan.nextLine();
                while (sum != point && sum != 7) {
                    System.out.println("Press enter to roll the dice!");
                    scan.nextLine();
                    dice1 = (int) (Math.random() * 6 + 1);
                    dice2 = (int) (Math.random() * 6 + 1);
                    sum = dice1 + dice2;
                    System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                    if (sum == point) {
                        chat = crap.chatter(1);
                        System.out.println(chat);
                        bankBalance += wager;
                    } else if (sum == 7) {
                        chat = crap.chatter(0);
                        System.out.println(chat);
                        bankBalance -= wager;
                    }
                }
            }
            if(bankBalance == 0){
                System.out.println("Sorry, you busted! Your bankbalance = " + bankBalance);
            }
            else {
                System.out.println("Bankbalance = " + bankBalance);
            }
        }
    }
}

