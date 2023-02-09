package sample;

import java.util.ArrayList;

public class sample{

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("fasdfa");
        lines.add("safdasd");
        lines.add("dsafg");

        for(int i = 0; i < lines.size(); i++)
        {
            System.out.println(lines.get(i));
            Thread.currentThread().sleep(1000);
        }
    }



}


