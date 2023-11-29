/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tahap2pbo;

import java.util.List;

/**
 *
 * @author asus
 */
public class AnggotaPustakawan {
    private String nama;
    private String nomoranggota;
    private String alamat;
    private List<Peminjaman> sejarahpeminjaman;
    
    public AnggotaPustakawan(String nama, String nomoranggota, String alamat, List<Peminjaman> sejarahpeminjaman){
        this.nama = nama;
        this.nomoranggota = nomoranggota;
        this.alamat = alamat;
        this.sejarahpeminjaman = sejarahpeminjaman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomoranggota() {
        return nomoranggota;
    }

    public void setNomoranggota(String nomoranggota) {
        this.nomoranggota = nomoranggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<Peminjaman> getSejarahpeminjaman() {
        return sejarahpeminjaman;
    }

    public void setSejarahpeminjaman(List<Peminjaman> sejarahpeminjaman) {
        this.sejarahpeminjaman = sejarahpeminjaman;
    }
    
    public void minjamBuku(Buku buku){
    
}
    public void kembalikanBuku(Buku buku){
        
    }
            
}
