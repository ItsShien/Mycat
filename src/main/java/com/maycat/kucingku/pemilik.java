/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maycat.kucingku;

/**
 *
 * @author Shien
 */
public class pemilik {

    private String namaPemilik;
    private String alamat;

    public pemilik(String namaPemilik, String alamat) {
        setNamaPemilik(namaPemilik);
        setAlamat(alamat);
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        if (namaPemilik != null && !namaPemilik.trim().isEmpty()) {
            this.namaPemilik = namaPemilik;
        } else {
            System.out.println(
                "Nama pemilik tidak valid! Tidak boleh kosong."
            );
        }
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        if (alamat != null && !alamat.trim().isEmpty()) {
            this.alamat = alamat;
        } else {
            System.out.println(
                "Alamat tidak valid! Tidak boleh kosong."
            );
        }
    }

    public void tampilkanPemilik() {
        System.out.println("Nama Pemilik : " + getNamaPemilik());
        System.out.println("Alamat       : " + getAlamat());
    }
}