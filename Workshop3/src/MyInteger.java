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

/**
 * This class implements and replicates the working of an integer data type
 * */
public class MyInteger {
    private int m_data;

    /**
     * This is the arguement constructor responsible for setting the data value
     * */
    public MyInteger(int val){
        m_data = val;
    }

    /**
     * This function returns the value in the object
     * */
    public int getVal(){
        return m_data;
    }

    /**
     * This function will return true if the number is even or else it will return false.
     * */
    public boolean isEven(){
        return m_data % 2 == 0;
    }

    /**
     * This function will return true if the number in the object is odd or else it will return false
     * */
    public boolean isOdd(){
        return m_data % 2 != 0;
    }

    /**
     * This function will return true if the number in the object is prime or else false.
     * */
    public boolean isPrime(){
        boolean flag = true;
        for(int i = 2;i<m_data;i++){
            if(m_data % i == 0){
                flag = false;
            }
        }
        return flag;
    }

    /**
     * This function will check if the received value is even or not
     * */
    public static boolean isEven(int val){
        return val % 2 == 0;
    }

    /**
     * This function will check if the received value is odd or not
     * */
    public static boolean isOdd(int val){
        return val % 2 != 0;
    }

    /**
     * This function will check if the received value is prime or not
     * */
     public static boolean isPrime(int val){
        boolean flag = true;
        for(int i = 2;i < val;i++){
            if(val % i == 0){
                flag = false;
            }
        }
        return flag;
     }

    /**
     * This function will check if the value in the received object is even or not
     * */
     public static boolean isEven(MyInteger val){
        return val.getVal() % 2 == 0;
     }

    /**
     * This function will check if the value in the received object is odd or not
     * */
    public static boolean isOdd(MyInteger val){
        return val.getVal() % 2 != 0;
    }

    /**
     * This function will check if the value in the received object is Prime or not
     * */
    public static boolean isPrime(MyInteger val){
        boolean flag = true;
        for(int i = 2; i < val.getVal();i++){
            if(val.getVal() % i == 0){
                flag = false;
            }
        }
        return flag;
    }

    /**
     * This function will check if the received value and the value in the object are equal or not
     * */
    public boolean equals(int val){
        return m_data == val;
    }

    /**
     * This function will check if the value in the received object and the current object are same or not
     * */
    public boolean equals(MyInteger val){
        return m_data == val.getVal();
    }

    /**
     * This function will convert the received character string to an integer value.
     * */
    public static int parseInt(char[] c_str){
        int val = 0;
        for(char i:c_str){
            val = 10 * val + Character.getNumericValue(i);
        }
        return val;
    }

    /**
     * This function will convert the received string value into an integer value
     * */
    public static int parseInt(String str){
        int val = 0;
        for(int i = 0;i < str.length();i++ ){
            char ch = str.charAt(i);
            val = 10 * val + Character.getNumericValue(ch);
        }
        return val;
    }



}
