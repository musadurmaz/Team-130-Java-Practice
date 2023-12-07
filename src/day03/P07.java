package day03;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        /*
 *  Kullanicidan IT alanini isteyerek
 *  meslegi = qa ==> Quality Analyst
             dev ==> Developer
           ba ==> Busines Analyst
           pm ==> Project Manager
yazdiriniz
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen IT alaninizi seciniz: \nqa - dev - ba - pm : ");
        String job=scanner.next();
        String qa="Quality Analyst";
        String dev="Developer";
        String ba="Busines Analyst";
        String pm="Project Manager";

        if (job.equalsIgnoreCase("qa")){
            System.out.println("Meslegi : " + qa);
        } else if (job.toLowerCase().equals("dev")) {
            System.out.println("Meslegi : " + dev);
        } else if (job.equalsIgnoreCase("ba")) {
            System.out.println("Meslegi : " + ba);
        } else if (job.equalsIgnoreCase("pm")) {
            System.out.println("Meslegi : " + pm);
        }else {
            System.out.println("Siz IT personeli degilsiniz");
        }


    }
}
