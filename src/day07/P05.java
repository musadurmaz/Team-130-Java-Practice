package day07;

import javax.swing.*;
import java.util.ArrayList;

public class P05 {
    public static void main(String[] args) {
        // girilen decimal degeri binary yap
        int sayi= Integer.parseInt(JOptionPane.showInputDialog("Lutfen bir sayi giriniz"));
        //System.out.println("sayi = " + sayi);
        binaryCevir(sayi);

    }
    private static void binaryCevir(int sayi){
        ArrayList<Integer>binary=new ArrayList<>();
        while (sayi>=1){
            binary.add(sayi%2);
            sayi/=2;
        }
        for (int i = binary.size()-1; i >=0 ; i--) {
            System.out.print(binary.get(i)+" ");
        }
    }

}
