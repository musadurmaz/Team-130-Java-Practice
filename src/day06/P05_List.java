package day06;

import java.util.ArrayList;
import java.util.List;

public class P05_List {
    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String>isimList=new ArrayList<>();
        isimList.add("ali");
        isimList.add("veli");
        isimList.add("ayse");
        isimList.add("fatma");
        isimList.add("omer");
        List<String>newList=new ArrayList<>();
        for (String a:isimList
             ) {
            if (!a.toLowerCase().contains("a")){
                newList.add(a);
            }
        }
        System.out.println(newList);
    }
}
