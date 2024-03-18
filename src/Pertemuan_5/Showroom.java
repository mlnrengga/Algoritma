package Pertemuan_5;

public class Showroom {
    String merk, tipe;
    int tahun, topAcceleration, topPower;

    Showroom(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    static void tampilTabel(Showroom cars[]) {
        System.out.println();

        System.out.println("=======================================================================");
        System.out.printf("| %-10s | %-15s | Tahun | Top Acceleration | Top Power |\n", "Merk", "Tipe");

        System.out.println("=======================================================================");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("| %-10s | %-15s | %-5d | %-16d | %-9d |\n", cars[i].merk, cars[i].tipe, cars[i].tahun, cars[i].topAcceleration, cars[i].topPower);
        }
        System.out.println("=======================================================================\n");
    }

    static Showroom cariAccelerationTertinggi(Showroom cars[], int awal, int akhir) {
        if (awal == akhir) {
            return cars[awal];
        }

        int mid = (awal + akhir) / 2;
        Showroom lTertinggi = cariAccelerationTertinggi(cars, awal, mid);
        Showroom rTertinggi = cariAccelerationTertinggi(cars, mid + 1, akhir);
        Showroom nilaiTertinggi = lTertinggi.topAcceleration > rTertinggi.topAcceleration ? lTertinggi : rTertinggi;
        return nilaiTertinggi;
    }

    static Showroom cariPowerTerendah(Showroom cars[], int awal, int akhir) {
        if (awal == akhir) {
            return cars[awal];
        }

        int mid = (awal + akhir) / 2;
        Showroom lTerendah = cariPowerTerendah(cars, awal, mid);
        Showroom rTerendah = cariPowerTerendah(cars, mid + 1, akhir);
        Showroom nilaiTerendah = lTerendah.topPower < rTerendah.topPower ? lTerendah : rTerendah;
        return nilaiTerendah;
    }

    static double hitungrataPower(Showroom cars[]) {
        double rata = 0;
        for (int i = 0; i < cars.length; i++) {
            rata += cars[i].topPower;
        }
        rata /= cars.length;
        return rata;
    }
}