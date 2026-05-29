SISTEM MANAJEMEN PERPUSTAKAAN DIGITAL

DESKRIPSI PROGRAM 
Program ini merupakan aplikasi berbasis Java yang digunakan untuk membantu pengelolaan data buku perpustakaan. Sistem dibuat menggunakan konsep struktur data dan algoritma seperti CRUD, searching, sorting, dan file handling. Program berjalan melalui console atau terminal dan menggunakan file txt sebagai media penyimpanan data.

FITUR PROGRAM

1. Tambah data buku
2. Menampilkan seluruh data buku
3. Edit data buku berdasarkan ID
4. Hapus data buku menggunakan soft delete
5. Cari buku berdasarkan nama menggunakan Linear Search
6. Cari buku berdasarkan ID menggunakan Binary Search
7. Cari buku berdasarkan kategori
8. Sorting data berdasarkan ID
9. Sorting data berdasarkan judul buku
10. Sorting data berdasarkan stok buku
11. Update status buku
12. Menampilkan statistik data buku
13. Save data ke file txt
14. Load data dari file txt

BAHASA DAN TOOLS
* Bahasa Pemrograman: Java
* Java Development Kit (JDK) versi 8 atau lebih baru

CARA MENJALANKAN PROGRAM
Pastikan Java JDK sudah terinstall pada komputer.
Simpan file program dengan nama: ProjekPerpus.java
Buka terminal atau command prompt pada folder project.
Compile program menggunakan perintah: javac ProjekPerpus.java
Setelah proses compile berhasil, jalankan program menggunakan perintah: java ProjekPerpus

CARA PENGGUNAAN PROGRAM 
Setelah program dijalankan, akan muncul menu utama sistem manajemen perpustakaan digital. Pengguna dapat memilih menu sesuai kebutuhan dengan memasukkan nomor pilihan yang tersedia.

MENU PROGRAM :
1. Tambah Data Buku
2. Tampilkan Semua Buku
3. Edit Data Buku Berdasarkan ID
4. Hapus Data Buku Berdasarkan ID
5. Cari Buku Berdasarkan Nama
6. Cari Buku Berdasarkan ID
7. Cari Buku Berdasarkan Kategori
8. Urutkan Buku Berdasarkan ID
9. Urutkan Buku Berdasarkan Judul
10. Urutkan Buku Berdasarkan Stok
11. Update Status Buku
12. Status Ketersediaan Buku
13. Statistik Data Buku
14. Save Data Buku
15. Load Data Buku
16. Keluar

PENYIMPANAN DATA 
Program menggunakan file dataBuku.txt untuk menyimpan data buku. Data disimpan menggunakan format: id;judul;kategori;stok;status

CONTOH DATA : 
1;Algoritma dan Pemrograman;Teknologi;10;tersedia 
Fitur save data digunakan untuk menyimpan data ke file txt, sedangkan fitur load data digunakan untuk membaca kembali data dari file tersebut.

CATATAN

* Program berjalan berbasis console atau terminal.
* Program belum menggunakan database.
* Pastikan file dataBuku.txt berada pada folder yang sama dengan file Java.
* Program menggunakan array dengan kapasitas maksimal 100 data buku.
* Jika file data tidak ditemukan, sistem akan menampilkan pesan error sesuai kondisi program.
