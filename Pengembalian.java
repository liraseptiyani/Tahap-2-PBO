package com.mycompany.tahap2pbo;

import java.util.Date;

public class Pengembalian {
    private Date tanggalKembali;
    private double denda;
    
    public Pengembalian(Date tanggalKembali, double denda){
        this.tanggalKembali = tanggalKembali;
        this.denda = denda;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
    
    public void hitungDenda(){
        
    }
}
