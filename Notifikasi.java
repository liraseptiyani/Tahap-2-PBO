package com.mycompany.tahap2pbo;

public class Notifikasi {
    private String jenis;
    private String penerima;
    private String isiPesan;
    
    public Notifikasi(String jenis, String penerima){
        this.jenis = jenis;
        this.penerima = penerima; 
        this.isiPesan = " Jangan lupa kembalikan buku tepat waktu!";
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public String getIsiPesan() {
        return isiPesan;
    }

    public void setIsiPesan(String isiPesan) {
        this.isiPesan = isiPesan;
    }
    
    public void mengirimNotifikasi(){
        System.out.println("**Notifikasi Baru**");
        System.out.println("Hello " + penerima + "," + isiPesan);
    }
}
