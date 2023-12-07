package day04;

public class P03_NestedForLoop_CarpimTablosu {
    public static void main(String[] args) {
        carpimTablosuYazdir(9);
    }

    private static void carpimTablosuYazdir(int sayi){
        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.printf("%4d",i*j );
            }
            System.out.println("");
        }

    }
}
