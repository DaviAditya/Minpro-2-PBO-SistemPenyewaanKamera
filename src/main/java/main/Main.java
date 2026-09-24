/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.ArrayList;
import controller.Service;
import model.Kamera;
import model.Penyewaan;
/**
 *
 * @author Dovs
 */
public class Main {
    public static void main(String[] args) {
        Service controller = new Service();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
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
            int pilihan  = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n=== INPUT CUSTOMER BARU ===");
                    System.out.print("ID Customer(C01): ");
                    String idCustomer = scanner.nextLine();
                    System.out.print("Nama Customer: ");
                    String namaCustomer = scanner.nextLine();
                    System.out.println("==>> SUKSES <<== DATA TELAH DITAMBAHKAN ==");
                    break;

                case 2:
                    System.out.println("\n--- INPUT TRANSAKSI BARU ---");
                    System.out.print("Kode Sewa(S001): ");
                    String kodeSewaBooking = scanner.nextLine();
                    System.out.print("ID Customer (C02): ");
                    String idCustBooking = scanner.nextLine();
                    System.out.print("Nama Customer: ");
                    String namaCustBooking = scanner.nextLine();
                    System.out.print("No. Telepon: ");
                    String noTelpBooking = scanner.nextLine();

                    controller.tampilkanKatalogKamera();
                    System.out.print("Pilih ID Kamera: ");
                    int idKamera = 0; 
                    try { 
                        idKamera = Integer.parseInt(scanner.nextLine()); 
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error! ID Kamera harus berupa angka!"); 
                        break;
                    }
                    System.out.print("Durasi (Input 1 untuk Paket 3 Jam): "); 
                    int durasi = 0; 
                    try { 
                        durasi = Integer.parseInt(scanner.nextLine());
                    } 
                    catch (NumberFormatException e) {
                        System.out.println("Error! Durasi harus berupa angka!"); 
                        break; }
                    
                    controller.tambahPenyewaan(
                        kodeSewaBooking,
                        idCustBooking,
                        namaCustBooking,
                        noTelpBooking,
                        idKamera,
                        durasi
                    );
                    break;

                case 3:
                    controller.tampilkanSemuaSewa();
                    break;

                case 4:
                    System.out.println("\n=== BATAL PENYEWAAN ===");
                    System.out.print("Masukkan Kode Sewa yang DIBATALKAN (S001): ");
                    String kodeBatal = scanner.nextLine();
                    controller.batalPenyewaan(kodeBatal);
                    break;

                case 5:
                    System.out.println("\n=== PERBARUI DATA PENYEWAAN ===");
                    System.out.print("Masukkan Kode Sewa yang ingin diUPDATE (S001): ");
                    String kodeSewaUpdate = scanner.nextLine();
                    System.out.println("\nPilih Bagian yang Ingin DiUPDATE: ");                  
                    System.out.println("1. ID Customer");
                    System.out.println("2. Nama Customer");
                    System.out.println("3. No. Telepon");
                    System.out.println("4. Kamera");
                    System.out.println("5. Durasi");
                    System.out.println("6. Kembali");
                    System.out.println("Pilih menu yang ingin di UPDATE: ");
                    int pilihanUpdate = scanner.nextInt();
                    scanner.nextLine();
                          // NESTED SWITCH
                    switch (pilihanUpdate) {
                        case 1: {
                            System.out.print("ID Customer Baru (CO2): ");
                            String idCustUpdate = scanner.nextLine();

                            controller.updateIdCustomer(kodeSewaUpdate, idCustUpdate);                     
                            break;
                        }

                        case 2: {
                            System.out.print("Nama Customer Baru: ");
                            String namaCustUpdate = scanner.nextLine();

                            controller.updateNamaCustomer(kodeSewaUpdate,namaCustUpdate);
                            break;
                        }

                        case 3: {
                            System.out.print("No. Telepon Baru: ");
                            String noTelpUpdate = scanner.nextLine();

                            controller.updateNoTelepon(kodeSewaUpdate,noTelpUpdate);
                            break;
                        }

                        case 4: {
                            controller.tampilkanKatalogKamera();
                            System.out.println("Pilih ID Kamera Baru: ");
                            int idKameraUpdate = Integer.parseInt(scanner.nextLine());
                            controller.updateKamera(kodeSewaUpdate,idKameraUpdate);
                            break;
                        }

                        case 5: {
                            System.out.println("Durasi baru (1 untuk paket): ");
                            int durasiUpdate = Integer.parseInt(scanner.nextLine());
                            controller.updateDurasi(kodeSewaUpdate, durasiUpdate);                  
                            break;
                        }

                        case 6: {
                            System.out.println("Kembali ke menu utama.");  
                            break;
                        }

                        default:
                            System.out.println("Error!! Pilihan update tidak valid!");
                            break;
                    }
                    break;
                           
                case 6:
                    running = false;
                    System.out.println("\nTerima Kasih telah menggunakan sistem ini! See uu nekstaym");
                    break;
                default:
                    System.out.println("\nError!! Pilihan tidak valid!");                    
                    break;
            }
        }
        scanner.close();
        }
    }