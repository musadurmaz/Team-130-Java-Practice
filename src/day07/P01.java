package day07;

import java.util.Scanner;

public class P01 {
    // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
    // olarak yazdirin, yoksa girilen harfi yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz : ");
        char harf = scanner.next().charAt(0);

        if (Character.isLowerCase(harf)) {
            System.out.println("Girilen harf kucuk harftir");
        } else System.out.println("Girilen harf buyuk harftir ");


    }
}