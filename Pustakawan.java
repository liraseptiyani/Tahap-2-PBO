/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tahap2pbo;

/**
 *
 * @author asus
 */
public class Pustakawan {
    private String nama;
    private String nomorpegawai;
    private String jabatan;
    
    public Pustakawan(String nama, String nomorpegawai, String jabatan){
        this.nama = nama;
        this.nomorpegawai = nomorpegawai;
        this.jabatan = jabatan;
        
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorpegawai() {
        return nomorpegawai;
    }

    public void setNomorpegawai(String nomorpegawai) {
        this.nomorpegawai = nomorpegawai;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public void tambahBuku (Buku buku){
        
    }
    
    public void hapusBuku (Buku buku){
        
    }
}
