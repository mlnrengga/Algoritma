package Pertemuan_3.Tugas_2;

import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = sc14.next();
            System.out.print("Masukkan nim: ");
            long nim = sc14.nextLong();
            System.out.print("Masukkan jenis kelamin: ");
            char kelamin = sc14.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = sc14.nextDouble();
            mahasiswa[i] = new Mahasiswa(nama, nim, kelamin, ipk);
        } 
        
        System.out.println("");
        for (int i = 0; i < 3; i++){
            System.out.println("Data mahasiswa ke-" + i+1);
            System.out.println("Nama: " +  mahasiswa[i].nama);
            System.out.println("NIM: " + mahasiswa[i].nim);
            System.out.println("Jenis kelamin: " + mahasiswa[i].kelamin);
            System.out.println("Nilai IPK: " + mahasiswa[i].ipk);
        } 
        
        System.out.println("");
        Mahasiswa.printRataIPK(mahasiswa);
        Mahasiswa.printIPKTerbesar(mahasiswa);
    }
}
