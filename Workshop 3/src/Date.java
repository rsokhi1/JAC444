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

public class Date {
    private int m_date;
    private String m_monthStr;
    private int m_month;
    private int m_year;

    /**
     * This is the first overloaded constructor this will receive 3 integer values and will work for the 1st format
     * */
    public Date(int date,int month,int year){
        m_date = date;
        m_month = month;
        m_year = year;
    }

    /**
     * This is the second overloaded constructor this will receive 1 String and  2 integer values and this will work for the 2nd format
     * */
    public Date(String month, int date,int year){
        m_monthStr = month;
        m_date = date;
        m_year = year;
    }
    /**
     * This is the third overloaded constructor this will receive 2 integer values and work for the 3rd format
     * */

    public Date(int date,int month){
        m_date = date;
        m_month = month;
    }

    /**
     * This outputs the date in the 1st format
     * */
    void format1(){
        System.out.println("\nMM/DD/YYYY: " + m_month +"/"+m_date + "/" + m_year+"\n");
    }

    /**
     * This outputs the date in the 2nd format
     * */
    void format2(){
        System.out.println("\nMonth DD, YYYY: " + m_monthStr +" "+ m_date + ", " + m_year + "\n");
    }

    /**
     * This outputs the date in the 3rd format
     * */
    void format3(){
        System.out.println("\nDDD YYYY: "+m_date + " "+m_month + "\n");
    }
}
