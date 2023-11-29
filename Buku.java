/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tahap2pbo;

/**
 *
 * @author asus
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String nomorISBN;
    private boolean ketersediaan;
    
    public Buku(String judul, String pengarang, String nomorISBN, boolean ketersediaan){
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.ketersediaan = ketersediaan;
        
    }
    
    public Buku(String judul, String pengarang, String nomorISBN){
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getNomorISBN() {
        return nomorISBN;
    }

    public void setNomorISBN(String nomorISBN) {
        this.nomorISBN = nomorISBN;
    }

    public boolean isKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
    
    public void menambahKoleksi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Nomor ISBN: " + nomorISBN);
    }    

}
