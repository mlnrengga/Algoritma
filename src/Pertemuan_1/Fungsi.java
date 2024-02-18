package Pertemuan_1;

public class Fungsi {
    public static void main(String[] args) {
        int [][]stock_Bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int []harga_Bunga = {75000, 50000, 60000, 10000};
        pendapatanCabang(stock_Bunga, harga_Bunga);

        jumlah_bunga(stock_Bunga);
    }

    static void pendapatanCabang (int [][]stockBunga, int []hrgBunga) {
        int []pendapatan = new int[4];
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) { 
                pendapatan[i] += stockBunga[i][j] * hrgBunga[j];
            }
        }

        for (int i = 0, j = 1; i < pendapatan.length; i++, j++){
            System.out.println("Pendapatan cabang " + j + " : " + pendapatan[i]);
        }
        System.out.println();
    }

    static void jumlah_bunga (int [][]stockBunga) {
        String []namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int []bungaMati = {1, 2, 0, 5};
        int []stockTerkini = new int[4];
        for (int i = 0; i < bungaMati.length; i++) {
            stockTerkini[i] = stockBunga[3][i] - bungaMati[i]; 
        }
        System.out.println("Stock Bunga Cabang 4\n" + "==========================");
        for (int i = 0; i < stockTerkini.length; i++) {
            System.out.println("Bunga " + namaBunga[i] + " : " + stockTerkini[i]);
        }
    }
}
