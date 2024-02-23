package Pertemuan_2;

public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal;
    double totalDiskon, diskon;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    public Buku15() {

    }

    public Buku15(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else
            System.out.println("Stok Habis");
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int hrg, int jml) {
        hargaTotal = harga * jml;
    }

    void hitungDiskon() {
        if (hargaTotal > 150000) {
            System.err.println("Selamat anda mendapatkan diskon sebesar 12% dari toko kami");
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            System.err.println("Selamat anda mendapatkan diskon sebesar 5% dari toko kami");
            diskon = 0.05;
        } else if (hargaTotal < 75000) {
            System.out.println("Tidak ada Diskon");
        }
    }

    void hitungHargaBayar() {
        totalDiskon = hargaTotal * diskon;
        System.out.println("Total potongan harga yang didapat: " + totalDiskon);
        hargaTotal -= totalDiskon;
        System.out.println("Total harga yang harus dibayar: " + hargaTotal);
    }
}
