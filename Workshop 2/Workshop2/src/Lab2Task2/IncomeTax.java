/**********************************************
 Workshop 2 Task 2
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 07-06-2022
 **********************************************/
package Lab2Task2;

import java.util.Scanner;

/**
 * This is the income tax class. This class can be used to calculate tax based on
 * 2001 or 2009 Canadian tax rates.
 * */
public class IncomeTax {
    private int m_filingStatus;
    private int m_intervals[][];
    private int m_intervals01[][];
    private double m_rates[];
    private double m_rates01[];
    private double m_taxableIncome;
    private Scanner scan;

    /**
     * The no arguement constructor initializes the value to all the intervals and the tax rates that will be needed
     * in future in this program.
     * */
    public IncomeTax(){
        m_intervals = new int[4][5];
        m_intervals01 = new int[4][4];
        m_rates = new double[6];
        m_rates01 = new double[5];
        scan = new Scanner(System.in);
        m_intervals[0][0] = 8350;
        m_intervals[0][1] = 33950;
        m_intervals[0][2] = 82250;
        m_intervals[0][3] = 171550;
        m_intervals[0][4] = 372950;

        m_intervals[1][0] = 16700;
        m_intervals[1][1] = 67900;
        m_intervals[1][2] = 137050;
        m_intervals[1][3] = 208850;
        m_intervals[1][4] = 372950;


        m_intervals[2][0] = 8350;
        m_intervals[2][1] = 33950;
        m_intervals[2][2] = 68525;
        m_intervals[2][3] = 104425;
        m_intervals[2][4] = 186475;

        m_intervals[3][0] = 11950;
        m_intervals[3][1] = 45500;
        m_intervals[3][2] = 117450;
        m_intervals[3][3] = 190200;
        m_intervals[3][4] = 372950;

        m_rates[0] = 0.10;
        m_rates[1] = 0.15;
        m_rates[2] = 0.25;
        m_rates[3] = 0.28;
        m_rates[4] = 0.33;
        m_rates[5] = 0.35;

        m_intervals01[0][0] = 27050;
        m_intervals01[0][1] = 65550;
        m_intervals01[0][2] = 136750;
        m_intervals01[0][3] = 297350;

        m_intervals01[1][0] = 45200;
        m_intervals01[1][1] = 109250;
        m_intervals01[1][2] = 166500;
        m_intervals01[1][3] = 297350;

        m_intervals01[2][0] = 22600;
        m_intervals01[2][1] = 54625;
        m_intervals01[2][2] = 83250;
        m_intervals01[2][3] = 148675;

        m_intervals01[3][0] = 36250;
        m_intervals01[3][1] = 93650;
        m_intervals01[3][2] = 151650;
        m_intervals01[3][3] = 297350;

        m_rates01[0] = 0.15;
        m_rates01[1] = 0.275;
        m_rates01[2] = 0.305;
        m_rates01[3] = 0.355;
        m_rates01[4] = 0.391;


    }

    /**
     * This run function controls the execution of the class. This function contains the main menu that will be displayed in this program.
     * Using this run class makes the code much more simpler to understand.
     * */
    public void run(){
        int choice = -1;
        while(choice != 0) {
            System.out.println("1) Enter filing status");
            System.out.println("2) Print tax tables");
            System.out.println("0) Exit");
            System.out.print("> ");
            choice = scan.nextInt();
            if(choice > 2 || choice < 0){
                while(choice < 0 || choice > 2){
                    System.out.println("Value must be between 0 and 2! Try Again");
                    System.out.print("> ");
                    choice = scan.nextInt();
                }
            }
            if(choice == 1){
                taxFiling();
            }
            else if(choice == 2){
                taxTable();
            }
            else if(choice == 0){
                System.out.println("Thanks for your time!");
                return;
            }

        }
    }

