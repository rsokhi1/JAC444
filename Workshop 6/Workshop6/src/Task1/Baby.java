package Task1;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Baby implements Serializable {
    private Vector<Integer> index;
    private Vector<String> boyName;
    private Vector<Integer> boyRank;
    private Vector<String> girlName;
    private Vector<Integer> girlRank;

    public void initiliazeData(int year){
        try(BufferedInputStream bfin = new BufferedInputStream(new FileInputStream("babynamesranking"+year+".txt"));)
        {
//            int i = 0;
            Scanner scan = new Scanner(bfin);
            while(scan.hasNext()){
//                String flag = scan.next();
//                index.add(Integer.parseInt(flag));
//                boyName.add(scan.next());
//                flag = scan.next();
//                boyRank.add(Integer.parseInt(flag));
//                girlName.add(scan.next());
//                flag = scan.next();
//                girlRank.add(Integer.parseInt(flag));
                System.out.println("Index = " + scan.next() + " Boy Name: " + scan.next() + " Boy Rank: " + scan.next()
                                 + " Girl name: " + scan.next() + " Girl Rank: " + scan.next());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayNames(){
        for(int i = 0;i<boyName.size();i++){
            System.out.println(boyName.get(i));
        }
    }

    public Vector<String> getBoyName() {
        return boyName;
    }

    public void setBoyName(Vector<String> boyName) {
        this.boyName = boyName;
    }

    public Vector<Integer> getBoyRank() {
        return boyRank;
    }

    public void setBoyRank(Vector<Integer> boyRank) {
        this.boyRank = boyRank;
    }

    public Vector<String> getGirlName() {
        return girlName;
    }

    public void setGirlName(Vector<String> girlName) {
        this.girlName = girlName;
    }

    public Vector<Integer> getGirlRank() {
        return girlRank;
    }

    public void setGirlRank(Vector<Integer> girlRank) {
        this.girlRank = girlRank;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "index=" + index +
                ", boyName=" + boyName +
                ", boyRank=" + boyRank +
                ", girlName=" + girlName +
                ", girlRank=" + girlRank +
                "}\n";
    }
}
