public class ContohOverloading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }
    public static double hitungLuas(double panjang, double lebar){
        return panjang * lebar;
    }

    public static double hitungLuas(double jariJari,Boolean isiLingkaran) {
        double Math;
        return Math * jariJari * jariJari;
    }else{
        return 0;
    }
}

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println(" Luas Persegi: " + luasPersegi);

        double luasPersegiPanjang = hitungLuas(4,6);
        System.out.println("Luas Persegi Panjang : " luasPersegiPanjang);

        double luasPersegiPanajang = hitungLuas()
    }