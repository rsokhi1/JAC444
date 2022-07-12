/**********************************************
 Workshop 5 Task 2
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 11-07-2022
 **********************************************/
package Task2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * This class is used to read the Serialized objects from the txt file.
 * */
public class ReadData {
    private static ObjectInputStream input;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        openFile();
        readRecord();
    }

    public static void openFile(){
        try{
            input = new ObjectInputStream(new FileInputStream("newmast.txt"));
        }catch(IOException ex){
            System.err.println("Error opening the file!");
        }
    }

    public static void readRecord() throws IOException,ClassNotFoundException{
        System.out.printf("%-10s %-12s %-12s %10s%n","Account number","First Name","Last Name","Balance");

        try {
            while(true){
                Account record = (Account) input.readObject();

                System.out.printf("%-10d %-12s %-12s %10.2f%n", record.getAccNumber(), record.getFname(), record.getLname(), record.getBalance());
            }
        }
        catch (EOFException ex){
            System.out.println("End of file Reached");
        }
    }
}
