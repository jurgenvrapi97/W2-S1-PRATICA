package ESERCIZIO_3.esential;

import exeptions.BancaException;

public class ContoCorrente {
    private double saldo;
    private int movimenti;

    public int getMovimenti() {
        return movimenti;
    }

    public ContoCorrente(double saldoIniziale) {
        saldo = saldoIniziale;
        movimenti = 0;
    }

    public void preleva(double importo) throws BancaException {
        if (saldo - importo < 0) {
            throw new BancaException("Il conto è in rosso");
        }
        saldo -= importo;
        movimenti++;
    }
}
