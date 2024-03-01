package Pertemuan_3.Tugas_1;

public class LimasSegiEmpatSamaSisi {
    public double panjangSisiAlas;
    public double tinggiLimas;

    public LimasSegiEmpatSamaSisi(double p, double t) {
        panjangSisiAlas = p;
        tinggiLimas = t;
    }

    public double luasPermukaan() {
        double alas = panjangSisiAlas * panjangSisiAlas;
        double selimut = 4 * (0.5 * panjangSisiAlas * tinggiLimas);
        return alas + selimut;
    }

    public double volume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}
