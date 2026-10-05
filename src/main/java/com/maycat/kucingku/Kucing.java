/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maycat.kucingku;

/**
 *
 * @author Shien
 */
public class Kucing extends Hewan {

    private String jenis;
    private String warna;
    private String makananFavorit;

    public Kucing(String nama, String jenis, String warna,
                  int umur, String makananFavorit) {

        super(nama, umur);

        setJenis(jenis);
        setWarna(warna);
        setMakananFavorit(makananFavorit);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        if (jenis != null && !jenis.trim().isEmpty()) {
            this.jenis = jenis;
        } else {
            System.out.println("Jenis tidak valid! Jenis tidak boleh kosong.");
        }
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        if (warna != null && !warna.trim().isEmpty()) {
            this.warna = warna;
        } else {
            System.out.println("Warna tidak valid! Warna tidak boleh kosong.");
        }
    }

    public String getMakananFavorit() {
        return makananFavorit;
    }

    public void setMakananFavorit(String makananFavorit) {
        if (makananFavorit != null && !makananFavorit.trim().isEmpty()) {
            this.makananFavorit = makananFavorit;
        } else {
            System.out.println(
                "Makanan favorit tidak valid! Tidak boleh kosong."
            );
        }
    }

    public void tampilkanData() {
        System.out.println("Nama            : " + getNama());
        System.out.println("Jenis           : " + getJenis());
        System.out.println("Warna           : " + getWarna());
        System.out.println("Umur            : " + getUmur() + " tahun");
        System.out.println("Makanan Favorit : " + getMakananFavorit());
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: Meong!");
    }
}