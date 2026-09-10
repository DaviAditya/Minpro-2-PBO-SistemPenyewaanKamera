/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.ArrayList;
import com.mycompany.kamera.Customer;
import com.mycompany.kamera.Kamera;
import com.mycompany.kamera.Penyewaan;

/**
 *
 * @author Dovs
 */
public class main {
    
    public static void main(String[] args) {
        
        ArrayList<Customer> listCustomer = new ArrayList<>();
        ArrayList<Kamera> listKamera = new ArrayList<>();
        ArrayList<Penyewaan> listPenyewaan = new ArrayList<>();
        
        // Data default kamera dengan ID Integer (1, 2, 3)
        listKamera.add(new Kamera(1, "Canon 600d", 50000));
        listKamera.add(new Kamera(2, "Nikon D3200", 50000));
        listKamera.add(new Kamera(3, "Fujifilm X-A3", 50000));
        
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        
        while (pilihan != 6) {
            System.out.println("==================================================");
            System.out.println("              ____________________                ");
            System.out.println("             /                    \\               ");
            System.out.println("      ______/                      \\______        ");
            System.out.println("     /      |      __________      |      \\       ");
            System.out.println("    |       |     /          \\     |       |      ");
            System.out.println("    |       |    |     ()     |    |       |      ");
            System.out.println("    |       |     \\__________/     |       |      ");
            System.out.println("     \\______|______________________|______/       ");
            System.out.println("             \\____________________/               ");
            System.out.println("                                                  ");
            System.out.println("              SISTEM PENYEWAAN KAMERA             ");
            System.out.println("==================================================");
            System.out.println("1. Customer");
            System.out.println("2. Booking Kamera");
            System.out.println("3. Data Penyewaan & Stok");
            System.out.println("4. Batal Penyewaan");
            System.out.println("5. Update Penyewaan");
            System.out.println("6. Keluar");
            System.out.print("Silahkan Input menu (1-6): ");
            pilihan = input.nextInt();
            input.nextLine(); // clear buffer
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n+++ CUSTOMER +++");
                    System.out.print("ID Cust (contoh C1) : ");
                    String idCust = input.nextLine();
                    System.out.print("Nama: ");
                    String namaCust = input.nextLine();
                    System.out.print("No Telepon: ");
                    String noTelp = input.nextLine();
                    listCustomer.add(new Customer(idCust, namaCust, noTelp));
                    System.out.println("Customer telah berhasil disimpan!");
                    break;
                    
                case 2:
                    System.out.println("\n+++ BOOKING KAMERA +++");
                    System.out.print("Masukkan Kode Sewa (contoh S01): ");
                    String kodeSewa = input.nextLine();
                    System.out.print("Masukkan ID Cust: ");
                    idCust = input.nextLine();
                    System.out.print("ID Kamera (masukkan angka 1, 2, atau 3) : ");
                    int idKamera = input.nextInt(); // Meminta input angka
                    System.out.print("Durasi Sewa (/3Jam): ");
                    int durasi3Jam = input.nextInt();
                    input.nextLine(); // clear buffer
                    
                    listPenyewaan.add(new Penyewaan(kodeSewa, idCust, idKamera, durasi3Jam));
                    System.out.println("Booking Kamera berhasil disimpan!");
                    break;
                    
                case 3:
                    System.out.println();
                    System.out.println("============================================");
                    System.out.println("#########  AVAILABLE KAMERA  #########");
                    System.out.println("============================================");
                    for (Kamera l : listKamera) {
                        System.out.println("- ID Kamera: " + l.getIdKamera() + " | Nama: " + l.getNamaKamera() + " | Rp " + l.getHargaSewa() + "/3jam");
                    }
    
                    System.out.println("\n=========================");
                    System.out.println("===== DAFTAR CUSTOMER =====");
                    System.out.println("===========================");
                    if (listCustomer.isEmpty()) {
                        System.out.println("(Cust tidak tersedia)");
                    } else {
                        for (Customer c : listCustomer) {
                            System.out.println("- [" + c.getIdCust() + "] | " + c.getNamaCust() + " | No Telepon: " + c.getNoTelp());
                        }
                    }
    
                    System.out.println("\n===========================");
                    System.out.println("=== DAFTAR PENYEWAAN KAMERA ===");
                    System.out.println("==============================");
                    if (listPenyewaan.isEmpty()) {
                        System.out.println("   (Penyewaan Tidak Tersedia)");
                    } else {
                        for (Penyewaan b : listPenyewaan) {
                            System.out.println("- Kode: " + b.getKodeSewa() + " | ID Customer: " + b.getIdCust() 
                                + " | ID Kamera: " + b.getIdKamera() + " | Durasi Sewa: " + b.getDurasi3Jam() + "x 3 Jam | Total Pembayaran: Rp " + b.hitungTotalBiaya());
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("\n==== HAPUS PENYEWAAN ====");
                    System.out.print("Input Kode Penyewa yang ingin dihapus: ");
                    String kodeHapus = input.nextLine();
                    boolean adaHapus = false;
                    
                    for (int i = 0; i < listPenyewaan.size(); i++) {
                        if (listPenyewaan.get(i).getKodeSewa().equalsIgnoreCase(kodeHapus)) {
                            listPenyewaan.remove(i);
                            System.out.println("Data sewa berhasil dihapus!");
                            adaHapus = true;
                            break;
                        }
                    }
                    if (!adaHapus) System.out.println("Kode Sewa tidak ditemukan!");
                    break;
                    
                case 5: 
                    System.out.println("\n==== UPDATE PENYEWAAN ====");
                    System.out.print("Input Kode Sewa yang ingin Diupdate: ");
                    String kodeUpdate = input.nextLine();
                    boolean adaUpdate = false;
                    
                    for (int i = 0; i < listPenyewaan.size(); i++) {
                        if (listPenyewaan.get(i).getKodeSewa().equalsIgnoreCase(kodeUpdate)) {
                            System.out.print("ID Kamera baru (ketik 0 jika tidak ganti): ");
                            int idKameraBaru = input.nextInt();
                            if (idKameraBaru != 0) {
                                listPenyewaan.get(i).setIdKamera(idKameraBaru);
                            }
                            
                            System.out.print("Durasi sewa baru (/3 JAM): ");
                            int durasiBaru = input.nextInt();
                            listPenyewaan.get(i).setDurasi3Jam(durasiBaru);
                            input.nextLine(); // clear buffer
                            
                            System.out.println("Data Sewa baru berhasil diUpdate!");
                            adaUpdate = true;
                            break;
                        }
                    }   
                    if (!adaUpdate) System.out.println("Kode Sewa tidak ditemukan!");
                    break;
                    
                case 6:
                    System.out.println("\nTerima kasih!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid!");
                    break;
            }
        }
        input.close();
    }    
}