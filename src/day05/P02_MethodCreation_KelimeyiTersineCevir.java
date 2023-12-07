package day05;

public class P02_MethodCreation_KelimeyiTersineCevir {
    public static void main(String[] args) {
        // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
        // girilen değeri tersine  donduren bir method oluşturun
        String kelime="elma";

        System.out.println(tersCevir(kelime));

    }

    public static String tersCevir(String kelime) {
        String temp="";
        for (int i = kelime.length()-1; i >=0 ; i--) {//-1 iburda kullanabiliriz ama esittir kalkmali
           temp+=kelime.charAt(i);//yukarida yazmazsak burada yazmaliyiz
        }
        String tersCevirlenKelime=temp;
        return tersCevirlenKelime;
    }


}
