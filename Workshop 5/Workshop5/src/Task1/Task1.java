/**********************************************
 Workshop 5 Task 1
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 11-07-2022
 **********************************************/
package Task1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileMatch fileMain = new FileMatch();
        createOldMastFile();
        createTransRecordFile();
        fileMain.runMatch("oldmast.txt","trans.txt");
    }

    /**
     * This function is used to create the oldmast file.
     * */
    public static void createOldMastFile(){
        ObjectOutputStream output = null;
        try{
            output = new ObjectOutputStream(new FileOutputStream("oldmast.txt"));
        }
        catch (IOException ex){
            System.err.println("Error opening file!");
        }
        Account[] acc = new Account[4];
        acc[0] = new Account(100,"Alan","Jones",348.17);
        acc[1] = new Account(300,"Mary","Smith",27.19);
        acc[2] = new Account(500,"Sam","Sharp",0.00);
        acc[3] = new Account(700,"Suzy","Green",-14.22);

        for (int i = 0;i<4;i++){
            try{
                output.writeObject(acc[i]);
            }
            catch (IOException ex){
                System.err.println("Error writing to the file!");
                break;
            }
        }

        try {
            output.close();
        }
        catch (IOException ex){
            System.err.println("Error closing file!");
        }

    }

    /**
     * This function is used to create the transaction file
     * */
    public static void createTransRecordFile(){
        ObjectOutputStream output = null;

        try{
            output = new ObjectOutputStream(new FileOutputStream("trans.txt"));
        }
        catch (IOException ex){
            System.err.println("Error opening file!");
        }

        TransactionRecord[] trans = new TransactionRecord[4];
        trans[0] = new TransactionRecord(100,27.14);
        trans[1] = new TransactionRecord(300,62.11);
        trans[2] = new TransactionRecord(400,100.56);
        trans[3] = new TransactionRecord(900,82.17);

        for (int i = 0;i<4;i++){
            try{
                output.writeObject(trans[i]);
            }
            catch (IOException ex){
                System.err.println("Error writing to the file!");
                break;
            }
        }

        try {
            output.close();
        }
        catch (IOException ex){
            System.err.println("Error closing file!");
        }

    }
}
