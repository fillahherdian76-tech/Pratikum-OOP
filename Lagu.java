/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PratikumT2;

/**
 *
 * @author ADVAN
 */
public class Lagu {
    /**
 * Object Class: Lagu.java
 * Merepresentasikan entitas Lagu dalam sistem rekam data musik.
 * Menggunakan constructor berparameter untuk menginisialisasi
 * nilai awal atribut secara langsung saat objek dibuat.
 * Tema   : Entertainment - Musik
 * @author Fillah Akbar Herdian
 * @NIM    2518053
 */

    // Atribut private 
    private final String idLagu;
    private final String judulLagu;
    private final String namaArtis;
    private final String genre;
    private final int    durasiDetik;
    private final double rating;

    /**
     * Constructor berparameter — otomatis dieksekusi saat objek dibuat.
     * Langsung menginisialisasi semua atribut tanpa perlu memanggil
     * method tambahan seperti dataLagu() pada T1.
     *
     * @param id     ID unik lagu
     * @param judul  Judul lagu
     * @param artis  Nama artis
     * @param genre  Genre musik
     * @param durasi Durasi dalam detik
     * @param rating Rating 0.0 - 10.0
     */
    public Lagu(String id, String judul, String artis,
                String genre, int durasi, double rating) {
        this.idLagu      = id;
        this.judulLagu   = judul;
        this.namaArtis   = artis;
        this.genre       = genre;
        this.durasiDetik = durasi;
        this.rating      = rating;
    }

    /**
     * Mengkonversi durasi dari detik ke format menit:detik (MM:SS).
     * @return String format "menit:detik"
     */
    public String formatDurasi() {
        int menit = durasiDetik / 60;
        int detik = durasiDetik % 60;
        return menit + ":" + String.format("%02d", detik);
    }

    /**
     * Menentukan kategori lagu berdasarkan rating.
     * @return kategori lagu
     */
    public String getKategoriRating() {
        if      (rating >= 8.0) return "Masterpiece";
        else if (rating >= 6.0) return "Bagus";
        else if (rating >= 4.0) return "Cukup";
        else                    return "Kurang";
    }

    /**
     * Menghitung skor popularitas lagu.
     * Rumus: skor = rating x (durasiDetik / 60.0)
     * @return skor popularitas
     */
    public double hitungSkor() {
        return rating * (durasiDetik / 60.0);
    }

    // Getter — untuk mengambil nilai atribut dari luar class
    public String getIdLagu()      { return idLagu; }
    public String getJudulLagu()   { return judulLagu; }
    public String getNamaArtis()   { return namaArtis; }
    public String getGenre()       { return genre; }
    public int    getDurasiDetik() { return durasiDetik; }
    public double getRating()      { return rating; }
}
    

