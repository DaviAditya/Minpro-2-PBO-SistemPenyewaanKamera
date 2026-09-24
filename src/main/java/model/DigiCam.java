/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dovs
 */
public class DigiCam extends Kamera{
    private String efekRetro;
    public DigiCam(int idKamera, String namaKamera, double hargaSewa, String efekRetro) {
        super(idKamera, namaKamera, hargaSewa);
        this.efekRetro = efekRetro;
    }

    public String getEfekRetro() {
        return efekRetro;
    }

    public void setEfekRetro(String efekRetro) {
        this.efekRetro = efekRetro;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | efekRetro: " + efekRetro;
    }
}
