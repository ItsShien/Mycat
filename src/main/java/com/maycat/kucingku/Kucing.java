/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maycat.kucingku;

/**
 *
 * @author Shien
 */

public class Kucing {

    String nama;
    String jenis;
    String warna;
    int umur;
    String makananFavorit;

    public Kucing(String nama, String jenis, String warna, int umur, String makananFavorit) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.umur = umur;
        this.makananFavorit = makananFavorit;
    }

    public void tampilkanData() {
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis           : " + jenis);
        System.out.println("Warna           : " + warna);
        System.out.println("Umur            : " + umur + " tahun");
        System.out.println("Makanan Favorit : " + makananFavorit);
    }

    public void suara() {
        System.out.println(nama + " berkata: Meong!");
    }
}
