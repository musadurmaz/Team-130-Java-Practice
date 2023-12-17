package day07;

import java.util.ArrayList;

public class P07 {
    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
// Bu fiyatların toplamını hesaplayarak ekrana yazdırın
        ArrayList<Double>prices=new ArrayList<>();
        prices.add(256.33);
        prices.add(120.00);
        prices.add(136.56);
        prices.add(756.45);
        prices.add(324.55);
        prices.add(254.66);
        prices.add(358.88);
        prices.add(888.99);
        double sum=0;
        for (double each:prices
             ) {
           sum+=each;
        }

        System.out.println("toplam = " + sum);


    }
}
