/**********************************************
 Workshop 1 Task 2
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
/**
 * All the code for this taske has been coded in the main file
 * The code will first take enter as an input to start the game.
 * */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press enter to roll the dice!");
        scan.nextLine();
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);
        int sum = dice1 + dice2;
        int point;
        System.out.println("You rolled " + dice1 + " + "+dice2 + " = " + sum);
        if(sum == 2 || sum == 3 || sum == 12){
            System.out.println("Craps, Better Luck Next Time, You lose");
        }
        else if(sum == 7 || sum == 11){
            System.out.println("Congratulations, You win");
        }
        else{
            point = sum;
            System.out.println("Point is (established) set to " + point);
            sum = 0;
            while(sum != point && sum != 7){
                System.out.println("Press enter to roll the dice!");
                scan.nextLine();
                dice1 = (int)(Math.random() * 6 + 1);
                dice2 = (int)(Math.random() * 6 + 1);
                sum = dice1 + dice2;
                System.out.println("You rolled " + dice1 + " + "+dice2 + " = " + sum);
                if(sum == point){
                    System.out.println("Congratulations, You Win");
                }
                else if (sum == 7){
                    System.out.println("Craps, Better Luck Next Time, You lose");
                }
            }
        }
    }

}
