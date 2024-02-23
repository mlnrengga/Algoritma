package Pertemuan_2;

public class BukuMain15 {
    public static void main(String[] args) {
        Buku15 buku1 = new Buku15();
        buku1.judul = "Today Ends Tomorrow Comes";
        buku1.pengarang = "Denanda Pratiwi";
        buku1.halaman = 198;
        buku1.stok = 13;
        buku1.harga = 71000;

        buku1.tampilInformasi();
        buku1.terjual(5);
        buku1.gantiHarga(60000);
        buku1.hitungHargaTotal(60000, 3);
        buku1.hitungDiskon();
        buku1.tampilInformasi();
        buku1.hitungHargaBayar();

        Buku15 bk2 = new Buku15("Self reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku15 bukuRengga = new Buku15("Solo Leveling", "Maulana Rengga Ramadan", 80, 20, 93000);
        bukuRengga.tampilInformasi();
    }
}
