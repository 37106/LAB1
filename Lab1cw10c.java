package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Lab1cw10c {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int iloscZer = 7;                   /* Zera dodawane do wyniku      */

        System.out.print("Podaj liczbę do konwersji i wciśnij ENTER: ");
        num = input.nextInt();

        if(num == 0) {
            System.out.println("Podałeś 0. W każdym systemie wartość będzie tylko taka");
            System.exit(0);
        }

        Integer into = new Integer(num);
        String intot = Integer.toString(into);
        System.out.println("Wartość po konwersji: ");
        System.out.println("HEX: " + leftPad(intot, '0', iloscZer));
        System.out.println("BIN: " + Integer.toBinaryString(num));

    }

    static String leftPad(String aText, char aChar, int aWidth) {

        String res = aText;
        for(int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;

        return res;

    }
}
