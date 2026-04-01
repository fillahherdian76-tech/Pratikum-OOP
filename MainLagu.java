/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PratikumT2;

/**
 *
 * @author ADVAN
 */
public class MainLagu {
   
/**
 * Driver Class: MainLagu.java
 * Menginstansiasi objek Lagu menggunakan constructor berparameter.
 * Tema   : Entertainment - Musik
 * @author Fillah Akbar Herdian
     * @param args
 * @NIM    2518053
 */
    public static void main(String[] args) {

        // Objek langsung diisi nilainya lewat constructor
        // tidak perlu panggil method dataLagu() seperti T1
        Lagu lagu1 = new Lagu("L001", "Bohemian Rhapsody", "Queen", "Rock", 354, 9.5);
        System.out.println("==============================");
        System.out.println("          DATA LAGU           ");
        System.out.println("==============================");
        System.out.println("ID Lagu    : " + lagu1.getIdLagu());
        System.out.println("Judul      : " + lagu1.getJudulLagu());
        System.out.println("Artis      : " + lagu1.getNamaArtis());
        System.out.println("Genre      : " + lagu1.getGenre());
        System.out.println("Durasi     : " + lagu1.formatDurasi());
        System.out.printf ("Rating     : %.1f / 10.0%n", lagu1.getRating());
        System.out.println("Kategori   : " + lagu1.getKategoriRating());
        System.out.printf ("Skor       : %.2f%n", lagu1.hitungSkor());
        System.out.println("==============================");

        System.out.println();

        Lagu lagu2 = new Lagu("L002", "Blinding Lights", "The Weeknd", "Synth-pop", 233, 8.3);
        System.out.println("==============================");
        System.out.println("          DATA LAGU           ");
        System.out.println("==============================");
        System.out.println("ID Lagu    : " + lagu2.getIdLagu());
        System.out.println("Judul      : " + lagu2.getJudulLagu());
        System.out.println("Artis      : " + lagu2.getNamaArtis());
        System.out.println("Genre      : " + lagu2.getGenre());
        System.out.println("Durasi     : " + lagu2.formatDurasi());
        System.out.printf ("Rating     : %.1f / 10.0%n", lagu2.getRating());
        System.out.println("Kategori   : " + lagu2.getKategoriRating());
        System.out.printf ("Skor       : %.2f%n", lagu2.hitungSkor());
        System.out.println("==============================");

        System.out.println();

        Lagu lagu3 = new Lagu("L003", "Friday", "Rebecca Black", "Pop", 187, 2.1);
        System.out.println("==============================");
        System.out.println("          DATA LAGU           ");
        System.out.println("==============================");
        System.out.println("ID Lagu    : " + lagu3.getIdLagu());
        System.out.println("Judul      : " + lagu3.getJudulLagu());
        System.out.println("Artis      : " + lagu3.getNamaArtis());
        System.out.println("Genre      : " + lagu3.getGenre());
        System.out.println("Durasi     : " + lagu3.formatDurasi());
        System.out.printf ("Rating     : %.1f / 10.0%n", lagu3.getRating());
        System.out.println("Kategori   : " + lagu3.getKategoriRating());
        System.out.printf ("Skor       : %.2f%n", lagu3.hitungSkor());
        System.out.println("==============================");
    }
}
