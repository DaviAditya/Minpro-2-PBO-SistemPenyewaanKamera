/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author Dovs
 */
public class Kamera {
    private int idKamera;
    private String namaKamera;
    private double hargaSewa;

//  Contructor
    public Kamera(int idKamera, String namaKamera, double hargaSewa) {
        this.idKamera = idKamera;
        this.namaKamera = namaKamera;
        this.hargaSewa = hargaSewa;
    }
    // Getter dan Setter
    public int getIdKamera() {
        return idKamera; 
    }
    
    public void setIdKamera(int idKamera) {
        this.idKamera = idKamera;
    }

    public String getNamaKamera() {
        return namaKamera;
    }

    public void setNamaKamera(String namaKamera) {
        this.namaKamera = namaKamera;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }
    public void setHargaSewa(double hargaSewa) {
        if (hargaSewa < 0) {
            throw new IllegalArgumentException ("Harga sewa tidak boleh negatif!");
    }
   this.hargaSewa = hargaSewa;
}
    public double hitungBiayaSewa(int durasi3Jam) {
        return this.hargaSewa * durasi3Jam;
    }

    public String getInfo() {
    return "ID: " + idKamera + " | Nama: " + namaKamera;
}
    
    @Override
    public String toString() {
        return "Kamera{" +
                "idKamera=" + idKamera +
                ", namaKamera='" + namaKamera + '\'' +
                ", hargaSewa=" + hargaSewa +
                '}';
    }
}