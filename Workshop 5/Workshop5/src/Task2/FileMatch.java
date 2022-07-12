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

import java.io.*;
import java.util.Vector;

/**
 * This is the File Match class this holds the functionality to match the records and write to the respective files.
 * */
public class FileMatch {

    private static ObjectInputStream input;
    private static ObjectOutputStream output;
    private Vector<Account> accRecord;
    private Vector<TransactionRecord> transRecord;

    private Vector<Account> finalRecord;
    private Vector<TransactionRecord> missingRecord;

    public FileMatch(){
        accRecord = new Vector<Account>();
        transRecord = new Vector<TransactionRecord>();
        finalRecord = new Vector<Account>();
        missingRecord = new Vector<TransactionRecord>();
    }

    /**
     * This function reads data from both the files and compares the data and separates it accordingly and is also responsible to call the respective save functions.
     * */
    public void runMatch(String file1,String file2) throws IOException, ClassNotFoundException {

        openInputFile(file1);
        readMaster();
        closeInputFile();

        openInputFile(file2);
        readTrans();
        closeInputFile();

        missingRecords();

        for(int i = 0;i<accRecord.size();i++){

            for(int j = 0;j<transRecord.size();j++){
                if(accRecord.get(i).getAccNumber() == transRecord.get(j).getAccountNumber()){
                    accRecord.get(i).combine(transRecord.get(j));
                }
            }
            finalRecord.add(accRecord.get(i));
        }

        writeLogs();

        openOutputFile("newmast.txt");

        for(int i = 0;i<finalRecord.size();i++){
            try{
                output.writeObject(finalRecord.get(i));
            }
            catch (IOException ex){
                System.err.println("Error writing to the file!");
            }
        }

        closeOutputFile();
    }

    /**
     * This function will separate the records that are present in the transaction file but don't have a corresponding account number in the main accounts files to a separate vector object.
     * */
    private void missingRecords(){
        for(int i = 0;i<transRecord.size();i++){
            Boolean flag = false;
            for(int j = 0;j<accRecord.size();j++){
                if(transRecord.get(i).getAccountNumber() == accRecord.get(j).getAccNumber()){
                    flag = true;
                }
            }
            if(flag == false){
                missingRecord.add(transRecord.get(i));
            }
        }
    }

    /**
     * This function will open the file for input.
     * */
    private void openInputFile(String filename){
        try{
            input = new ObjectInputStream(new FileInputStream(filename));
        }
        catch (IOException ex){
            System.err.println("Error opening the file!");
        }
    }

    /**
     * This function will open the file for output.
     * */
    private void openOutputFile(String filename){
        try{
            output = new ObjectOutputStream(new FileOutputStream(filename));

        }
        catch (IOException ex){
            System.err.println("Error opening the file!");
        }
    }

    /**
     * This will read the data from the main accounts file.
     * */
    private void readMaster() throws IOException, ClassNotFoundException {
//        Vector<Account> record = new Vector<Account>();
        try{
            while(true){
                Account flag = (Account)input.readObject();
                accRecord.add(flag);
            }
        }
        catch(EOFException ex){
            System.out.println("End of file reached!");
        }
//        return record;
    }

    /**
     * This will read the transactions from the transaction files.
     * */
    private void  readTrans() throws IOException, ClassNotFoundException {
//        Vector<TransactionRecord> record = new Vector<TransactionRecord>();
        try{
            while(true){
                TransactionRecord flag = (TransactionRecord)input.readObject();
                transRecord.add(flag);
            }
        }
        catch(EOFException ex){
            System.out.println("End of file reached!");
        }
//        return record;
    }

    /**
     * This will close the input file
     * */
    private void closeInputFile() throws IOException {
        input.close();
    }

    /**
     * This will close the output file
     * */
    private void closeOutputFile() throws IOException {
        output.close();
    }

    /**
     * This will write the incorrect transactions to the log file.
     * */
    private void writeLogs() throws FileNotFoundException {

        File f = new File("log.txt");
        try(PrintWriter pw = new PrintWriter(f)){
            for(int i = 0;i<missingRecord.size();i++) {
                pw.println("Unmatched transaction record for account number " + missingRecord.get(i).getAccountNumber());
            }
        }
    }
}
