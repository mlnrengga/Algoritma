package Pertemuan_8;

import java.util.Scanner;

public class Utama14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("Masukkan jumlah kapasitas gudang : ");
        Gudang14 gudang = new Gudang14(Integer.parseInt(sc14.nextLine()));

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = sc14.nextInt();
            sc14.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc14.nextInt();
                    sc14.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc14.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc14.nextLine();
                    Barang14 barangBaru = new Barang14(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("\nMasukkan kode barang yang dicari: ");
                    int kodeCari = sc14.nextInt();
                    Barang14 barangDicari = gudang.cariBarang(kodeCari);
                    if (barangDicari != null) {
                        System.out.println("Barang ada di dalam gudang.");
                        System.out.println("Kode barang : " +
                                barangDicari.kode);
                        System.out.println("Nama barang : " +
                                barangDicari.nama);
                        System.out.println("Kategori : " +
                                barangDicari.kategori);
                    } else {
                        System.out.println("Barang tidak ada di dalam gudang.");
                    }
                    break;

                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}