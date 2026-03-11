/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    package PratikumT1;

/**
 * Object Class: Lagu.java
 * Merepresentasikan entitas Lagu dalam sistem rekam data musik.
 * Tema   : Entertainment - Musik
 * @author Fillah Akbar Herdian
 * @NIM    2518053
 */
public class Lagu {

    // Atribut private — penerapan konsep enkapsulasi OOP
    private String idLagu;
    private String judulLagu;
    private String namaArtis;
    private String genre;
    private int durasiDetik;
    private double rating;

    public void dataLagu(String id, String judul, String artis,
                         String genre, int durasi, double rating) {
        this.idLagu      = id;
        this.judulLagu   = judul;
        this.namaArtis   = artis;
        this.genre       = genre;
        this.durasiDetik = durasi;
        this.rating      = rating;
    }

    public String formatDurasi() {
        int menit = durasiDetik / 60;
        int detik = durasiDetik % 60;
        return menit + ":" + String.format("%02d", detik);
    }

    public String getKategoriRating() {
        if      (rating >= 8.0) return "Masterpiece";
        else if (rating >= 6.0) return "Bagus";
        else if (rating >= 4.0) return "Cukup";
        else                    return "Kurang";
    }

    public double hitungSkor() {
        return rating * (durasiDetik / 60.0);
    }

    public void cetakDataLagu() {
        System.out.println("==============================");
        System.out.println("          DATA LAGU           ");
        System.out.println("==============================");
        System.out.println("ID Lagu    : " + idLagu);
        System.out.println("Judul      : " + judulLagu);
        System.out.println("Artis      : " + namaArtis);
        System.out.println("Genre      : " + genre);
        System.out.println("Durasi     : " + formatDurasi());
        System.out.printf ("Rating     : %.1f / 10.0%n", rating);
        System.out.println("Kategori   : " + getKategoriRating());
        System.out.printf ("Skor       : %.2f%n", hitungSkor());
        System.out.println("==============================");
    }
}

