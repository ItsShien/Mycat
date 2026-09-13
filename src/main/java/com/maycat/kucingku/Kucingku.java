/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.maycat.kucingku;

/**
 *
 * @author Shien
 */
public class Kucingku {

    public static void main(String[] args) {

        Kucing kucing1 = new Kucing(
                "Milo",
                "Persia",
                "Putih",
                2,
                "Whiskas"
        );

        Kucing kucing2 = new Kucing(
                "Oyen",
                "Anggora",
                "Orange",
                3,
                "Ikan"
        );

        System.out.println("=== DATA AWAL KUCING 1 ===");
        System.out.println("Nama            : " + kucing1.getNama());
        System.out.println("Jenis           : " + kucing1.getJenis());
        System.out.println("Warna           : " + kucing1.getWarna());
        System.out.println("Umur            : " + kucing1.getUmur() + " tahun");
        System.out.println("Makanan Favorit : " + kucing1.getMakananFavorit());

        System.out.println();

        System.out.println("=== MENGUBAH DATA KUCING 1 ===");

        kucing1.setNama("Milo Junior");
        kucing1.setJenis("British Shorthair");
        kucing1.setWarna("Abu-abu");
        kucing1.setMakananFavorit("Ayam");

        System.out.println("Mengubah umur menjadi 4:");
        kucing1.setUmur(4);

        System.out.println("Umur sekarang: " + kucing1.getUmur() + " tahun");

        System.out.println();

        System.out.println("Mengubah umur menjadi -1:");
        kucing1.setUmur(-1);

        System.out.println("Umur sekarang: " + kucing1.getUmur() + " tahun");

        System.out.println();

        System.out.println("=== DATA AKHIR KUCING 1 ===");
        kucing1.tampilkanData();
        kucing1.suara();

        System.out.println();

        System.out.println("=== DATA KUCING 2 ===");
        kucing2.tampilkanData();
        kucing2.suara();
    }
}