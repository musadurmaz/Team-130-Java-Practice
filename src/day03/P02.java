package day03;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        
        //int a=376;
        //System.out.println("a = " + a);//376
        //a+=5;
        //System.out.println("a = " + a);//381
        //System.out.println(a-7);//374
        //System.out.println(a);//381
        //a-=7;
        //System.out.println("a = " + a);//374
        //a=a%10;
        //System.out.println("a = " + a);//4

        //kullanicidan decimal bir sayi alin bu sayinin binary karsiligini yazdirin
        //decimal:0,1,2,3,4,5,6,7,8,9
        //binary:0,1 kod karsiligi,surekli 2 ye bolucez kalan 0,1 binary olur
        Scanner scanner=new Scanner(System.in);
        //System.out.println("Lutfen  bir sayi giriniz giriniz");
        //int sayi=scanner.nextInt();
        //System.out.println("Girdiginiz sayi : " + sayi);
        //int kalan1=sayi%2;
        //sayi/=2;
        //int kalan2=sayi%2;
        //sayi/=2;
        //int kalan3=sayi%2;
        //sayi/=2;
        //System.out.println("Girdiginiz sayinin binary karsiligi : " +
        //        sayi+""+kalan3+""+kalan2+""+kalan1);

        System.out.println("lutfen bir sayi giriniz");
        int sayi10=scanner.nextInt();
        String binaryCode=Integer.toBinaryString(sayi10);
        System.out.println(binaryCode);
    }
}
