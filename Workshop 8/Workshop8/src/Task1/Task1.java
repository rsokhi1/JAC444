/**********************************************
 Workshop 8 Task1
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 29-07-2022
 **********************************************/
package Task1;

import java.security.SecureRandom;
import java.util.*;
/**
 * This program will generate a linked list object of integer type and will populate it with 25 random integers and will sort them and print it's sum and average
 * */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 101;
        String flag = "";
        while (!flag.contains("q")) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < 25; i++) {
                linkedList.add(rand.nextInt(upperbound));
            }

            Collections.sort(linkedList, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            System.out.print("Sorted list: ");
            System.out.println(linkedList);

            int sum = 0;
            for(Integer i : linkedList){
                sum += i;
            }
            System.out.println("Sum of all elements is: " + sum);

            System.out.printf("The average of all the elements is: %.2f", sum / 25.00);

            System.out.println();
            System.out.print("Press enter to run again or enter 'q' to quit: ");
            flag = scan.nextLine();
        }

    }

}
