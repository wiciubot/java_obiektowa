package com.company;
import java.net.*;
import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://szgrabowski.kis.p.lodz.pl/zpo18/nazwiska.txt");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        String kol[] = new String[10000];
        int i=0;
        while ((inputLine = in.readLine()) != null){
            kol[i]=in.readLine();
            System.out.println(kol[i]);
            i++;
        }
        in.close();
        Random generator = new Random();
        generator.nextInt(i);


    }

    public int end(int koniec){

        return 0;
    }

    public int start(int poczatek){
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        return 0;
    }

    public void wyscig(String kolarz){
        for(int i=0;i<end();i++){
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            start(i);




        }

    }

}