    /**
     * This function is used to calculate tax based on 2001 tax rates. This function is private because we won't be using it in anyother class.
     * */
    private double tax2001(){
        double tax;
        if(m_taxableIncome <= m_intervals01[m_filingStatus][0]){
            tax = m_taxableIncome * m_rates01[0];
        }
        else if(m_taxableIncome <= m_intervals01[m_filingStatus][1]){
            tax = m_intervals01[m_filingStatus][0] * m_rates01[0] + (m_taxableIncome - m_intervals01[m_filingStatus][0]) * m_rates01[1];
        }
        else if(m_taxableIncome <= m_intervals01[m_filingStatus][2]){
            tax = m_intervals01[m_filingStatus][0] * m_rates01[0] + (m_intervals01[m_filingStatus][1] - m_intervals01[m_filingStatus][0]) * m_rates01[1]
                    + (m_taxableIncome - m_intervals01[m_filingStatus][1]) * m_rates01[2];
        }
        else if(m_taxableIncome <= m_intervals01[m_filingStatus][3]){
            tax = m_intervals01[m_filingStatus][0] * m_rates01[0] + (m_intervals01[m_filingStatus][1] - m_intervals01[m_filingStatus][0]) * m_rates01[1]
                    + (m_intervals01[m_filingStatus][2] - m_intervals01[m_filingStatus][1]) * m_rates01[2] + (m_taxableIncome - m_intervals01[m_filingStatus][2]) * m_rates01[3];
        }
        else {
            tax = m_intervals01[m_filingStatus][0] * m_rates01[0] + (m_intervals01[m_filingStatus][1] - m_intervals01[m_filingStatus][0]) * m_rates01[1]
                    + (m_intervals01[m_filingStatus][2] - m_intervals01[m_filingStatus][1]) * m_rates01[2] + ( m_intervals01[m_filingStatus][3] - m_intervals01[m_filingStatus][2]) * m_rates01[3]
                    + (m_taxableIncome - m_intervals01[m_filingStatus][3]) * m_rates01[4];
        }
        return tax;
    }

    /**
     * This function calculates the tax based on 2009 tax rates.
     * */
    private double tax2009(){
        double tax;
        if(m_taxableIncome <= m_intervals[m_filingStatus][0]){
            tax = m_taxableIncome * m_rates[0];
        }
        else if(m_taxableIncome <= m_intervals[m_filingStatus][1]){
            tax = m_intervals[m_filingStatus][0] * m_rates[0] + (m_taxableIncome - m_intervals[m_filingStatus][0]) * m_rates[1];
        }
        else if(m_taxableIncome <= m_intervals[m_filingStatus][2]){
            tax = m_intervals[m_filingStatus][0] * m_rates[0] + (m_intervals[m_filingStatus][1] - m_intervals[m_filingStatus][0]) * m_rates[1]
                    + (m_taxableIncome - m_intervals[m_filingStatus][1]) * m_rates[2];
        }
        else if(m_taxableIncome <= m_intervals[m_filingStatus][3]){
            tax = m_intervals[m_filingStatus][0] * m_rates[0] + (m_intervals[m_filingStatus][1] - m_intervals[m_filingStatus][0]) * m_rates[1]
                    + (m_intervals[m_filingStatus][2] - m_intervals[m_filingStatus][1]) * m_rates[2] + (m_taxableIncome - m_intervals[m_filingStatus][2]) * m_rates[3];
        }
        else if(m_taxableIncome <= m_intervals[m_filingStatus][4]){
            tax = m_intervals[m_filingStatus][0] * m_rates[0] + (m_intervals[m_filingStatus][1] - m_intervals[m_filingStatus][0]) * m_rates[1]
                    + (m_intervals[m_filingStatus][2] - m_intervals[m_filingStatus][1]) * m_rates[2] + ( m_intervals[m_filingStatus][3] - m_intervals[m_filingStatus][2]) * m_rates[3]
                    + (m_taxableIncome - m_intervals[m_filingStatus][3]) * m_rates[4];
        }
        else{
            tax = m_intervals[m_filingStatus][0] * m_rates[0] + (m_intervals[m_filingStatus][1] - m_intervals[m_filingStatus][0]) * m_rates[1]
                    + (m_intervals[m_filingStatus][2] - m_intervals[m_filingStatus][1]) * m_rates[2] + ( m_intervals[m_filingStatus][3] - m_intervals[m_filingStatus][2]) * m_rates[3]
                    + (m_intervals[m_filingStatus][4] - m_intervals[m_filingStatus][3]) * m_rates[4] + (m_taxableIncome - m_intervals[m_filingStatus][4]) * m_rates[5];
        }
        return tax;
    }

