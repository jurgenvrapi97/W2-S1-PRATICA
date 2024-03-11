package ESERCIZIO_3;
import ESERCIZIO_3.esential.ContoCorrente;
import ESERCIZIO_3.esential.ContoOnLine;
import exeptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banca  {
    private static final Logger logger = LoggerFactory.getLogger(Banca.class);

    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente(15000);
        ContoOnLine conto2 = new ContoOnLine(30000, 1000);

        try {
            conto1.preleva(18000);
            conto1.getMovimenti();
        } catch (BancaException e) {
            logger.error("Errore: " + e.getMessage());
        }

        try {
            conto2.preleva(2000);
            System.out.println("il prelievo è stato eseguito");
            System.out.println("hai eseguito n."+ conto2.getMovimenti()+ " movimenti");
        } catch (BancaException e) {
            logger.error("Errore: " + e.getMessage());
        }
    }
}
