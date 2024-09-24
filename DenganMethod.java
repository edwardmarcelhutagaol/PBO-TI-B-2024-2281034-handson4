import com.sun.jdi.connect.Transport;

public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok =500000;
        int tunjanganTransport = 500000;
        int tunjanganMakan = 3000000;
        int bonus = 1000000;

        int totalPenghasilan =hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }

    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus) {
        return  gajiPokok + + tunjanganTransport + tunjanganMakan + bonus;
    }
    public static int hitungPajak(int totalpenghasilan)     {
        return totalpenghasilan* 10 / 100;

    }
    public static int hitungGajiBersih(int totalpenghasilan, int pajak) {
        return totalpenghasilan - pajak;

    }

    public static void tampilkanDetailGaji(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus,int pajak, int gajiBersih ){
    }
}