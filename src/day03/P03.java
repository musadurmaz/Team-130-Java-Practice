package day03;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*kullanicidan 2 double sayi alin
        ilk sayiyi ikinci sayiya bolun ve
        sonucu tam sayi yazdirin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 2 ondalikli sayi giriniz");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();

       // System.out.println((int) (sayi1/sayi2));
        int bolum=(int) (sayi1/sayi2);
        System.out.println("bolum = " + bolum);
    }
}
