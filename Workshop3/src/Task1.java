/**********************************************
 Workshop 3 Task 1
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 15-06-2022
 **********************************************/
import java.util.Scanner;

public class Task1 {
    /**
     * All the tests have been conducted in the main function
     * */
    public static void main(String[] args) {
        int int1;
        Scanner scan = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("Test for integer value saved in the class");
        System.out.println("********************************************");
        System.out.print("Enter the first Integer: ");
        int1 = scan.nextInt();
        MyInteger intVal = new MyInteger(int1);

        System.out.println("Val in MyInteger: " + intVal.getVal());

        System.out.println("Is the integer even?");
        System.out.println(intVal.isEven());

        System.out.println("Is the integer odd?");
        System.out.println(intVal.isOdd());

        System.out.println("Is the integer prime?");
        System.out.println(intVal.isPrime());

        System.out.println("********************************************");
        System.out.println("Test for passing int values to the static functions");
        System.out.println("********************************************");
        System.out.print("Enter an integer: ");
        int1 = scan.nextInt();

        System.out.println("Is the integer even?");
        System.out.println(intVal.isEven(int1));

        System.out.println("Is the integer odd?");
        System.out.println(intVal.isOdd(int1));

        System.out.println("Is the integer prime?");
        System.out.println(intVal.isPrime(int1));

        System.out.println("Is " + intVal.getVal() + " and " + int1 + " equal?");
        System.out.printf("%s\n",intVal.equals(int1) ? "Yes" : "No");

        System.out.println("********************************************");
        System.out.println("Test for passing MyInteger object to the static functions");
        System.out.println("********************************************");
        System.out.print("Enter an integer value: ");
        int1 = scan.nextInt();
        MyInteger intObj = new MyInteger(int1);

        System.out.println("Is the integer even?");
        System.out.println(intVal.isEven(intObj));

        System.out.println("Is the integer odd?");
        System.out.println(intVal.isOdd(intObj));

        System.out.println("Is the integer prime?");
        System.out.println(intVal.isPrime(intObj));

        System.out.println("Is " + intVal.getVal() + " and " + intObj.getVal() + " equal?");
        System.out.printf("%s\n",intVal.equals(intObj) ? "Yes" : "No");

        System.out.println("********************************************");
        System.out.println("Test for parseInt");
        System.out.println("********************************************");
        scan.nextLine();
        System.out.print("Enter any integer: ");
        String str_c = scan.nextLine();
        char[] c_str = new char[str_c.length()];
        for(int i = 0 ;i < str_c.length();i++){
            c_str[i] = str_c.charAt(i);
        }
        System.out.println("Character string to integer: " + intVal.parseInt(c_str));

        System.out.print("Enter any integer: ");
        String str = scan.nextLine();

        System.out.println("String to integer: " +intVal.parseInt(str));

    }
}
