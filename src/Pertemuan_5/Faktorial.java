package Pertemuan_5;

public class Faktorial {
    public int nilai;

    int faktorialBF(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialBF(n - 1);
        }
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}