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
    Berisi logika bisnis dan pemrosesan data sistem Service.java Mengelola seluruh operasi manipulasi data (CRUD) di dalam ArrayList, seperti menyimpan daftar katalog        kamera, menampilkan transaksi, menambah transaksi baru, membatalkan transaksi, serta memperbarui (update) data penyewaan.
3. Package main
    Berisi kelas utama sebagai titik masuk (entry point) program. Main.java Bertindak sebagai View/User Interface berbasis teks. Berisi menu interaktif, menerima inputan      pengguna menggunakan Scanner, serta memanggil fungsi-fungsi dari Service dalam perulangan while.
## Alur Program
## Nilai Tambah
