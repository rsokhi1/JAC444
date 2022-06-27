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
import java.text.DecimalFormat;

public class SalesSlip {
    private String m_person[];
    private String m_product[];
    private double m_saleInfo[][];
    private Scanner scan;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     * No arguement constructor initializes the default values for all the member variables.
     * */
    public SalesSlip(){
        m_saleInfo = new double[5][4];
        m_person = new String[4];
        m_product = new String[5];
        scan = new Scanner(System.in);
    }

    /**
     * This function generates random number for the program.
     * */
    public void getRandomValue(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<4;j++){
                m_saleInfo[i][j] = (double)(Math.random() * 1000);
            }
        }
    }


    /**
     * This function displays the values in a tabular form.
     * */
    public void displayVal(){
        System.out.println("Prod/Person      1       2       3       4       Total");
        double prod_total = 0;
        double person_total[] = new double[4];
        for(int i = 0;i<5;i++){
            prod_total = 0;
            System.out.printf("%8d        ",i+1);
            for(int j = 0;j<4;j++){
                System.out.printf(" %-7.2f",m_saleInfo[i][j]);
                prod_total += m_saleInfo[i][j];
                person_total[j] += m_saleInfo[i][j];
            }
            System.out.println(" " + df.format(prod_total));
        }
        System.out.printf("%12s    ","Total");
        for(int i = 0;i<4;i++){
            System.out.printf(" %-7.2f",person_total[i]);
        }
        System.out.println();
    }
}