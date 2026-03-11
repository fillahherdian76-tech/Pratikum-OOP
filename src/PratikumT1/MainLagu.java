/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    package PratikumT1;

/**
 * Driver Class: MainLagu.java
 * Tema   : Entertainment - Musik
 * @author Fillah Akbar Herdian
 * @NIM    2518053
 */
public class MainLagu {

    public static void main(String[] args) {

        Lagu lagu1 = new Lagu();
        lagu1.dataLagu("L001", "Bohemian Rhapsody", "Queen", "Rock", 354, 9.5);
        lagu1.cetakDataLagu();

        System.out.println();

        Lagu lagu2 = new Lagu();
        lagu2.dataLagu("L002", "Blinding Lights", "The Weeknd", "Synth-pop", 233, 8.3);
        lagu2.cetakDataLagu();

        System.out.println();

        Lagu lagu3 = new Lagu();
        lagu3.dataLagu("L003", "Friday", "Rebecca Black", "Pop", 187, 2.1);
        lagu3.cetakDataLagu();
    }
}

