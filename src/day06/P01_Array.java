package day06;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Array {
    public static void main(String[] args) {
        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
//kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
//elemaninin arasinki farki gosteren java programi yazin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen arrayde olmasini istediginiz eleman sayisini giriniz");
        int sayi= scanner.nextInt();

        int[]arr=new int[sayi];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("lutfen "+(i+1)+" .sayiyi giriniz : ");
            int sayi2=scanner.nextInt();
            arr[i]=sayi2;
        }
        Arrays.sort(arr);
        int arrMax=arr[arr.length-1];
        int arrMin=arr[0];
        System.out.println("en buyuk : "+arrMax+"en kucuk : "+arrMin);




    }
}
