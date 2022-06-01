package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Lab1cw9 {

    /* Metoda startowa programu                                                 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        /**
         * pętla do-while()
         * podanie wartości 0 dla elementów, powoduje wyjście
         * z programu
         */
        do {
            System.out.print("Podaj liczbę, które mam dodać:\n");
            System.out.print("Liczba1: "); num1 = input.nextInt();
            System.out.print("Liczba2: "); num2 = input.nextInt();
            if ((num1 == 0) || (num2 == 0)) break;
            System.out.printf("Wywnik dodawania %d + %d = %d%n",
                    num1, num2, num1 + num2);
        } while (true);
    }
}