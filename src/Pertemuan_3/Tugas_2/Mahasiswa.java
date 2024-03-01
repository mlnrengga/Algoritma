package Pertemuan_3.Tugas_2;

public class Mahasiswa {
    public String nama;
    public long nim;
    public char kelamin;
    public double ipk;

    public Mahasiswa(String nama, long nim, char kelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelamin = kelamin;
        this.ipk = ipk;
    }

    public static void printRataIPK(Mahasiswa[] arr){
        double rataIpk = 0;
        for (int i = 0; i < arr.length; i++) {
            rataIpk += arr[i].ipk;
        }
        rataIpk /= arr.length;
        System.out.println("\nRata-rata IPK: " + rataIpk);
    }

    public static void printIPKTerbesar(Mahasiswa[] arr){
        double ipkTerbesar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ipkTerbesar < arr[i].ipk)
                ipkTerbesar = arr[i].ipk;
        }
        System.out.println("IPK Terbesar: " + ipkTerbesar);
    }
}
