package day03;

public class P04 {
    public static void main(String[] args) {
        System.out.println("25"+7);//257
        System.out.println(25+7);//32
        System.out.println("25"+"7");//257
        System.out.println("---------------------");
        String a="25";
        int b=7;
        String c="7";
        int d=25;
        int x=b+d;// string bir deger ile concat edilirse string sonuc verir
        System.out.println(a+b);//257
        System.out.println(a+c);//257
        System.out.println(b+d);//32
        System.out.println(x);



    }
}
