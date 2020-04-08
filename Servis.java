/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm104.entity;

/**
 *
 * @author User
 */
  
    public class Servis {
    private String id;
    private String nama;
    private String merk;
    private String pemilik;
    private double harga;
    

    public Servis() {
    }

    public Servis(String id, String nama, String merk, String pemilik, double harga){
        this.id = id;
        this.nama = nama;
        this.merk = merk ;
        this.pemilik = pemilik;
        this.harga = harga ;
   
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public boolean insert(Servis srv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}