package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Lab1cw9e {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        do {

            System.out.print("Podaj liczbę, które mam dodać: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if((num1 == 0) || (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);

        }while(true);


    }
}
