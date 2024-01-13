package it.epicode.be.elementi;

 public abstract class EleMedia {

     private String titolo;
     public EleMedia(String titolo) {
         this.titolo = titolo;
     }

     public String getTitolo() {
         return titolo;
     }

     public void setTitolo(String titolo) {
         this.titolo = titolo;
     }
 }
