package it.epicode.be.elementi;

import it.epicode.be.azioni.VoluInt;

public class Audio extends EleMedia implements VoluInt {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void play() {

        System.out.println("ciao play ");

    }


    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    @Override
    public void aumentaVolume() {
        if (getVolume() == 10) {
            System.out.println("volume già al massimo !");
        } else {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void diminuisciVolume() {
        if (getVolume() == 0) {
            System.out.println("volume già al minimo !");
        } else {
            setVolume(getVolume() - 1);
        }

    }
}
