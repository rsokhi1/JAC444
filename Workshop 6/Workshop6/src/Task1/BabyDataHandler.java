package Task1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class BabyDataHandler {
    private Vector<Baby> baby = new Vector<Baby>();

    public void initializeData(int year){
        try(BufferedInputStream bfin = new BufferedInputStream(new FileInputStream("babynamesranking"+year+".txt"));)
        {
//            int i = 0;
            Scanner scan = new Scanner(bfin);
            while(scan.hasNext()){
                String flag = scan.next();

                boyName.add(scan.next());
                flag = scan.next();
                boyRank.add(Integer.parseInt(flag));
                girlName.add(scan.next());
                flag = scan.next();
                girlRank.add(Integer.parseInt(flag));
                System.out.println("Index = " + scan.next() + " Boy Name: " + scan.next() + " Boy Rank: " + scan.next()
                        + " Girl name: " + scan.next() + " Girl Rank: " + scan.next());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
