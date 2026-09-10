/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kamera;

/**
 *
 * @author Dovs
 */
public class Penyewaan {
    private String kodeSewa;
    private String idCust;
    private int idKamera;
    private int durasi3Jam;
    
    // Constructor
    public Penyewaan(String kodeSewa, String idCustomer, int idKamera, int durasi3jam) {
        this.kodeSewa = kodeSewa;
        this.idCust = idCust;
        this.idKamera = idKamera;
        this.durasi3Jam = durasi3Jam;
    }   
    
    public String getKodeSewa() {
        return kodeSewa;
    }

    public void setKodeSewa(String kodeSewa) {
        this.kodeSewa = kodeSewa;
    }

    public String getIdCust() {
        return idCust;
    }

    public void setIdCust(String idCust) {
        this.idCust = idCust;
    }

    public int getIdKamera() {
        return idKamera;
    }

    public void setIdKamera(int idKamera) {
        this.idKamera = idKamera;
    }

    public int getDurasi3Jam() {
        return durasi3Jam;
    }

    public void setDurasi3Jam(int durasi3Jam) {
        this.durasi3Jam = durasi3Jam;
    }
    // Method hitung total biaya
    public double hitungTotalBiaya() {
        return durasi3Jam * 50000;
    }
}
