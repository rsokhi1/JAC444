/**********************************************
 Workshop 8 Task2
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 29-07-2022
 **********************************************/
package Task2;

import java.util.*;


    /**
     * In this program handles taking an input from the user and then checking if the number is prime or not and if it is not we will display it's factors.
     * */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> factors = new HashSet<>();
        int num = 0;
        System.out.print("Enter an integer and -1 to quit: ");
        num = scan.nextInt();
        while (num != -1){
            factors.clear();
            for(int i = 1;i<=num;i++){
                if(num % i == 0){
                    factors.add(i);
                }
            }
            ArrayList<Integer> al = new ArrayList<>(factors);
            Collections.sort(al);

            if(factors.size() > 2){
                System.out.println("Factors of " + num + " are : " + al);
            }
            else{
                System.out.println(num + " is a prime number");
            }
            System.out.print("Enter an integer and -1 to quit: ");
            num = scan.nextInt();
        }

    }
}
