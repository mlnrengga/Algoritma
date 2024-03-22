package Pertemuan_6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel m1 = new Hotel("Grand", "Malang", 10000, (byte) 2);
        Hotel m2 = new Hotel("Heaven", "Surabaya", 20000, (byte) 5);
        Hotel m3 = new Hotel("Olympus", "Jakarta", 15000, (byte) 3);
        Hotel m4 = new Hotel("Peak", "Tanggerang", 17000, (byte) 4);
        Hotel m5 = new Hotel("Nova", "Depok", 8000, (byte) 1);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data hotel sebelum sorting = ");
        list.tampilAll();

        System.out.println("Data Hotel setelah sorting asc menggunakan bubblesort berdasarkan harga");
        list.bubbleSortHarga();
        list.tampilAll();

        System.out.println("Data Hotel setelah sorting desc menggunakan bubblesort berdasarkan bintang");
        list.bubbleSortBintang();
        list.tampilAll();

        System.out.println("Data Hotel setelah sorting asc menggunakan selectionsort berdasarkan harga");
        list.selectionSortHarga();
        list.tampilAll();

        System.out.println("Data Hotel setelah sorting desc menggunakan selectionsort berdasarkan bintang");
        list.selectionSortBintang();
        list.tampilAll();

    }
}
