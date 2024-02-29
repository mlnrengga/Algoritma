package Pertemuan_3.ArrayObjects;

import java.util.Scanner;   
public class ArrayObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        Scanner sc14 = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc14.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc14.nextInt();
        } 

        for (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ",lebar: " + ppArray[i].lebar);
        }
    }
}
