package Pertemuan_2;

import java.util.Scanner;

public class dragonMain {
    public static void main(String[] args) {

        String perintah = "";
        Scanner sc = new Scanner(System.in);

        Dragon move = new Dragon();

        move.x = 5;
        move.y = 5;

        while (!perintah.equalsIgnoreCase("1") || !perintah.equalsIgnoreCase("2") || !perintah.equalsIgnoreCase("3")
                || !perintah.equalsIgnoreCase("4")) {

            System.out.println(" DRAGON ");
            System.out.println("1. Move up");
            System.out.println("2. Move down");
            System.out.println("3. Move left");
            System.out.println("4. Move right");
            System.out.print("Masukkan perintah: ");
            perintah = sc.next();

            if (perintah.equalsIgnoreCase("1")) {
                move.moveUp();
            } else if (perintah.equalsIgnoreCase("2")) {
                move.moveDown();
            } else if (perintah.equalsIgnoreCase("3")) {
                move.moveRight();
            } else if (perintah.equalsIgnoreCase("4")) {
                move.moveLeft();
            } else {
                System.out.println("Tolong Masukkan perintah yang tepat.");
            }
        }
    }
}
