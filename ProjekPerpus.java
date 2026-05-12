import java.util.Scanner;

class Buku {
    int id;
    String judul;
    String kategori;
    int stok;
    boolean aktif;

    Buku(int id, String judul, String kategori, int stok) {
        this.id = id;
        this.judul = judul;
        this.kategori = kategori;
        this.stok = stok;
        this.aktif = true;
    }
}

public class ProjekPerpus {
    static Scanner input = new Scanner(System.in);
    static Buku[] dataBuku = new Buku[100];
    static int jumlahData = 0;

    public static void main(String[] args) {
        isiDataAwal(); 

        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Data Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Edit Data Buku Berdasarkan ID");
            System.out.println("4. Hapus Data Buku Berdasarkan ID");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tampilkanBuku();
                    break;
                case 3:
                    editBuku();
                    break;
                case 4:
                    hapusBuku();
                    break;
                case 5:
                    System.out.println("Program selesai, Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);
    }

    static void isiDataAwal() {
        dataBuku[jumlahData++] = new Buku(1, "Algoritma dan Pemrograman", "Teknologi", 10);
        dataBuku[jumlahData++] = new Buku(2, "Struktur Data", "Teknologi", 8);
        dataBuku[jumlahData++] = new Buku(3, "Basis Data", "Teknologi", 12);
        dataBuku[jumlahData++] = new Buku(4, "Jaringan Komputer", "Teknologi", 7);
        dataBuku[jumlahData++] = new Buku(5, "Sistem Operasi", "Teknologi", 9);
        dataBuku[jumlahData++] = new Buku(6, "Pemrograman Java", "Teknologi", 15);
        dataBuku[jumlahData++] = new Buku(7, "Pemrograman Python", "Teknologi", 11);
        dataBuku[jumlahData++] = new Buku(8, "Machine Learning", "Teknologi", 6);
        dataBuku[jumlahData++] = new Buku(9, "Artificial Intelligence", "Teknologi", 5);
        dataBuku[jumlahData++] = new Buku(10, "Data Mining", "Teknologi", 8);

        dataBuku[jumlahData++] = new Buku(11, "Laskar Pelangi", "Novel", 20);
        dataBuku[jumlahData++] = new Buku(12, "Bumi Manusia", "Novel", 14);
        dataBuku[jumlahData++] = new Buku(13, "Ayat-Ayat Cinta", "Novel", 18);
        dataBuku[jumlahData++] = new Buku(14, "Dilan 1990", "Novel", 22);
        dataBuku[jumlahData++] = new Buku(15, "Perahu Kertas", "Novel", 16);

        dataBuku[jumlahData++] = new Buku(16, "Sejarah Indonesia", "Sejarah", 13);
        dataBuku[jumlahData++] = new Buku(17, "Sejarah Dunia", "Sejarah", 9);
        dataBuku[jumlahData++] = new Buku(18, "Perang Dunia II", "Sejarah", 7);
        dataBuku[jumlahData++] = new Buku(19, "Kerajaan Majapahit", "Sejarah", 10);
        dataBuku[jumlahData++] = new Buku(20, "Kerajaan Sriwijaya", "Sejarah", 8);

        dataBuku[jumlahData++] = new Buku(21, "Fisika Dasar", "Sains", 11);
        dataBuku[jumlahData++] = new Buku(22, "Kimia Dasar", "Sains", 12);
        dataBuku[jumlahData++] = new Buku(23, "Biologi Dasar", "Sains", 14);
        dataBuku[jumlahData++] = new Buku(24, "Astronomi", "Sains", 6);
        dataBuku[jumlahData++] = new Buku(25, "Geologi", "Sains", 5);

        dataBuku[jumlahData++] = new Buku(26, "Manajemen Bisnis", "Ekonomi", 9);
        dataBuku[jumlahData++] = new Buku(27, "Akuntansi Dasar", "Ekonomi", 10);
        dataBuku[jumlahData++] = new Buku(28, "Ekonomi Mikro", "Ekonomi", 8);
        dataBuku[jumlahData++] = new Buku(29, "Ekonomi Makro", "Ekonomi", 7);
        dataBuku[jumlahData++] = new Buku(30, "Keusahaan", "Ekonomi", 13);
    }

    static void tambahBuku() {
        System.out.println("\n=== TAMBAH DATA BUKU ===");

        System.out.print("Masukkan ID Buku: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Judul Buku: ");
        String judul = input.nextLine();

        System.out.print("Masukkan Kategori Buku: ");
        String kategori = input.nextLine();

        System.out.print("Masukkan Stok Buku: ");
        int stok = input.nextInt();
        input.nextLine();

        dataBuku[jumlahData++] = new Buku(id, judul, kategori, stok);

        System.out.println("Data buku berhasil ditambahkan.");
    }

    static void tampilkanBuku() {
        System.out.println("\n=== DAFTAR BUKU ===");

        if (jumlahData == 0) {
            System.out.println("Belum ada data buku.");
            return;
        }

        System.out.println("===============================================");
        System.out.println("ID | Judul | Kategori | Stok");
        System.out.println("===============================================");

        for (int i = 0; i < jumlahData; i++) {
            if (dataBuku[i].aktif == true) {
                System.out.println(
                    dataBuku[i].id + " | " +
                    dataBuku[i].judul + " | " +
                    dataBuku[i].kategori + " | " +
                    dataBuku[i].stok
                );
            }
        }

        System.out.println("===============================================");
    }

    static void editBuku() {
        System.out.println("\n=== EDIT DATA BUKU ===");

        System.out.print("Masukkan ID Buku: ");
        int id = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            if (dataBuku[i].id == id && dataBuku[i].aktif == true) {
                System.out.print("Judul Baru: ");
                dataBuku[i].judul = input.nextLine();

                System.out.print("Kategori Baru: ");
                dataBuku[i].kategori = input.nextLine();

                System.out.print("Stok Baru: ");
                dataBuku[i].stok = input.nextInt();
                input.nextLine();

                System.out.println("Data berhasil diedit.");
                return;
            }
        }

        System.out.println("Data tidak ditemukan.");
    }

    static void hapusBuku() {
        System.out.println("\n=== HAPUS DATA BUKU ===");

        System.out.print("Masukkan ID Buku: ");
        int id = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            if (dataBuku[i].id == id && dataBuku[i].aktif == true) {
                dataBuku[i].aktif = false;
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }

        System.out.println("Data tidak ditemukan.");
    }

    static void cariBuku() {
 
        System.out.println("\n=== MENCARI BUKU ===");

        System.out.println("Masukkan nama buku buku: ");
        String cari = input.nextLine();

        boolean ditemukan = false;


    }
}
