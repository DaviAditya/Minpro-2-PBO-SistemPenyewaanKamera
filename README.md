# Sistem Penyewaan Kamera
### Nama: Muhammad Davi Aditya Pratama
### NIM: 2509116070

## Deskripsi Singkat Program
Program ini merupakan sistem penyewaan kamera berbasis bahasa java yang dibuat untuk mempermudah proses pengelolaan pada Penyewaan Kamera. Program ini mengelola transaksi penyewaan kamera, katalog stok kamera, serta data pelanggan. Pada program ini memiliki beberapa package dan class seperti: 

  <img width="377" height="276" alt="image" src="https://github.com/user-attachments/assets/400d7876-25c2-43f3-b905-d096adad9189" />  

1. Package model  
   Berisi entitas data dan logika dasar objek yang digunakan dalam sistem:
  - Kamera.java: Superclass utama yang mendefinisikan atribut umum kamera (seperti ID, nama, dan harga sewa) serta method penghitungan biaya.
  - KameraDslr.java: Subclass turunan dari Kamera yang merepresentasikan kamera jenis DSLR dengan atribut spesifik tipe lensa.
  - KameraMirorrless.java: Subclass turunan dari Kamera yang merepresentasikan kamera mirrorless dengan atribut spesifik ketersediaan fitur 4K.
  - DigiCam.java: Subclass turunan dari Kamera yang merepresentasikan kamera digital (digicam) dengan atribut spesifik pilihan efek retro.
  - Penyewaan.java: Class entitas yang menyimpan data transaksi penyewaan (kode sewa, data pelanggan, objek kamera yang disewa, dan durasi).
2. Package controller
    Berisi logika bisnis dan pemrosesan data sistem Service.java Mengelola seluruh operasi manipulasi data (CRUD) di dalam ArrayList, seperti menyimpan daftar katalog kamera, menampilkan transaksi, menambah transaksi baru, membatalkan transaksi, serta memperbarui (update) data penyewaan.
3. Package main
    Berisi kelas utama sebagai titik masuk (entry point) program. Main.java Bertindak sebagai View/User Interface berbasis teks. Berisi menu interaktif, menerima      inputan pengguna menggunakan Scanner, serta memanggil fungsi-fungsi dari Service dalam perulangan while.
    
## Alur Program  
A. Dokumentasi dibawah merupakan output yang akan tertampil ketika file dijalankan (Run File).  Tampilan dibawah merupakan tampilan awal dari Sistem Penyewaan Kamera. Menu yang ada pada sistem ini antara lain: 
  1. Customer
  2. Booking Kamera
  3. Data Penyewaan & Stok
  4. Batal Penyewaan
  5. Update Penyewaan
  6. Keluar  
<img height="300" alt="image" src="https://github.com/user-attachments/assets/252846eb-e3eb-4192-9547-7bde2d2a8edd" />

1. Menu Customer  
   Pada menu ini akan dilakukan input untuk data customer seperti id dan nama. Menu ini berfungsi sebagai sarana registrasi
   atau pendataan awal bagi pelanggan yang ingin menyewa kamera.  
    <img height="250" alt="image" src="https://github.com/user-attachments/assets/e5a45b57-d211-479c-80f8-8ce8524635dc" />  
    Untuk menu ini, input yang dilakukan adalah input id Customer dan nama customer.
  
2. Booking Camera
   Menu ini berfungsi untuk memproses transaksi penyewaan kamera baru secara langsung. Pengguna akan menginputkan data transaksi (Kode Sewa), identitas penyewa (ID, Nama, No. Telepon), memilih kamera berdasarkan katalog yang ditampilkan, serta menentukan durasi sewa. Data yang diinputkan akan disimpan secara otomatis ke dalam ArrayList transaksi melalui Service.  
   <img height="400" alt="image" src="https://github.com/user-attachments/assets/1c5566fa-91a1-4f53-8f98-c0c7e7ea17c8" />  
   Pada menu akan diminta untuk input Kode Sewa, id Customer, Nama Customer, No Telpon dari customer tersebut. Setelah itu akan tertampil katalog dari kamera yang tersedia dan untuk memilih kamera tersebut cukup memasukkan id kamera tersebut. Selanjutnya sistem akan meminta input kembali berupa paket penyewaan dari kamera, untuk penyewaan kameranya sendiri hanya ada paket 3 jam dan untuk memilih paket tersebut cukup input angka 1 untuk penyewaan 3 jam pertama. Jika lebih maka berlaku kelipatan, misal sewa 6 jam berarti input 2.

3. Data Penyewaan & Stock
   Menu ini berfungsi untuk menampilkan seluruh riwayat transaksi penyewaan yang tersimpan di dalam sistem (ArrayList). Informasi yang ditampilkan meliputi Kode   Sewa, data diri penyewa, detail jenis kamera yang dipinjam, kalkulasi durasi jam sewa, hingga total biaya sewa yang harus dibayar.  
   <img width="432" height="486" alt="image" src="https://github.com/user-attachments/assets/326b8397-dc9d-4fa3-8c9f-8cf3a703c96e" />  
  Terlihat pada dokumentasi implementasi diatas, terdapat data dari customer sepert nama dan no telepon, lalu ada kamera yang dipinjam, paket yang dipilih serta total biaya yang dikeluarkan dalam peminjaman tersebut.

