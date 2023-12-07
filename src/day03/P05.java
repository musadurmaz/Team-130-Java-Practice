package day03;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen islem yapacaginiz 2 sayiyi giriniz!");
        System.out.print("Birinci sayi : ");
        double sayi1= scanner.nextDouble();
        System.out.print("Ikinci sayi : ");
        double sayi2=scanner.nextDouble();

        System.out.println("Lutfen yapmak istediginiz islemi seciniz(+,-,*,/ : )");
        char islem=scanner.next().charAt(0);

        if (islem=='+'){
            System.out.println("Islem sonucu : " + (sayi1+sayi2));
        } else if (islem=='-') {
            System.out.println("Islem sonucu : " + (sayi1-sayi2));
        } else if (islem=='*') {
            System.out.println("Islem sonucu : " + (sayi1*sayi2));
        } else if (islem=='/') {
            System.out.println("Islem sonucu : " + (sayi1/sayi2));
        }else {
            System.out.println("Yanlis islem sectiniz! Program Sonlandiriliyor");
        }


    }
}
