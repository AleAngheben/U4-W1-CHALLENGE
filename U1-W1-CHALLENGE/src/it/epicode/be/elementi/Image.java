package it.epicode.be.elementi;

import it.epicode.be.azioni.Luminosita;

public class Image extends EleMedia {

    private Luminosita luminosita = new Luminosita();

    public Image(String titolo) {
        super(titolo);
    }
}
