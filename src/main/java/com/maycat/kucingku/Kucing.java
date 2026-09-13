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

    private String nama;
    private String jenis;
    private String warna;
    private int umur;
    private String makananFavorit;

    public Kucing(String nama, String jenis, String warna, int umur, String makananFavorit) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.umur = umur;
        this.makananFavorit = makananFavorit;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        // Validasi umur
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid! Umur tidak boleh kurang dari 0.");
        }
    }


    public String getMakananFavorit() {
        return makananFavorit;
    }

    public void setMakananFavorit(String makananFavorit) {
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