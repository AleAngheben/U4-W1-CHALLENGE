package it.epicode.be.elementi;

import it.epicode.be.azioni.LumiInt;

public class Image extends EleMedia implements LumiInt {

    private int luminosita;


    public Image(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    public void show() {

        System.out.println("ciao show ");

    }

    @Override
    public void aumentaLuminosita() {
        if (getLuminosita() == 10) {
            System.out.println("luminosità già al massimo");
        } else {
            setLuminosita(getLuminosita() + 1);
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (getLuminosita() == 0) {
            System.out.println("luminosità già al minimo");
        } else {
            setLuminosita(getLuminosita() - 1);
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
