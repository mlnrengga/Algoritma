package Pertemuan_5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        System.out.println("=================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int totalPerusahaan = sc14.nextInt();
        Sum[] perusahaan = new Sum[totalPerusahaan];

        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("\nPerusahaan ke-" + (i + 1) + ": ");
            System.out.print("Masukkan jumlah bulan: ");
            perusahaan[i] = new Sum(sc14.nextInt());

            System.out.println("=================================================================");
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.print("Masukkan untung bulanan ke-" + (j + 1) + ": ");
                perusahaan[i].keuntungan[j] = sc14.nextDouble();
            }
        }

        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("\nPerusahaan ke-" + (i + 1) + ": ");
            System.out.println("=================================================================");
            System.out.println("Algorimta Brute Force");
            System.out.println(
                    "Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = "
                            + perusahaan[i].totalBF(perusahaan[i].keuntungan));
            System.out.println("=================================================================");
            System.out.println("Algorimta Divide and Conquer");
            System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = "
                    + perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen - 1));
        }
        sc14.close();
    }
}