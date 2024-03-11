package ESECIZIO_1;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ES_1 {
    private static final Logger logger = LoggerFactory.getLogger(ES_1.class);

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int answer = 2;
        while (answer != 0) {
            System.out.println("questo è il vettore di partenza ");
            print(array);
            try {
                System.out.println("digita un numero");
                Scanner scanner = new Scanner(System.in);
                int newNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("in quele posizione lo voui inserire da 1 a 10");
                int position = Integer.parseInt(scanner.nextLine());
                if (position < 1 || position > 10) {
                    System.out.println("Errore: Inserisci una posizione valida (da 1 a 10).");
                    continue;
                }
                sub(array, position, newNumber);
                System.out.println("questo è il nuovo vettore di partenza ");
                print(array);
                System.out.println("vuoi continuare a inserire? 1 se sì oppure inserisce il numero 0");
                answer = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                logger.error("hai inserito un nummero non valido inserisci un numero tra (1 e 10)");
            }

        }
    }

    static public void print(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);


        }

    }

    static public void sub(int[] ar, int pos, int num) {
        ar[pos - 1] = num;
    }
}
