package day05;

import java.util.Arrays;

public class C01_AraydekiSayilarinToplami {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.

       // float[] numbers=new float[5];
       // numbers[0]=1.1f;
       // numbers[1]=2.2f;
       // numbers[2]=3.3f;
       // numbers[3]=4.4f;
       // numbers[4]=5.5f;

        float[]numbers={1.1f,2.2f,3.3f,4.4f,5.5f};
        System.out.println("**************for cozumu **********");

        System.out.println(Arrays.toString(numbers));
        float toplam=0.0f;
        for (int i = 0; i <numbers.length ; i++) {
            toplam+=numbers[i];
        }

        System.out.println("Toplam : "+ toplam);
        System.out.println("********while cozumu******");
        int i=0;
        toplam=0;
        while (i<numbers.length){

            toplam+=numbers[i];

            i++;
        }

        System.out.println("toplam : "+toplam);
        System.out.println("********while loop cozumu2***********");

        toplam=0;
        int ind= numbers.length-1;
        while (ind>=0){
            toplam+=numbers[ind];
            ind--;
        }
        System.out.println("toplam : "+toplam);
    }
}
