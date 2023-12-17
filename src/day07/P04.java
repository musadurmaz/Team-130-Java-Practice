package day07;

import javax.swing.*;

public class P04 {
    //Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog("Lutfen bir cumle yaziniz");
       // System.out.println("input = " + input);
        String[]arr=input.split("");
        int count=0;
       // char encokHArf=' ';
        String encokHarf=" ";
        int encok=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i].contains(arr[j])){
                    count++;
                }
            }
            if (count>encok){
                encok=count;
                //encokHArf=arr[i].charAt(0);
                encokHarf=arr[i];
            }
            count=0;
        }
        System.out.println(encokHarf+" karakteri cumlede "+encok+" kez kullanilmistir");

        
        
        
    }
}
