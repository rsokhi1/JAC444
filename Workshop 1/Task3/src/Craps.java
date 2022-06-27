/**********************************************
 Workshop 1 Task 3
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
 * This class has been created to just store the chatter function and
 * I have described the functionality of chatter function below.
 * */
public class Craps {
    /**
     * This is a function that is used to get different string for winning or losing
     * the game. In this function we recieve a integer value which will tell us if the
     * string that we need to returned will be for a winning case or a losing one.
     * */
    public String chatter(int won){
        String flag = "";
        int code;
        code = (int) (Math.random() * 3);
        if(won == 1){
            if(code == 0){
                flag = "You’re up big. Now’s the time to cash in your chips!";
            }
            else if(code == 1){
                flag = "You are on Fireeeee!!!!";
            }
            else if (code == 2) {
                flag = "That's how we roll!";
            }
        }
        else{
            if(code == 0){
                flag = "Oh, you’re going for broke, huh?";
            }
            else if(code == 1){
                flag = "Aw c'mon, take a chance!";
            }
            else if(code == 2){
                flag = "Give up already";
            }
        }
        return flag;
    }

}