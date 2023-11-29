package com.mycompany.tahap2pbo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Tahap2PBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 

        String namaPenerimaNotifikasi = ""; 
        boolean isPustakawan = false; 
        
        List<Buku> daftarBuku = new ArrayList<>();

       System.out.println("Selamat datang di Perpustakaan XYZ!");
        System.out.println("Silakan login sebagai:");
        System.out.println("1. Anggota");
        System.out.println("2. Pustakawan");
        System.out.print("Pilih (1/2): ");
        int loginChoice = scanner.nextInt();

        if (loginChoice == 2) {
            isPustakawan = true;
            System.out.println("Login Pustakawan berhasil!");
        } else {
            System.out.println("Login Anggota berhasil!");
        }

        int choice;
        do {
            System.out.println("\nPerpustakaan XYZ!");

            if (isPustakawan) {
                System.out.println("Menu Pustakawan");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Hapus Buku");
                System.out.println("3. Lihat Ketersediaan Buku");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("\n--- Tambah Buku ---");
                        System.out.print("Judul Buku: ");
                        String judul = scanner.next();
                        System.out.print("Nama Pengarang: ");
                        String pengarang = scanner.next();
                        System.out.print("Nomor Buku: ");
                        String nomorBuku = scanner.next();

                        Buku bukuBaru = new Buku(judul, pengarang, nomorBuku);
                        daftarBuku.add(bukuBaru);

                        System.out.println("Buku berhasil ditambahkan!");
                    }
                    case 2 -> {
                        System.out.println("\n--- Hapus Buku ---");
                        System.out.print("Nomor Buku: ");
                        String nomorBukuHapus = scanner.next();

                        daftarBuku.removeIf(buku -> buku.getNomorISBN().equals(nomorBukuHapus));

                        System.out.println("Buku berhasil dihapus!");
                    }
                    case 3 -> {
                        System.out.println("\n--- Lihat Ketersediaan Buku ---");
                        lihatKetersediaanBuku(daftarBuku);
                    }
                    case 4 -> System.out.println("Terima kasih. Telah berkunjung ke Perpustakaan XYZ.");
                    default -> System.out.println("Pilihan tidak valid. Pilih menu 1-4.");
                }
            } else {
                System.out.println("Menu Anggota:");
                System.out.println("1. Peminjaman");
                System.out.println("2. Pengembalian");
                System.out.println("3. Notifikasi");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                choice = scanner.nextInt();
                
                switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Peminjaman ---");
                    System.out.print("Nama Anggota: ");
                    String namaAnggota = scanner.next();
                    System.out.print("Judul Buku: ");
                    String judul = scanner.next();
                    System.out.print("Nama Pengarang: ");
                    String pengarang = scanner.next();
                    System.out.print("Nomor Buku: ");
                    String nomorBuku = scanner.next();
                    System.out.print("Durasi Peminjaman (in days): ");
                    int durasiPeminjaman = scanner.nextInt();
                    scanner.nextLine(); 

                    namaPenerimaNotifikasi = namaAnggota;

                    System.out.println("\nInformasi Peminjaman:");
                    System.out.println("Nama Anggota: " + namaAnggota);
                    System.out.println("Judul Buku: " + judul);
                    System.out.println("Nomor Buku: " + nomorBuku);
                    System.out.println("Tanggal Peminjaman: " + dateFormat.format(new Date()));
                    System.out.println("Durasi Peminjaman: " + durasiPeminjaman + " days");
                    Date tanggalKembali = new Date(System.currentTimeMillis() + (durasiPeminjaman * 24 * 60 * 60 * 1000));
                    System.out.println("Tanggal Kembali: " + dateFormat.format(tanggalKembali));
                }
                case 2 -> {
                    System.out.println("\n--- Pengembalian ---");
                    System.out.print("Nama Anggota: ");
                    String namaAnggotaPengembalian = scanner.next();
                    System.out.print("Judul Buku: ");
                    String judulBukuPengembalian = scanner.next();
                    System.out.print("Nomor Buku: ");
                    String nomorBukuPengembalian = scanner.next();
                    System.out.print("Tanggal Pengembalian (yyyy-MM-dd): ");
                    String tanggalPengembalianInput = scanner.next();
                    try {
                        Date tanggalPengembalian = dateFormat.parse(tanggalPengembalianInput);

                        System.out.println("\nInformasi Pengembalian:");
                        System.out.println("Nama Anggota: " + namaAnggotaPengembalian);
                        System.out.println("Judul Buku: " + judulBukuPengembalian);
                        System.out.println("Nomor Buku: " + nomorBukuPengembalian);
                        System.out.println("Tanggal Pengembalian: " + dateFormat.format(tanggalPengembalian));
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                    }
                }
                case 3 -> {
                    Notifikasi notifikasi = new Notifikasi("Reminder", namaPenerimaNotifikasi);
                    notifikasi.mengirimNotifikasi(); 
                }

                case 4 -> System.out.println("Terima kasih. Telah berkunjung ke Perpustakaan XYZ.");

                default -> System.out.println("Pilihan tidak valid. Pilih menu 1-" + (isPustakawan? "6" : "4") + ".");
                }
            }
        }while ((isPustakawan && choice != 4) || (!isPustakawan && choice != 4));
    }

    private static void lihatKetersediaanBuku(List<Buku> daftarBuku) {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang tersedia.");
        } else {
            System.out.println("Ketersediaan Buku:");
            for (Buku buku : daftarBuku) {
                System.out.println("Judul: " + buku.getJudul() + ", Pengarang: " + buku.getPengarang() + ", Nomor Buku: " + buku.getNomorISBN());
            }
        }
    }
}
