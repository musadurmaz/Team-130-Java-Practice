package day03;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
    /*Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
    Girdiğiniz harf :
    Girdiğiniz harften sonraki  3 harf :
şeklinde yazdırın.    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf =scanner.next().charAt(0);
        System.out.println("Girilen " + harf + " harfinden sonraki 3 harf : " +
                                                                (char)(harf+1) +" , " +
                                                                (char)(harf+2) +" , " +
                                                                (char)(harf+3));



    }
}
