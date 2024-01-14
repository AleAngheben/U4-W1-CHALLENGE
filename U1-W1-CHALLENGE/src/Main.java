import it.epicode.be.elementi.Audio;
import it.epicode.be.elementi.Image;
import it.epicode.be.elementi.Video;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Object[] arrayElementi = new Object[2];


        Scanner scanner = new Scanner(System.in);

        System.out.println("Popola l'array con 5 elementi multimediali !");

        for (int i = 0; i < arrayElementi.length; i++) {

            System.out.println("Di che tipo di elemento si tratta? (Audio, Video o Immagine)");
            String objectType = scanner.nextLine();


            switch (objectType.toLowerCase().trim()) {


                case "audio":

                    System.out.println("Definisci il titolo dell'elemento : ");
                    String titleAudio = scanner.nextLine();

                    System.out.println("Definisci durata dell'audio");
                    int duration = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Definisci un volume di partenza per l'audio (da 0 a 10) :");
                    int volume = scanner.nextInt();
                    scanner.nextLine();

                    arrayElementi[i] = new Audio(titleAudio, duration, volume);

                    break;

                case "video":

                    System.out.println("Definisci il titolo dell'elemento : ");
                    String titleVideo = scanner.nextLine();

                    System.out.println("Definisci durata del video");
                    int durationVideo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Definisci una luminosità di partenza per il video (da 0 a 10)");
                    int brightnessVideo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Definisci un volume di partenza per il video (da 0 a 10) :");
                    int volumeVideo = scanner.nextInt();
                    scanner.nextLine();

                    arrayElementi[i] = new Video(titleVideo, brightnessVideo, durationVideo, volumeVideo);

                    break;

                case "immagine":

                    System.out.println("Definisci il titolo dell'elemento : ");
                    String titleImage = scanner.nextLine();

                    System.out.println("Definisci una luminosità di partenza per l'immagine (da 0 a 10)");
                    int brightnessImage = scanner.nextInt();
                    scanner.nextLine();

                    arrayElementi[i] = new Image(titleImage, brightnessImage);

                    break;

                default:
                    System.out.println("Valore inserito non vaido, riprova");
                    i--;
                    break;
            }

        }
        System.out.println("Hai popolato correttamente tutto l'array !");


        while (true) {
            System.out.println("Che elemento vuoi riprodurre ( da 1 a 5 )");
            Integer scelta = scanner.nextInt();
            scanner.nextLine();
            if (scelta.equals(0)) {
                System.out.println("player chiuso");
                scanner.close();
                break;
            } else if (arrayElementi[scelta - 1] instanceof Audio) {
                ((Audio) arrayElementi[scelta - 1]).play();

            } else if (arrayElementi[scelta - 1] instanceof Video) {
                ((Video) arrayElementi[scelta - 1]).play();

            } else if (arrayElementi[scelta - 1] instanceof Image) {
                ((Image) arrayElementi[scelta - 1]).show();
            }

        }


    }


}