/**********************************************
 Workshop 7 Task3
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 21-07-2022
 **********************************************/
package Task3;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * In this task we convert a 2d array into a IntStream and print the average of all the marks.
 * */

public class Task3 {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};
        IntStream stream = Arrays.stream(gradesArray).flatMapToInt(x -> Arrays.stream(x));

        System.out.println(stream.average());
    }
}
