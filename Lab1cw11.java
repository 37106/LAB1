package pl.lublin.wsei.java.cwiczenia;

import java.util.Random;

public class Lab1cw11 {

    public static void main(String[] args) {

        int[] liczby = new int[30];
        Random rnd = new Random();

        for(int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();

        int mx = 0; //Integer.MAX_VALUE;
        int mn = 0; //Integer.MIN_VALUE;
        long avg = 0;
        for(int l : liczby) {

            System.out.println(l);
            if(l > mx) mx = l;
            if(l < mn) mn = l;
            avg += l;

        }

        System.out.printf("MIN = %d, MAX = %d, AVG = %f",
                mn, mx, (float)avg/liczby.length);

    }
}
