/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.DigiCam;
import model.Kamera;
import model.KameraDslr;
import model.KameraMirorrless;
import model.Penyewaan;
import java.util.ArrayList;
/**
 *
 * @author Dovs
 */
public class Service {
    public ArrayList<Penyewaan> daftarSewa = new ArrayList<>();
    public ArrayList<Kamera> daftarKamera = new ArrayList<>();
    
    public Service() {
        initDummyData();
    }
    private void initDummyData() {
        // Data Katalog Kamera
        Kamera dslr1 = new KameraDslr(101, "Canon EOS 80D", 75000, "18-135mm IS USM");
        Kamera dslr2 = new KameraDslr(102, "Canon EOS 600D", 50000, "18-35mm IS II");
        Kamera mirrorless1 = new KameraMirorrless(103, "Sony A6400", 90000, true);
        Kamera digicam1 = new DigiCam(104, "Canon IXY 650", 40000, "Vintage Film Warm");
        Kamera digicam2 = new DigiCam(105, "Sony Cyber-shot WX350", 45000, "Retro Soft");

        daftarKamera.add(dslr1);
        daftarKamera.add(dslr2);
        daftarKamera.add(mirrorless1);
        daftarKamera.add(digicam1);
        daftarKamera.add(digicam2);

        // Dummy data
        Penyewaan sewa1 = new Penyewaan("S001", "C01", "Budi Santoso", "081234567890", dslr1, 2);
        Penyewaan sewa2 = new Penyewaan("S002", "C02", "Siti Aminah", "089876543210", mirrorless1, 1);
        Penyewaan sewa3 = new Penyewaan("S003", "C03", "Jamaludin", "089822113412", digicam1, 1);
        
        daftarSewa.add(sewa1);
        daftarSewa.add(sewa2);
        daftarSewa.add(sewa3);
    }

    // Getter
    public ArrayList<Kamera> getDaftarKamera() {
        return daftarKamera;
    }

    public ArrayList<Penyewaan> getDaftarSewa() {
        return daftarSewa;
    }

    // Menampilkan Katalog Kamera
    public void tampilkanKatalogKamera() {
        System.out.println("\n=== KATALOG KAMERA TERSEDIA ===");
        for (Kamera k : daftarKamera) {
        System.out.println(k); 
    }
}
    
        // Mnampilkan Semua Transaksi Penyewaan
    public void tampilkanSemuaSewa() {
        System.out.println("\n=== DAFTAR TRANSAKSI PENYEWAAN ===");
        if (daftarSewa.isEmpty()) {
            System.out.println("Belum ada data penyewaan.");
            return;
        }

        for (Penyewaan p : daftarSewa) {
            System.out.println("Kode Sewa   : " + p.getKodeSewa());
            System.out.println("ID Cust     : " + p.getIdCust());
            System.out.println("Nama Cust   : " + p.getNamaCust());
            System.out.println("No. Telp    : " + p.getNoTelp());
            System.out.println("Kamera      : " + p.getKamera().getNamaKamera());
            System.out.println("Durasi      : " + p.getDurasi3Jam() + " Paket (Total " + (p.getDurasi3Jam() * 3) + " Jam)");
            System.out.println("Total Biaya : Rp" + p.hitungTotalBiaya());
            System.out.println("----------------------------------------");
        }
    }

    // Method Create dengan validasi input
    public boolean tambahPenyewaan(String kodeSewa, String idCust, String namaCust, String noTelp, int idKamera, int durasi) {
        try {
            // Cari Kamera berdasarkan ID
            Kamera kameraDipilih = null;
            for (Kamera k : daftarKamera) {
                if (k.getIdKamera() == idKamera) {
                    kameraDipilih = k;
                    break;
                }
            }

            if (kameraDipilih == null) {
                System.out.println("Error!! ID Kamera tidak ditemukan!");
                return false;
            }

            Penyewaan sewaBaru = new Penyewaan(kodeSewa, idCust, namaCust, noTelp, kameraDipilih, durasi);
            daftarSewa.add(sewaBaru);
            System.out.println(">> Sukses << Transaksi sewa berhasil ditambahkan!");
            return true;
            
            } catch (IllegalArgumentException e) {
            System.out.println("Gagal Input " + e.getMessage());
            return false;
        }
    }
    // Method untuk membatalkan penyewaan
    public boolean batalPenyewaan(String kodeSewa) {
        Penyewaan sewaDihapus = null;
        for (Penyewaan p : daftarSewa) {
            if (p.getKodeSewa().equalsIgnoreCase(kodeSewa)) {
                sewaDihapus = p;
                break;
            }
        }
        if (sewaDihapus != null) {
            daftarSewa.remove(sewaDihapus);
            System.out.println(">> Sukses << Penyewaan dengan kode " + kodeSewa + " berhasil dibatalkan.");
            return true;
        } else {
            System.out.println("Error!! Kode sewa " + kodeSewa + " tidak ditemukan!");
            return false;
        }
    }

    // Method untuk mencari penyewaan melalui kode
    private Penyewaan cariSewa(String kodeSewa) {
        for (Penyewaan p : daftarSewa) {
            if (p.getKodeSewa().equalsIgnoreCase(kodeSewa)) {
                return p;
            }
        }
        return null;
    }

    // Method Update ID Cust
    public void updateIdCustomer(String kodeSewa, String idCustBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p != null) {
            p.setIdCust(idCustBaru);
            System.out.println(">> Sukses << ID Customer berhasil diupdate!");
        } else {
            System.out.println("Error!! Kode sewa tidak ditemukan!");
        }
    }

    // Method Update Nama Cust
    public void updateNamaCustomer(String kodeSewa, String namaCustBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p != null) {
            p.setNamaCust(namaCustBaru);
            System.out.println(">> Sukses << Nama Customer berhasil diupdate!");
        } else {
            System.out.println("Error!! Kode sewa tidak ditemukan!");
        }
    }

    // Method Update NoTelp
    public void updateNoTelepon(String kodeSewa, String noTelpBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p != null) {
            p.setNoTelp(noTelpBaru);
            System.out.println(">> Sukses << No Telepon berhasil diupdate!");
        } else {
            System.out.println("Error!! Kode sewa tidak ditemukan!");
        }
    }

    // Method Update Kamera
    public void updateKamera(String kodeSewa, int idKameraBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p != null) {
            Kamera kameraBaru = null;
            for (Kamera k : daftarKamera) {
                if (k.getIdKamera() == idKameraBaru) {
                    kameraBaru = k;
                    break;
                }
            }
            if (kameraBaru != null) {
                p.setKamera(kameraBaru);
                System.out.println(">> Sukses << Kamera berhasil diupdate!");
            } else {
                System.out.println("Error!! ID Kamera baru tidak ditemukan!");
            }
        } else {
            System.out.println("Error!! Kode sewa tidak ditemukan!");
        }
    }

    // Method Update Durasi
    public void updateDurasi(String kodeSewa, int durasiBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p != null) {
            p.setDurasi3Jam(durasiBaru);
            System.out.println(">> Sukses << Durasi penyewaan berhasil diupdate!");
        } else {
            System.out.println("Error!! Kode sewa tidak ditemukan!");
        }
    }
    }
