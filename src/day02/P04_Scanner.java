package day02;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Lutfen adinizi giriniz");
        //String isim= scanner.nextLine();
        //System.out.println("----------------------------");
        //System.out.print("Lutfen soyadinizi giriniz : ");
        //String surname=scanner.nextLine();

       //System.out.print("Adiniz : ");

       //String name = scanner.nextLine();

       //System.out.print("Soyadiniz : ");

       //String surname = scanner.nextLine();

       //System.out.print("Sifreniz : ");

       //String pass = scanner.next();
       //System.out.println("Bilgileriniz sistemlerinize;\nAdi : " + name + "\nSoyadi : " + surname + "\nSifre : " + pass + "\nOlarak kaydedilmistir");
        System.out.println("1. vize notunuz : ");
        double vize1=scanner.nextDouble();
        System.out.println("2. vize notunuz : ");
        double vize2=scanner.nextDouble();
        System.out.println("Final notunuz : ");
        double finalNotu= scanner.nextDouble();

        System.out.println("---------- Yil Sonu Basari Notu Hesaplamasi ------------");
        System.out.println("1. vize notu :" + vize1);
        System.out.println("2. vize notu : " + vize2);
        System.out.println("Final notu : "+ finalNotu);
        System.out.println("Yil sonu basari notu : " + ((vize2+vize1)/2*0.4+(finalNotu*0.6)));


    }
}
