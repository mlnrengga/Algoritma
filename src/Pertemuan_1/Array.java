package Pertemuan_1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        double[][] Nilai_MK = new double[2][8];
        String []nilaiHuruf = new String[8];
        int []SKS = {2, 2, 2, 3, 2,2, 3, 2};
        String []MK = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Pratikum Dasar Pemrograman", "Keselematan dan kesehatan kerja"};
        int total_SKS = 0;
        double IP = 0.0, total_Nilai = 0.0;

        System.out.println("=================\n" + "Hitung Nilai IP Semester\n" + "===================");

        for (int i = 0; i < Nilai_MK[0].length; i++) {
            switch (i) {
                case 0 :
                System.out.print("Masukkan nilai MK Pancasila : ");
                Nilai_MK[0][i] = sc15.nextDouble();
                break;

                case 1 :
                System.out.print("Masukkan nilai MK Konsep Teknologi Informasi : ");
                Nilai_MK[0][i] = sc15.nextDouble();
                break;

                case 2 :
                System.out.print("Masukkan nilai MK Critical Thinking dan Problem Solving : ");
                Nilai_MK[0][i] = sc15.nextDouble();
                break;

                case 3 :
                System.out.print("Masukkan nilai MK Matematika Dasar : ");
                Nilai_MK[0][i] = sc15.nextDouble();
                break;

                case 4 :
                System.out.print("Masukkan nilai MK Bahasa Inggris : ");
                Nilai_MK[0][i] = sc15.nextDouble();
                break;

                case 5 :
                System.out.print("Masukkan nilai MK Dasar Pemrograman : ");
                Nilai_MK[0][i] = sc15.nextDouble();
                break;

                case 6 :
                System.out.print("Masukkan nilai MK Pratikum Dasar Pemrograman : ");
                Nilai_MK[0][i] = sc15.nextDouble();
                break;

                case 7 :
                System.out.print("Masukkan nilai MK Keselematan dan kesehatan kerja : ");
                Nilai_MK[0][i] = sc15.nextDouble();
                break;
            }
        }
        System.out.println("======================\n" +  "======================\n" + "Hasil Konversi Nilai\n" + "======================\n" + "======================");

        for (int i = 0; i < Nilai_MK[0].length; i++) {
        if (Nilai_MK[0][i] > 80 && Nilai_MK[0][i] <= 100) {
            nilaiHuruf[i] = "A";
            Nilai_MK[1][i] = 4.00;
        } else if (Nilai_MK[0][i] > 73 && Nilai_MK[0][i] <= 80) {
            nilaiHuruf[i] = "B+";
            Nilai_MK[1][i] = 3.50;
        } else if (Nilai_MK[0][i] > 65 && Nilai_MK[0][i] <= 73) {
            nilaiHuruf[i] = "B";
            Nilai_MK[1][i] = 3.00;
        } else if (Nilai_MK[0][i] > 60 && Nilai_MK[0][i] <= 65) {
            nilaiHuruf[i] = "C+";
            Nilai_MK[1][i] = 2.50;
        } else if (Nilai_MK[0][i] > 50 && Nilai_MK[0][i] <= 60) {
            nilaiHuruf[i] = "C";
            Nilai_MK[1][i] = 2.00;
        } else if (Nilai_MK[0][i] > 39 && Nilai_MK[0][i] <= 50) {
            nilaiHuruf[i] = "D";
            Nilai_MK[1][i] = 1.00;
        } else {
            nilaiHuruf[i] = "E";
            Nilai_MK[1][i] = 0.00;
        }
    }
    System.out.printf("%-40s %-20s %-20s %-20s\n",  "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

    for (int i = 0; i < Nilai_MK[0].length; i++){
        System.out.printf("%-40s %-20.2f %-20s %-20.2f\n", MK[i], Nilai_MK[0][i], nilaiHuruf[i], Nilai_MK[1][i]);
    }
    System.out.println("======================");

    for (int i = 0; i < SKS.length; i++){
        total_SKS += SKS[i];
    }
    for (int i = 0; i < Nilai_MK[0].length; i++){
        total_Nilai += Nilai_MK[1][i] * SKS[i];
    }
    IP = total_Nilai / total_SKS;
    System.out.printf("%-2s %-2.2f", "IP : ", IP);
    sc15.close();
    }
}

