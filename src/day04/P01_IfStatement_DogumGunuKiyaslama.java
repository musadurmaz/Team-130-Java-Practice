package day04;

import java.util.Scanner;

public class P01_IfStatement_DogumGunuKiyaslama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kiyaslamak istediginiz dogum tarihlerinden ilkini YYYY/AA/GG formatinda giriniz : ");
        String dogumTarihi1= scanner.nextLine();
        System.out.println("Kiyaslamak istediginiz dogum tarihlerinden ikincisini YYYY/AA/GG formatinda giriniz : ");
        String dogumTarihi2= scanner.nextLine();

        int yil1=Integer.parseInt(dogumTarihi1.replaceAll(" ","").substring(0,4));
        int ay1=Integer.parseInt(dogumTarihi1.replaceAll(" ","").substring(5,7));
        int gun1=Integer.parseInt(dogumTarihi1.replaceAll(" ","").substring(8));

        int yil2=Integer.parseInt(dogumTarihi2.replaceAll(" ","").substring(0,4));
        int ay2=Integer.parseInt(dogumTarihi2.replaceAll(" ","").substring(5,7));
        int gun2=Integer.parseInt(dogumTarihi2.replaceAll(" ","").substring(8));

        if (yil1>yil2){
            System.out.println("Ikinci girilen dogum tarihinin sahibi daha yaslidir");
        } else if (yil1<yil2) {
            System.out.println("Ilk girilen dogum tarihinin sahibi daha yaslidir");
        }else {
            if (ay1>ay2){
                System.out.println("Ikinci girilen dogum tarihinin sahibi daha yaslidir");
            } else if (ay1<ay2) {
                System.out.println("Ilk girilen dogum tarihinin sahibi daha yaslidir");
            }else {
                if (gun1>gun2){
                    System.out.println("Ikinci girilen dogum tarihinin sahibi daha yaslidir");
                } else if (gun1<gun2) {
                    System.out.println("Ilk girilen dogum tarihinin sahibi daha yaslidir");
                }else {
                    System.out.println("Siz ikizsiniz");
                }


            }


        }


    }
}
