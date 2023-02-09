/**********************************************
 Workshop 7 Task1
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 21-07-2022
 **********************************************/
package Task1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
/**
 * In this task we create lambda function with the help of an Interface.
 * */
public class task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of values you want to enter: ");
        int size = scan.nextInt();
        double[] array = new double[size];
        for (int i = 0;i<size;i++){
            System.out.println("Enter the value for index(" +  (i+1) +"): ");
            array[i] = scan.nextDouble();
        }
        DoubleArrayFunctions maxValLam = maxVal();
        DoubleArrayFunctions minValLam = minVal();
        DoubleArrayFunctions sumLam = sumOfAllNum();
        DoubleArrayFunctions avgValLam = average();

        System.out.print("Max value from the array: ");
        System.out.println(maxValLam.applyDouble(array));
        System.out.print("Min value from the array: ");
        System.out.println(minValLam.applyDouble(array));
        System.out.print("Sum of all array members: ");
        System.out.printf("%.2f\n",sumLam.applyDouble(array));
        System.out.print("Average of all array members: ");
        System.out.printf("%.2f\n",avgValLam.applyDouble(array));

        System.out.println();
        System.out.print("Enter the number whose occurence you want to check: ");
        double num = scan.nextDouble();
        DoubleArrayFunctions counterLam = counter(num);
        double count = counterLam.applyDouble(array);
        System.out.printf("%.2f occured %.0f %s",num,count, count == 1 ? "time" : "times");


    }

    /**
     * This return a lambda function that will return the greatest value from the array.
     * */
    public static final DoubleArrayFunctions maxVal(){
        DoubleArrayFunctions func = (x) -> {
            double max = x[0];
            for(int i = 0;i<x.length;i++){
                if(x[i] > max){
                    max = x[i];
                }
            }
            return max;
        };
        return func;
    }

    /**
     * This return a lambda function that will return the smallest value from the array.
     * */
    public static final DoubleArrayFunctions minVal(){
        DoubleArrayFunctions func = (x) -> {
            double min = x[0];
            for(int i = 0;i<x.length;i++){
                if(x[i] < min){
                    min = x[i];
                }
            }
            return min;
        };
        return func;
    }

    /**
     * This return a lambda function that will return the sum of all values from the array.
     * */
    public static final DoubleArrayFunctions sumOfAllNum(){
        DoubleArrayFunctions func = (x) ->{
            double sum = 0;
            for (int i = 0;i<x.length;i++){
                sum += x[i];
            }
            return sum;
        };
        return func;
    }

    /**
     * This return a lambda function that will return the average value of the array.
     * */
    public static final DoubleArrayFunctions average(){
        DoubleArrayFunctions func = (x) ->{
            double avg = 0;
            for(int i = 0;i<x.length;i++){
                avg += x[i];
            }
            return avg/x.length;
        };
        return func;
    }

    /**
     * This return a lambda function that will return the number of times the number sent to the function occures in the array.
     * */
    public static DoubleArrayFunctions counter(double value){
        DoubleArrayFunctions func = (x) ->{
            double count = 0;
            for(int i = 0;i<x.length;i++){
                if(x[i] == value){
                    count++;
                }
            }
            return count;
        };
        return func;
    }
}
