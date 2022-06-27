/**********************************************
 Workshop 3 Task 2
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

public class Task2 {
    /**
     * The main function is responsible for taking input and also for handling the menu options.
     * Since, we were asked to use the overloaded constructor to initialize the values
     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while(choice != 4){
            System.out.println("Enter 1 for format: MM/DD/YYY");
            System.out.println("Enter 2 for format: Month DD, YYYY");
            System.out.println("Enter 3 for format: DDD YYYY");
            System.out.println("Enter 4 to exit ");
            System.out.print("Choice: ");
            choice = scan.nextInt();
            if(choice < 1 || choice > 4){
                while(choice < 1 || choice > 4) {
                    System.out.print("Invalid input! Input must be between 1 and 4 (inclucsive): ");
                    choice = scan.nextInt();
                }
            }
            if(choice == 1){

                System.out.print("Enter Month (1-12): ");
                int mon = scan.nextInt();
                if(mon < 1 || mon > 12){
                    while(mon < 1 || mon > 12){
                        System.out.print("Month can only be between 1 and 12: ");
                        mon = scan.nextInt();
                    }
                }
                System.out.print("Enter Day of Month: ");
                int day = scan.nextInt();
                if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8||mon == 10 || mon == 12){
                    if(day > 31 || day < 1){
                        while (day > 31 || day < 1){
                            System.out.print("Date should be between 1 and 31: ");
                            day = scan.nextInt();
                        }
                    }
                }
                else if (mon == 2) {
                    if(day > 29 || day < 1){
                        while(day > 29 || day < 1){
                            System.out.print("Date should be between 1 and 29: ");
                            day = scan.nextInt();
                        }
                    }
                }
                else{
                    if(day > 30 || day < 1){
                        while (day > 30 || day < 1){
                            System.out.print("Date should be between 1 and 30: ");
                            day = scan.nextInt();
                        }
                    }
                }
                System.out.print("Enter Year: ");
                int year = scan.nextInt();
                if(mon == 2){
                    if(year % 4 != 0){
                        while(year % 4 != 0) {
                            System.out.print(year + " is not a leap year. Enter a leap year: ");
                            year = scan.nextInt();
                        }
                    }
                }
                else{
                    if(year < 1000 || year > 9999){
                        while(year < 1000 || year > 9999) {
                            System.out.print("Year should be 4 digit number.Enter again: ");
                            year = scan.nextInt();
                        }
                    }
                }
                Date d1 = new Date(day,mon,year);
                d1.format1();
            }
            else if(choice == 2){
                String month;
                scan.nextLine();
                System.out.print("Enter month in characters: ");
                month = scan.nextLine();
                int monthNo = 0;
                while(monthNo < 1) {
                    if (month.toLowerCase().equals("january")) {
                        monthNo = 1;
                    } else if (month.toLowerCase().equals("february")) {
                        monthNo = 2;
                    } else if (month.toLowerCase().equals("march")) {
                        monthNo = 3;
                    } else if (month.toLowerCase().equals("april")) {
                        monthNo = 4;
                    } else if (month.toLowerCase().equals("may")) {
                        monthNo = 5;
                    } else if (month.toLowerCase().equals("june")) {
                        monthNo = 6;
                    } else if (month.toLowerCase().equals("july")) {
                        monthNo = 7;
                    } else if (month.toLowerCase().equals("august")) {
                        monthNo = 8;
                    } else if (month.toLowerCase().equals("september")) {
                        monthNo = 9;
                    } else if (month.toLowerCase().equals("october")) {
                        monthNo = 10;
                    } else if (month.toLowerCase().equals("november")) {
                        monthNo = 11;
                    } else if(month.toLowerCase().equals("december")){
                        monthNo = 12;
                    }
                    else{
                        System.out.print("Invalid month name. Check spellings and try again: ");
                        month = scan.nextLine();
                    }
                }

                System.out.print("Enter day of Month: ");
                int date = scan.nextInt();
                if(monthNo == 1 || monthNo == 3 || monthNo == 5 || monthNo == 7 || monthNo == 8||monthNo == 10 || monthNo == 12){
                    if(date > 31 || date < 1){
                        while (date > 31 || date < 1){
                            System.out.print("Date should be between 1 and 31: ");
                            date = scan.nextInt();
                        }
                    }
                }
                else if (monthNo == 2) {
                    if(date > 29 || date < 1){
                        while(date > 29 || date < 1){
                            System.out.print("Date should be between 1 and 29: ");
                            date = scan.nextInt();
                        }
                    }
                }
                else{
                    if(date > 30 || date < 1){
                        while (date > 30 || date < 1){
                            System.out.print("Date should be between 1 and 30: ");
                            date = scan.nextInt();
                        }
                    }
                }

                System.out.print("Enter Year: ");
                int year = scan.nextInt();
                if(monthNo == 2){
                    if(year % 4 != 0){
                        while(year % 4 != 0) {
                            System.out.print(year + " is not a leap year. Enter a leap year: ");
                            year = scan.nextInt();
                        }
                    }
                }
                else{
                    if(year < 1000 || year > 9999){
                        while(year < 1000 || year > 9999) {
                            System.out.print("Year should be 4 digit number.Enter again: ");
                            year = scan.nextInt();
                        }
                    }
                }
                Date d2 = new Date(month,date,year);
                d2.format2();
            }
            else if (choice == 3) {
                System.out.print("Enter Day of Month: ");
                int date = scan.nextInt();
                if(date > 31 || date < 1){
                    while(date > 31 || date < 1){
                        System.out.println("Date should be between 1 and 31: ");
                        date = scan.nextInt();
                    }
                }

                System.out.print("Enter Year: ");
                int year = scan.nextInt();
                if(year < 1000 || year > 9999){
                    while(year < 1000 || year > 9999) {
                        System.out.print("Year should be 4 digit number.Enter again: ");
                        year = scan.nextInt();
                    }
                }
                Date d3 = new Date(date,year);
                d3.format3();
            }
            else{
                System.out.println("Thank you! Have a good day!");
            }
        }
    }
}
