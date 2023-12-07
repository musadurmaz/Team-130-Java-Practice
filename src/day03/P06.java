package day03;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        //bir sayinin 3 e bolunuyorsa
        //sayi 3 e bolunebilir yazdir
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        if (sayi%3==0){
            System.out.println("Sayi 3 e bolunebilir");
        }


    }
}
