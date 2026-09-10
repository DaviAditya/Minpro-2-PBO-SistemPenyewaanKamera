/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kamera;

/**
 *
 * @author Dovs
 */
public class Customer {
    private String idCust;
    private String namaCust;
    private String noTelp;
    
    // Contructor
    public Customer(String idCust, String namaCust,String noTelp){
        this.idCust = idCust;
        this.namaCust = namaCust;
        this.noTelp = noTelp;
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
        this.noTelp = noTelp;
    }
}
