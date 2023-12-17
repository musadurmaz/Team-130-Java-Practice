package day07;

import java.util.ArrayList;

public class P03 {
    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine 5 adet kelime ekleyin.
// Ardından bu kelimeleri tek bir cümle olarak birleştirerek ekrana yazdırın.
        ArrayList<String>kelimeler=new ArrayList<>();

        kelimeler.add("Java");
        kelimeler.add("cok");
        kelimeler.add("guclu");
        kelimeler.add("bir");
        kelimeler.add("dildir.");
        
        String sentence=String.join(" ",kelimeler);//join methodunda (delimeter,element)yazilarak indexler arasina istedigni
        System.out.println("sentence = " + sentence);//yazdirarak ayirir






    }
}
