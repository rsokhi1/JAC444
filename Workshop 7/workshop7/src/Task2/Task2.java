/**********************************************
 Workshop 7 Task2
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 21-07-2022
 **********************************************/
package Task2;

import java.security.SecureRandom;
import java.util.stream.IntStream;
/**
 * In this task we generate 50 numbers ranging from 1 - 999 and store them in an IntStream and just print the numbers that are odd with the help of filter and sorted
 * */
public class Task2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        IntStream intStream = secureRandom.ints(50,1,1000);

        intStream.sorted().forEach(i->{
            if(i % 2 != 0){
                System.out.println(i);
            }
        });
    }
}
