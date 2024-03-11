package ESERCIZIO_2;
import ESECIZIO_1.ES_1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class ES_2 {
    private static final Logger logger = LoggerFactory.getLogger(ES_2.class);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci i KM percorsi");
        int km = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("quanti litri di carburante hai consumato");
            int carb = Integer.parseInt(scanner.nextLine());
            if (carb == 0){
                logger.error("non puoi inserire zero come valore di litri");
            }else {
                System.out.println("hai un consumo medio di: "+ media(km,carb) + " km/l");
            }
        } catch (NumberFormatException e){
            logger.error("non hai inserito un numero valido di litri");
        }


    }

    public static  double media (int km, int carburante ){
        double media;
        media = km/carburante;
        return media;
    }

}