    /**
     * This function handles the menu for filing tax and also displays the final result.
     * */
    private void taxFiling(){
        System.out.println("0 - Single filer");
        System.out.println("1 - Married jointly or qualifying widow(er)");
        System.out.println("2 - Married separately");
        System.out.println("3 - Head of household");
        System.out.print("Enter the filing status: ");
        m_filingStatus = scan.nextInt();
        if(m_filingStatus > 3 || m_filingStatus < 0){
            while (m_filingStatus > 3 || m_filingStatus < 0){
                System.out.println("Value must be between 0 and 3. Try Again");
                System.out.print("> ");
                m_filingStatus = scan.nextInt();
            }
        }
        System.out.print("Enter the Taxable Income: $");
        m_taxableIncome = scan.nextDouble();
        if(m_taxableIncome < 0){
            while (m_taxableIncome < 0){
                System.out.println("Income cannot be negative!");
                System.out.print("Enter the Taxable Income: $");
                m_taxableIncome = scan.nextDouble();
            }
        }
        System.out.print("Tax is: $");
        double m_tax = tax2009();
        System.out.println(m_tax + "\n");
    }

    /**
     * This function handles the tax table functionality and displays the final result.
     * */
    private void taxTable(){

        System.out.print("Enter the amount From: $");
        double incomeFrom = scan.nextDouble();
        if(incomeFrom < 0){
            while(incomeFrom < 0){
                System.out.println("Amount cannot be 0");
                System.out.print("> ");
                incomeFrom = scan.nextDouble();
            }
        }
        System.out.print("Enter the amount To: $");
        double incomeTo = scan.nextDouble();
        if(incomeTo <= incomeFrom){
            while(incomeTo <= incomeFrom){
                System.out.println("This amount cannot be less than or equal to the previous amount!");
                System.out.print("> ");
                incomeTo = scan.nextDouble();
            }
        }
        System.out.println("2001 tax tables for taxable income from $" + incomeFrom + " to $" + incomeTo);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Taxable     Single    Married Joint   Married      Head of");
        System.out.println("Income                or Qualifying   Separate      a House");
        System.out.println("                       Widow(er)");
        System.out.println("----------------------------------------------------------------------------------");
        m_taxableIncome = incomeFrom;
        double tax;
        while(m_taxableIncome <= incomeTo){
            System.out.printf("%.0f ",m_taxableIncome);
            for(int i = 0;i<4;i++){
                m_filingStatus = i;
                tax = tax2001();
                System.out.printf("%13.2f ",tax);
            }
            m_taxableIncome += 1000;
            System.out.println();
        }

        System.out.println("\n2009 tax tables for taxable income from $" + incomeFrom + " to $" + incomeTo);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Taxable     Single    Married Joint   Married      Head of");
        System.out.println("Income                or Qualifying   Separate      a House");
        System.out.println("                       Widow(er)");
        System.out.println("----------------------------------------------------------------------------------");
        m_taxableIncome = incomeFrom;
        while(m_taxableIncome <= incomeTo){
            System.out.printf("%.0f ",m_taxableIncome);
            for(int i = 0;i<4;i++){
                m_filingStatus = i;
                tax = tax2009();
                System.out.printf("%14.2f ",tax);
            }
            m_taxableIncome += 1000;
            System.out.println();
        }
        System.out.println();
    }

}












