package Pertemuan_1;
import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        int nilaiTgs, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf = " ";

        System.out.println("Program Menghitung Nilai Akhir" + "\n========================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTgs = sc15.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc15.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc15.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc15.nextInt();

        if ((nilaiTgs >= 0 && nilaiTgs <= 100) && (nilaiKuis >= 0 && nilaiKuis <= 100) && (nilaiUTS >= 0 && nilaiUTS <= 100) && (nilaiUAS >= 0 && nilaiUAS <= 100)) {
            nilaiAkhir = (nilaiTgs * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100){
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "c";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else if (nilaiAkhir > 0 && nilaiAkhir <= 39) {
                nilaiHuruf = "E";
            }
            System.out.println("========================\n" + "====================\n" + "Nilai Akhir : " + nilaiAkhir + "\nNilai Huruf : " + nilaiHuruf + "\n====================\n" + "====================");
            if (nilaiAkhir > 50) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
          }  else {
            System.out.println("========================\n" + "=================\n" + "Nilai Tidak Valid\n"+ "=================\n"
            );
          }
          sc15.close();
    }
}
