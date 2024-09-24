public class ContohOverloading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }
    public static double hitungLuas(double panjang, double lebar){
        return panjang * lebar;
    }

    public static double hitungLuas(double jariJari,Boolean isiLingkaran) {
        if (isiLingkaran) {
            return Math.PI * jariJari * jariJari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println(" Luas Persegi: " + luasPersegi);

        double luasPersegipanjang = hitungLuas(4, 6);
        System.out.println("Luas Persegi Panjang : " + luasPersegipanjang);

        double luasLingkaran = hitungLuas(3, true);
        System.out.println("luas lingkaran: " + luasLingkaran);
    }
}