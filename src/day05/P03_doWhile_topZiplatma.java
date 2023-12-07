package day05;

public class P03_doWhile_topZiplatma {
    public static void main(String[] args) {
       // Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
        // while code blogu create ediniz.
       double yukseklik=2.00;
        topuZiplat(yukseklik);

    }

    public static void topuZiplat(double cikisNoktasi){
        double toplamYol=0.00;
        int yereVurmaSayisi=0;
        do {
            toplamYol+=cikisNoktasi;
            yereVurmaSayisi++;
            cikisNoktasi*=0.75;
            toplamYol+=cikisNoktasi;
        }while (cikisNoktasi>=1.00);

        System.out.println("toplam yol : "+toplamYol+" vurus sayisi : "+yereVurmaSayisi);

    }

}
