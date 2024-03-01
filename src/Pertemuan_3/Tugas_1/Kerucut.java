package Pertemuan_3.Tugas_1;

public class Kerucut {
        public double jariJari;
        public double sisiMiring;
    
        public Kerucut(double j, double m) {
            jariJari = j;
            sisiMiring = m;
        }
    
        public double luasPermukaan() {
            double luasSelimut = 3.14 * jariJari * sisiMiring;
            double luasAlas = 3.14 * jariJari * jariJari;
            return luasAlas + luasSelimut;
        }
    
        public double volume() {
            return (1.0 / 3.0) * 3.14 * jariJari * jariJari * sisiMiring;
        }
    }
