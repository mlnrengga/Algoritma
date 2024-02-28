package Pertemuan_2;

public class Dragon {
    int x = 5, y = 5, width = 10, height = 10;

    void moveLeft() {
        x--;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        detectCollision(x, y);
    }

    void moveRight() {
        x++;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        detectCollision(x, y);
    }

    void moveUp() {
        y--;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        detectCollision(x, y);
    }

    void moveDown() {
        y++;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        detectCollision(x, y);
    }

    void detectCollision(int x, int y) {
        if (x > 10 || x < 1 || y > 10 || y < 1) {
            System.out.println("Game Over!");
            System.exit(0);
        }
    }
}
