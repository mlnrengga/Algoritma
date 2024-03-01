package Pertemuan_3.Tugas_1;

public class Bola {
    public double jariJari;

    public Bola(double j) {
        jariJari = j;
    }

    public double luasPermukaan() {
        return 4 * 3.14 * jariJari * jariJari;
    }

    public double volume() {
        return (4.0 / 3.0) * 3.14 * jariJari * jariJari * jariJari;
    }
}
