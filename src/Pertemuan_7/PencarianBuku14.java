package Pertemuan_7;

public class PencarianBuku14 {
    Buku14 listBk[] = new Buku14[5];
    int idx;

    void tambah(Buku14 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Buku14 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari) {
        int posisi = -1;
        int count = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                posisi = i;
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Pencarian menghasilkan lebih dari 1 judul buku yang sama.");
        }
        return posisi;
    }

    public void tampilPosisi(int pos) { 
        if (pos != -1) {
            System.out.println("Data : " + listBk[pos].kodeBuku + " berjudul " + listBk[pos].judulBuku + " ditemukan pada indeks " + pos); 
        } else {
            System.out.println("Data : " + listBk[pos].kodeBuku + " berjudul " + listBk[pos].judulBuku + " tidak ditemukan"); 
        }
    }

    public void tampilData(int pos) { 
        if (pos != -1) {
            System.out.println("Kode buku\t: " + listBk[pos].kodeBuku); 
            System.out.println("Judul buku\t: " + listBk[pos].judulBuku); 
            System.out.println("Tahun terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock\t\t: " + listBk[pos].stock);
        } else {
            System.out.println("Data : " + listBk[pos].kodeBuku + " berjudul " + listBk[pos].judulBuku + " tidak ditemukan");
        }
    }

    public Buku14 findBuku(String x) {
        int posisi = findSeqSearch(x);
        if (posisi != -1) {
            return listBk[posisi];
        } else {
            return new Buku14(null, null, 0, null, 0);
        }
    }

    public int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return mid;
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > Integer.parseInt(cari)) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int findSeqSearchJudul(String cari) {
        int count = 0;
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                posisi = i;
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Pencarian menghasilkan lebih dari 1 judul buku yang sama.");
        }
        return posisi;
    }  

    public int findBinarySearchJudul(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
                return mid;
            } else if (cari.compareToIgnoreCase(listBk[mid].judulBuku) < 0) {
                return findBinarySearchJudul(cari, left, mid - 1);
            } else {
                return findBinarySearchJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void insertionSortJudul(){
        for (int i = 1; i < listBk.length; i++) {
            Buku14 temp = listBk[i];
            int j = i;
            while(j > 0 && temp.intKodeBuku < listBk[j-1].intKodeBuku) {
                listBk[j] = listBk[j-1];
                j--;
            }
            listBk[j] = temp;
        }
    }
}   