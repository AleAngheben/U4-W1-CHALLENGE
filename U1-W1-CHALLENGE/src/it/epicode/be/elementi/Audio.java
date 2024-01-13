package it.epicode.be.elementi;

public class Audio extends EleMedia {

    private int durata;

    public Audio(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
