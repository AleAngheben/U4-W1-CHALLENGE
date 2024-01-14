package it.epicode.be.elementi;

import it.epicode.be.azioni.LumiInt;
import it.epicode.be.azioni.VoluInt;

public class Video extends EleMedia implements LumiInt, VoluInt {

    private int luminosita;
    private int duration;
    private int volume;

    public Video(String titolo, int luminosita, int duration, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.duration = duration;
        this.volume = volume;
    }


    public void play() {

        System.out.println("ciao play ");

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

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
