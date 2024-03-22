package Pertemuan_6;

public class HotelService {
    Hotel[] rooms = new Hotel[5];
    int idx;

    void tambah(Hotel H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (Hotel h : rooms) {
            System.out.println("Nama    = " + h.nama);
            System.out.println("Kota    = " + h.kota);
            System.out.println("Harga   = " + h.harga);
            System.out.println("Bintang = " + h.bintang);
            System.out.println("-----------------------");
        }
    }

    void bubbleSortHarga() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if(rooms[j].harga < rooms[j - 1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }   
        }
    }

    void bubbleSortBintang() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if(rooms[j].bintang > rooms[j - 1].bintang) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSortHarga() {
        for (int i = 0; i < rooms.length-1; i++) {
            int Min = i;
            for(int j= i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[Min].harga) {
                    Min = j;
                }
            }
            Hotel tmp = rooms[Min];
            rooms[Min] = rooms[i];
            rooms[i] = tmp;
        }
    }

    void selectionSortBintang() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for(int j= i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
