package T130_WiseMarket;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class WiseMarket {
    static Scanner scanner = new Scanner(System.in);
    static int urunKodu;
    static boolean ekUrun = false;
    static int urunAdedi;
    static String urunAd;
    static int urunFiyati;
    static double toplam;
    static String sepet="\n";

    public static void main(String[] args) {
        girisEkrani();
        /*
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET
   secime göre;
   4-urunleri listele ve
   5-fiyatlari gelsin
*/


    }

    private static void girisEkrani() {
        System.out.println("====================T130 - Wise Market==========================");
        System.out.println("-----------------------Hos geldiniz-----------------------------");
        System.out.println("Lutfen bir secim yapiniz?\nAlisveris yapacaginiz reyon numarasini girip enter tusuna basiniz");
        System.out.println("1-Sarkuteri Reyonu\n2-Manav Reyonu\n3-Market Reyonu\n4-Fis Yazdirma\n5-Cikis");
        int secim = scanner.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Gecersiz bir islem sectiniz!\nLutfen yeniden deneyiniz ");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }


    }

    private static void cikis() {
        System.out.println("----------Cikis Yapiliyor----------");

        System.exit(0);

    }

    private static void fisYazdir() {
        System.out.println("---------Fis Yazdiriliyor----------");
        System.out.println("-----T130 Wise Market--------------");
        System.out.println("--------Iyi Gunler-----------------");
        System.out.println(" ");
        System.out.println(sepet);
        System.out.println("Toplam tutar: "+toplam +" £");
        System.out.println("KDV: "+(toplam*0.20)+" £");
        toplam+=(toplam*0.20);
        System.out.println("Odenecek tutar: "+toplam+" £"+" KDV dahil");
        System.out.print("Odenen miktar :");
        int odeme=scanner.nextInt();
        if (odeme<toplam){
            System.out.println("Yapilan odeme toplam tutari karsilamiyor. "+(toplam-odeme)+" kadar odeme yapmalisiniz");

        }else {
            System.out.println("Para ustu :"+(odeme-toplam)+" £");

        }
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz\nYine bekleriz");
        LocalDateTime date=LocalDateTime.now();
        System.out.println(date);
        cikis();
    }

    private static void market() {
        System.out.println("------Market Reyonuna Hosgeidiniz----");
        System.out.println("301-Nutella 85£\n302-Cay 1500£\n303-Seker 35£\n304-Sampuan 110£\n205-Un 63£");
        System.out.print("Lutfen urun kodunu giriniz: ");
        while (!ekUrun) {
            urunKodu= scanner.nextInt();
            if (urunKodu > 301 && urunKodu < 305) {
                System.out.println("Kac paket almak isterseniz");
                urunAdedi= scanner.nextInt();
                switch (urunKodu) {
                    case 301:
                        urunAd = "Nutella";
                        urunFiyati = 85;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    case 302:
                        urunAd = "Cay";
                        urunFiyati = 150;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    case 303:
                        urunAd = "Seker";
                        urunFiyati = 35;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    case 304:
                        urunAd = "Sampuan";
                        urunFiyati = 110;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    case 305:
                        urunAd = "Un";
                        urunFiyati = 63;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    default:
                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Toplam tutar: " + toplam);
                sepet += urunAd + " : " + urunFiyati + " £\n";
                System.out.println("Baska bir urun almak isterseniz ,urun kodunu giriniz\nAna menuye donmek icin 0 yazıp enter tusuna basiniz");


            } else if (urunKodu==0) {
                girisEkrani();
            }

        }
        ekUrun=false;
    }

    private static void manav() {
        System.out.println("------Manav Reyonuna Hosgeidiniz----");
        System.out.println("201-Ananas 80£\n202-Mandalina 50£\n203-Elma 75£\n204-Portakal 60£\n205-Muz 80£");
        System.out.print("Lutfen urun kodunu giriniz: ");
        while (!ekUrun) {
            urunKodu= scanner.nextInt();
            if (urunKodu > 201 && urunKodu < 205) {
                System.out.println("Kac kilo almak isterseniz");
                urunAdedi= scanner.nextInt();
                switch (urunKodu) {
                    case 201:
                        urunAd = "Ananas";
                        urunFiyati = 80;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    case 202:
                        urunAd = "Mandalina";
                        urunFiyati = 50;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    case 203:
                        urunAd = "Elma";
                        urunFiyati = 75;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    case 204:
                        urunAd = "Portakal";
                        urunFiyati = 60;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    case 205:
                        urunAd = "Muz";
                        urunFiyati = 80;
                        System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                        break;
                    default:
                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Toplam tutar: " + toplam);
                sepet += urunAd + " : " + urunFiyati + " £\n";
                System.out.println("Baska bir urun almak isterseniz ,urun kodunu giriniz\nAna menuye donmek icin 0 yazıp enter tusuna basiniz");


            } else if (urunKodu==0) {
                girisEkrani();
            }

        }
        ekUrun=false;
    }
        private static void sarkuteri() {
            System.out.println("------Sarkuteri Reyonuna Hosgeidiniz----");
            System.out.println("101-Peynir 250£\n102-Pastirma 600£\n103-Yogurt 150£\n104-Sucuk 350£\n105-Yumurta 100£");
            System.out.print("Lutfen urun kodunu giriniz: ");

            //if (!(urunKodu>=101&&urunKodu<=105)){
            //    System.out.println(urunKodu+" urun kodlu urun bulunamadi.Yeniden deneyiniz ");
            //    sarkuteri();
            //}
            while (!ekUrun) {
                    urunKodu= scanner.nextInt();

                if (urunKodu >= 101 && urunKodu <= 105) {
                    System.out.print("Kac paket alacaksiniz : ");
                    urunAdedi = scanner.nextInt();

                    switch (urunKodu) {
                        case 101:
                            urunAd = "Peynir";
                            urunFiyati = 250;
                            System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                            break;
                        case 102:
                            urunAd = "Pastirma";
                            urunFiyati = 600;
                            System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                            break;
                        case 103:
                            urunAd = "Yogurt";
                            urunFiyati = 150;
                            System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                            break;
                        case 104:
                            urunAd = "Sucuk";
                            urunFiyati = 350;
                            System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                            break;
                        case 105:
                            urunAd = "Yumurta";
                            urunFiyati = 100;
                            System.out.println(urunAdedi + " Paket" + urunAd + " fiyati: " + (urunAdedi * urunFiyati) + " £'dur");
                            break;

                        default:

                    }
                    urunFiyati = urunAdedi * urunFiyati;
                    toplam += urunFiyati;
                    System.out.println("Toplam tutar: " + toplam);
                    sepet += urunAd + " : " + urunFiyati + " £\n";
                    System.out.println("Baska bir urun almak isterseniz ,urun kodunu giriniz\nAna menuye donmek icin 0 yazıp enter tusuna basiniz");


                } else if (urunKodu == 0) {
                    girisEkrani();
                }

                ekUrun = false;
                System.out.println(sepet);




            }
        }

}