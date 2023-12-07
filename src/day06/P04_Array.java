package day06;

public class P04_Array {
    public static void main(String[] args) {
        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */
        String str="$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[]=str.split(" ");

        int toplamDolar=0;
        int toplamPound=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].contains("$")){
                toplamDolar+=(Integer.parseInt(arr[i].replace("$","")));

            }else {
                toplamPound+=(Integer.parseInt(arr[i].replace("£","")));
            }



        }
        System.out.println(toplamDolar);
        System.out.println(toplamPound);






    }
}
