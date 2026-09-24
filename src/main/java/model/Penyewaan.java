/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dovs
 */
public class Penyewaan {
    private String kodeSewa;
    
    // Attribute Customer
    private String idCust;
    private String namaCust;
    private String noTelp;
    
    // Attribute Penyewaan
    private Kamera kamera;
    private int durasi3Jam;

    // Constructor
    public Penyewaan(String kodeSewa, String idCust, String namaCust, String noTelp, Kamera kamera, int durasi3Jam) {
        this.kodeSewa = kodeSewa;
        this.idCust = idCust;
        this.namaCust = namaCust;
        setNoTelp(noTelp);
        this.kamera = kamera;
        setDurasi3Jam(durasi3Jam);
    }

    // Getter dan Setter
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

    public String getNamaCust() {
        return namaCust;
    }

    public void setNamaCust(String namaCust) {
        this.namaCust = namaCust;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        if (noTelp == null || !noTelp.matches("\\d+")) {
            throw new IllegalArgumentException("Nomor telepon harus berupa angka!");
        }
        this.noTelp = noTelp;
    }

    public Kamera getKamera() {
        return kamera;
    }

    public void setKamera(Kamera kamera) {
        this.kamera = kamera;
    }

    public int getDurasi3Jam() {
        return durasi3Jam;
    }

    public void setDurasi3Jam(int durasi3Jam) {
        if (durasi3Jam <= 0) {
            throw new IllegalArgumentException("Durasi sewa minimal 1 paket (3 jam)!");
        }
        this.durasi3Jam = durasi3Jam;
    }

    // Method hitung total biaya menggunakan Polymorphism dari objek Kamera
    public double hitungTotalBiaya() {
        if (kamera != null) {
            return kamera.hitungBiayaSewa(durasi3Jam);
        }
        return 0;
    }
}