4. Batal Penyewaan
   Menu ini berfungsi untuk membatalkan transaksi penyewaan yang sudah tercatat. Pengguna cukup memasukkan Kode Sewa yang ingin dibatalkan, kemudian sistem akan mencari data tersebut di dalam ArrayList dan menghapusnya.
   <img width="490" height="246" alt="image" src="https://github.com/user-attachments/assets/2142c342-b8d9-4d54-b670-f2733fa289e0" />  
   Untuk membatalkan atau menghapus penyewaan cukup masukkan kode sewa dan sistem akan menghapus keseluruhan data dari kode sewa tersebut.
   
   <img width="410" height="377" alt="image" src="https://github.com/user-attachments/assets/542a2e24-40cc-45a0-8264-3ad22e428b76" />
       
   Diatas adalah contoh hasil dari penghapusan data penyewaan, terlihat kode sewa S002 telah terhapus dan tidak tertampil di menu Data Penyewaan.
   
5. Update Penyewaan
   Menu ini berfungsi untuk memperbarui atau mengedit detail data transaksi penyewaan yang sudah ada. Pengguna dapat memilih bagian spesifik yang ingin diubah melalui
   submenu (ID Customer, Nama Customer, No. Telepon, Jenis Kamera, atau Durasi Sewa). Informasi baru akan diperbarui secara fleksibel tanpa harus menghapus transaksi.  
   <img height="300" alt="image" src="https://github.com/user-attachments/assets/ddfdd26d-6a1d-4244-a7dc-f3bb7576094c" />  
   Pada contoh implementasi diatas, penggunaan menu ini dimulai dengan menginput kode sewa yang ingin diupdate.  
    <img width="807" height="360" alt="Screenshot 2026-09-24 210305" src="https://github.com/user-attachments/assets/049309f9-8ff2-46bc-90e4-08f217f29428" />   
   Setelah menginput kode sewa yang ingin di update, akan muncul pilihan menu update pada bagian mana, seperti nama customer dan lain sebagainya. Pada contoh diatas, update yang digunakan adalah update kamera dari kamera Dslr1 menjadi Digicam1.  
   <img height="162" alt="image" src="https://github.com/user-attachments/assets/13f8112e-95e6-49d6-b9f1-a1a26f3d4cdd" />  
   Dokumentasi diatas merupakan hasil update.

6. Keluar
   Menu ini berfungsi untuk menghentikan perulangan program (looping). Saat dipilih, sistem akan mengubah status variabel pengontrol menjadi false dan menutup program.  
   <img height="200" alt="image" src="https://github.com/user-attachments/assets/7edfbb5c-d5bc-433b-903b-e39e838a999b" />  
   Dokumentasi diatas merupakan output yang akan tertampil ketika menginput "6" dimenu utama untuk keluar dari sistem.

## Nilai Tambah
1. Menerapkan struktur MVC  
   <img width="377" height="276" alt="Screenshot 2026-09-24 112933" src="https://github.com/user-attachments/assets/bea410b6-abb8-4fc2-aed9-7ced6e831c10" />  
   A. Model (Package model)  
   - Class: Kamera.java, KameraDslr.java, KameraMirorrless.java, DigiCam.java, dan Penyewaan.java.
   - Penjelasan & Fungsi: Bertanggung jawab mendefinisikan struktur data, entitas, atribut, getter/setter, serta aturan validasi data internal. Package ini tidak mengurusi input dari pengguna (keyboard) maupun tampilan layar.

   B. Controller (Package controller)  
   - Class: Service.java.
   - Penjelasan & Fungsi: Bertindak sebagai jembatan antara View dan Model. Package ini menyimpan daftar data dalam ArrayList (daftarSewa dan daftarKatalog) serta memproses seluruh logika bisnis, seperti pencarian data, penambahan transaksi sewa, pembaruan (update), dan pembatalan.

   C. View (Package main)  
   - Class: Main.java.
   - Penjelasan & Fungsi: Bertindak sebagai antarmuka pengguna berbasis teks (CLI). Package ini bertugas menampilkan menu interaktif ke layar, menerima input angka/teks dari pengguna melalui Scanner, lalu memanggil fungsi yang sesuai pada Service (Controller).  

2. Polymorphism  
   A. Method Overriding pada toString()
   - Letak Kode: Superclass Kamera.java  
    ```java
    @Override
    public String toString() {
        return "Kamera{" +
                "idKamera=" + idKamera +
                ", namaKamera='" + namaKamera + '\'' +
                ", hargaSewa=" + hargaSewa +
                '}';
    }
    ```
    
    * **Letak Kode: Subclass `DigiCam.java`**
    ```java
    @Override
    public String toString() {
        return super.toString() + " | efekRetro: " + efekRetro;
    }
    ```
    
    * **Letak Kode: Subclass `KameraDslr.java`**
    ```java
    @Override
    public String toString() {
        return super.toString() + " | Tipe Lensa: " + tipeLensa;
    }
    ```
    
    * **Letak Kode: Subclass `KameraMirorrless.java`**
    ```java
    @Override
    public String toString() {
        return super.toString() + " | Fitur 4k: " + adaFitur4K;
    }
    ```
