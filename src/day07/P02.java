package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class P02 {
    // Bir ArrayList oluşturun ve içine 3 adet renk ekleyin.
// Daha sonra kullanıcıdan bir renk adı alın ve bu rengin ArrayList'te olup olmadığını ekrana yazdırın.
    public static void main(String[] args) {
        ArrayList<String>colors=new ArrayList<>();
        colors.add("purple");
        colors.add("yellow");
        colors.add("blue");

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir renk adi giriniz");
        String seachingCoolr= scanner.next();
        String renk=seachingCoolr.toLowerCase();


       if (colors.contains(seachingCoolr)){
           System.out.println("Aranan renk kayitlarimizda vardir");

       }else {
           System.out.println("Aranan renk kayitlarimizda yoktur");
       }


    }
}
