package it.epicode.be.azioni;

public class Luminosita {

    private int luminosita = 5;


    public void aumentaLuminosita(){
        if (getLuminosita()==10){
            System.out.println("luminosità già al massimo");
        }else{
            setLuminosita(getLuminosita()+1);
        }
    }

    public void diminuisciLuminosita(){
        if (getLuminosita()==0){
            System.out.println("luminosità già al minimo");
        }else{
            setLuminosita(getLuminosita()-1);
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
