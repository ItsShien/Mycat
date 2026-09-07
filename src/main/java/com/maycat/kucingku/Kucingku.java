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

        kucing1.tampilkanData();
        kucing1.suara();

        System.out.println();

        kucing2.tampilkanData();
        kucing2.suara();
    }
}
