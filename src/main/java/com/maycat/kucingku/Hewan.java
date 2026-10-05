/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maycat.kucingku;

/**
 *
 * @author Shien
 */

public class Hewan {

    private String nama;
    private int umur;

    public Hewan(String nama, int umur) {
        setNama(nama);
        setUmur(umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak valid! Nama tidak boleh kosong.");
        }
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid! Umur tidak boleh kurang dari 0.");
        }
    }

    // Method suara
    public void suara() {
        System.out.println("Hewan mengeluarkan suara.");
    }
}