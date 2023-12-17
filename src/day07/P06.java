package day07;

import javax.swing.*;

public class P06 {
    public static void main(String[] args) {
        // 6x3'lik bir multidimension array oluşturun ve içine çeşitli şehir ve nüfus bilgileri ekleyin.
// Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.
        String cityData[][]={
                {"istanbul","16 milyon","marmara"},
                {"ankara","10 milyon","ic anadolu"},
                {"izmir","4 milyon","ege"},
                {"gaziantep","0.8 milyon","dogu anadolu"},
                {"tekirdag","1.2 milyon","marmara"},
                {"kırıkale","2 milyon","ic anadolu"},
                {"adana","1.7 milyon","akdeniz"}
        };
        
        String searchCity= JOptionPane.showInputDialog("sehir adi giriniz");
        
        String population=null;
        String region=null;

        for (int i = 0; i < cityData.length; i++) {
            if (cityData[i][0].contains(searchCity)){
                population=cityData[i][1];
                region=cityData[i][2];
            }
        }
        if (population!=null){
            System.out.println("sehir : "+searchCity+"\nnufusu : "+population+"\nbolgesi : "+region);
        }else {
            System.out.println("aranan sehir bulunamadi");
        }

        
        
        
    }
}
