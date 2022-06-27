/**********************************************
 Workshop 1 Task 1
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 31-05-2022
 **********************************************/
import java.util.Scanner;

/**
 * This class is used for the encryption and decryption of the data
 * We will define two functions to encrypt and decrypt data.
 * */
public class Cryptography {
/**
 * This function will read data from the user and return the value. Also,
 * this function will receive three values. First one will be string that needs to
 * be used as a prompt and the second one will be if it needs to print the prompt or not
 * and the last one will be tell us if the input is taken for encryption or decryption
 * */
    public int readData(String prompt,boolean promp,char opt){
        if(promp){
            System.out.print(prompt);
        }
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        if(opt == 'E') {
            if (val < 1000 || val > 9999) {
                while (val < 1000 || val > 9999) {
                    System.out.println("You need to enter a 4 digit number!");
                    val = scan.nextInt();
                }
            }
        }
//        m_val = val;
        return val;
    }

    /**
     * This function will receive a 4 digit value and encrypt it and then return it.
     * To encrypt it will add 7 to every individual digit and then divide it by 10 and then take
     * the remainder. After that it will swap the first digit with the third digit and the second
     * digit with the fourth digit.
     * */
    public int encryptData(int val){
        int[] flag = new int[4];
        for(int i = 3;i>=0;i--){
            flag[i] = val % 10;
            val /= 10;
        }

        for(int i = 0;i < 4;i++){
            flag[i] = (flag[i] + 7) % 10;

        }
        int temp = flag[0];
        flag[0] = flag[2];
        flag[2] = temp;
        temp = flag[1];
        flag[1] = flag[3];
        flag[3] = temp;
        val = 0;
        for(int a : flag){
            val = 10 * val + a;
        }
        return val;
    }


    /**
     * This function will receive an integer value and return the decrypted value.
     * To get the decrypted value we will simply just reverse the encyption formula.
     * */
    public int decryptData(int val){
        int[] flag = new int[4];
        for(int i = 3;i>=0;i--){
            flag[i] = val % 10;
            val /= 10;
        }
        for(int i = 0;i < 4;i++){
            flag[i] = ((flag[i] + 10) - 7) % 10;
        }
        int temp = flag[0];
        flag[0] = flag[2];
        flag[2] = temp;
        temp = flag[1];
        flag[1] = flag[3];
        flag[3] = temp;
        val = 0;
        for(int a : flag){
            val = 10 * val + a;
        }
        return val;
    }

}
