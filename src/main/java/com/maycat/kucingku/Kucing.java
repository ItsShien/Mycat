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

    public Kucing(String nama, String jenis, String warna, int umur, String makananFavorit) {
        super(nama, umur);
        this.jenis = jenis;
        this.warna = warna;
        this.makananFavorit = makananFavorit;
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

    public String getMakananFavorit() {
        return makananFavorit;
    }

    public void setMakananFavorit(String makananFavorit) {
        this.makananFavorit = makananFavorit;
    }

    public void tampilkanData() {
        System.out.println("Nama            : " + getNama());
        System.out.println("Jenis           : " + jenis);
        System.out.println("Warna           : " + warna);
        System.out.println("Umur            : " + getUmur() + " tahun");
        System.out.println("Makanan Favorit : " + makananFavorit);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: Meong!");
    }
}