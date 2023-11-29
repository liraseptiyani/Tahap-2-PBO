/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tahap2pbo;

import java.util.Date;

/**
 *
 * @author asus
 */
public class Peminjaman {
    private Date tanggalPinjam;
    private Date tanggalKembali;
    private int durasiPeminjaman;
    
    public Peminjaman(Date tanggalPinjam, Date tanggalKembali, int durasiPeminjaman){
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }
    
    public void hitungDurasiPeminjaman(){
        
    }
    
}
