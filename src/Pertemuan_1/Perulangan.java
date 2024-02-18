package Pertemuan_1;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        Long noIndukMahasiswa;
        System.out.print("Masukkan NIM :");
        noIndukMahasiswa = sc15.nextLong();
        int n = (int) (noIndukMahasiswa % 100);
        if (n < 10) {
        }
        n += 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                if (i != 6 && i != 10) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("");

                }
            }
        }
        sc15.close();
    }
}