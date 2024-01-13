package it.epicode.be.elementi;

public class Audio extends EleMedia {

    private int durata;

    public Audio(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }

    public void play(){

        for (int i = 0; i < durata ; i++) {
            System.out.println( " " + getTitolo());

        }

    }








    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
