package ESERCIZIO_0;

import java.util.Scanner;


public class ES_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digita un numero ti saranno date alcune informazioni");
        int n;
        n = Integer.parseInt(sc.nextLine());
        primo(n);
        pari(n);
        System.out.println("finito");
        sc.close();


    }

    public static void primo(int numero) {
        if (numero % numero == 0 && numero % 1 == 0 && numero % numero + 1 != 0) {
            System.out.println("numero primo");
        }
    }

    public static void pari(int numero) {
        if (numero % 2 == 0) {

            System.out.println("numero pari");

        } else {

            System.out.println("dispari");
        }
    }
}
