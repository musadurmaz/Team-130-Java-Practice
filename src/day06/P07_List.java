package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07_List {


    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
// ortalamayı geçen öğrenci sayısını bulunuz.
        List<Integer>not=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Not girisi icin N tusuna basiniz btince X tusuna basiniz");
        char devam=scanner.next().charAt(0);
        while (devam=='N'){
            System.out.print("Lutfen notu giriniz: ");
            not.add(scanner.nextInt());
            System.out.println("Yeni not girisi icin N tusuna basiniz");
            devam=scanner.next().charAt(0);


        }
        System.out.println(not);
        int toplam=0;
        for (int i = 0; i <not.size() ; i++) {
            toplam+=not.get(i);
        }

        double ortalama=0;
        ortalama=toplam/not.size();
        System.out.println("ortalama = " + ortalama);
        List<Integer>gecenler=new ArrayList<>();
        for (int i = 0; i <not.size() ; i++) {
            if (not.get(i)>=ortalama){
                gecenler.add(not.get(i));
            }
        }
        System.out.println(gecenler.size());

    }
}
