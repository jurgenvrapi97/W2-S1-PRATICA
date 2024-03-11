package ESERCIZIO_3.esential;

import exeptions.BancaException;

public class ContoOnLine extends ContoCorrente {

    private double maxPrelievo;

    public ContoOnLine(double saldoIniziale, double maxPrelievo) {
        super(saldoIniziale);
        this.maxPrelievo = maxPrelievo;
    }

    @Override
    public void preleva(double importo) throws BancaException {
        if (importo > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
        super.preleva(importo);
    }

}
