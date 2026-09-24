/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dovs
 */
public class KameraDslr extends Kamera {
    private String tipeLensa;
    public KameraDslr(int idKamera, String namaKamera, double hargaSewa, String tipeLensa) {
        super(idKamera, namaKamera, hargaSewa);
        this.tipeLensa = tipeLensa;
     }
    
    public String getTipeLensa() {
        return tipeLensa;
    }
    
    public void setTipeLensa(String tipeLensa) {
        this.tipeLensa = tipeLensa;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Tipe Lensa: " + tipeLensa;
    }
}
