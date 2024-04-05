package Pertemuan_7;

import java.util.Scanner;

public class BukuMain14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku14 data = new PencarianBuku14();
        int jumBuku = 5;

        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------");
            System.out.print("Kode buku \t : ");
            String kodeBuku = s.next();
            System.out.print("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku14 m = new Buku14(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Data kesuluruhan buku : ");
        data.tampil();
        System.out.println("_________________________");
        System.out.println("_________________________");
        System.out.println("Pencarian data : ");
        System.out.println("Masukkan kode yang dicari : ");
        System.out.print("Kode buku : ");
        String cari = s.next();
        System.out.println("Masukkan judul buku yang dicari : ");
        System.out.print("Judul buku : ");
        String cariJudul = s.next();
        System.out.println("===============================");
        System.out.println("\tKode buku");
        System.out.println("===============================");
        System.out.println("Menggunakan sequential search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(posisi);
        data.tampilData(posisi);
        //Buku14 dataBuku = data.FindBuku(cari);
        //dataBuku.tampilDataBuku();
        System.out.println("===============================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.findBinarySearch(cari, 0, posisi);
        data.tampilPosisi(posisi);
        data.tampilData(posisi);

        System.out.println("===============================");
        System.out.println("Judul buku");
        System.out.println("===============================");
        System.out.println("Menggunakan sequential search");
        posisi = data.findSeqSearchJudul(cariJudul);
        data.tampilPosisi(posisi);
        data.tampilData(posisi);
        System.out.println("===============================");
        System.out.println("Menggunakan Binary Search");
        data.insertionSortJudul();
        posisi = data.findBinarySearchJudul(cariJudul, 0, jumBuku-1);
        data.tampilPosisi(posisi);
        data.tampilData(posisi);
    }
}