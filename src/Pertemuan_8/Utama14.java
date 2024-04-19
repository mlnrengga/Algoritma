package Pertemuan_8;
import java.util.Scanner;

public class Utama14 {
    public static void main(String[] args) {
        Gudang14 gudang = new Gudang14(7);
        Scanner sc14 = new Scanner(System.in);

        while (true){
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
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
                    break;  
                default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}