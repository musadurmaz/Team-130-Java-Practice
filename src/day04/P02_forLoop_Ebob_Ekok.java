package day04;

public class P02_forLoop_Ebob_Ekok {

    public static void main(String[] args) {
       int sayi1=12;
       int sayi2=18;

        int buyukSayi;
        int kucukSayi;
        if (sayi1>sayi2){
            buyukSayi=sayi1;
            kucukSayi=sayi2;
        }
        else {
            buyukSayi=sayi2;
            kucukSayi=sayi1;
        }

        System.out.println(ebobHesaplama(23, 46));
        System.out.println(ebobHesaplama(11, 46));
        ekokHesaplama(11,22);

    }

    private static void ekokHesaplama(int x, int y) {
        int buyukSayi;
        int kucukSayi;
        if (x>y){
            buyukSayi=x;
            kucukSayi=y;
        }
        else {
            buyukSayi=y;
            kucukSayi=x;
        }
        int ekok=0;

        for (int i =buyukSayi; i <buyukSayi*kucukSayi ; i+=buyukSayi) {
            if (i%kucukSayi==0&&i%buyukSayi==0){
                ekok=i;
                break;
            }
        }
        System.out.println(x + " ve " + y + " sayilarin Ekok degeri : " + ekok);

    }

    public static int ebobHesaplama(int a,int b){
        int buyukSayi;
        int kucukSayi;
        if (a>b){
            buyukSayi=a;
            kucukSayi=b;
        }
        else {
            buyukSayi=b;
            kucukSayi=a;
        }
        int ebob =0;

        for (int i =kucukSayi; i >0 ; i--) {
            if (kucukSayi%i==0&&buyukSayi%i==0){
                ebob=i;
                break;
            }
        }


        return ebob;
    }




}
