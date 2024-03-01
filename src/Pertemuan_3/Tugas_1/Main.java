package Pertemuan_3.Tugas_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("Masukkan panjang elemen array: ");
        int length = sc14.nextInt();

        Kerucut[] kerArray = new Kerucut[length];
        LimasSegiEmpatSamaSisi[] limArray = new LimasSegiEmpatSamaSisi[length];
        Bola[] bolArray = new Bola[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Kerucut ke-" + i);
            System.out.print("Masukkan jari-jari kerucut: ");
            double rKerucut = sc14.nextDouble();
            System.out.print("Masukkan sisi miring kerucut: ");
            double sKerucut = sc14.nextDouble();
            kerArray[i] = new Kerucut(rKerucut, sKerucut);
        }
        

        for (int i = 0; i < length; i++) {
            System.out.println("Limas ke-" + i);
            System.out.print("Masukkan panjang sisi alas limas: ");
            double aLimas = sc14.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tL = sc14.nextDouble();
            limArray[i] = new LimasSegiEmpatSamaSisi(aLimas, tL);
        }
        

        for (int i = 0; i < length; i++) {
        System.out.println("Bola ke-" + i);
        System.out.print("Masukkan jari-jari bola: ");
        double jBola = sc14.nextDouble();
        bolArray[i] = new Bola(jBola);
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Kerucut ke-" + i + ": ");
            System.out.println("Luas permukaan: " + kerArray[i].luasPermukaan() + ", volume: " + kerArray[i].volume());
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Limas ke-" + i + ": ");
            System.out.println("Luas permukaan: " + limArray[i].luasPermukaan() + ", volume: " + limArray[i].volume());
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Bola ke-" + i + ": ");
            System.out.println("Luas permukaan: " + bolArray[i].luasPermukaan() + ", volume: " + bolArray[i].volume());
        }
    }    
}
