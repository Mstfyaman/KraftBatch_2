package Day_28_Array_Lab_Cont_2;

import java.util.Arrays;

public class Array_Example_3 {
    public static void main(String[] args) {

        int[] sayi={1,2,4,6,3,5,29,27,23};


        //System.out.println(asalSayiBul(sayi));
        System.out.println(Arrays.toString(kucuktenBuyugeSirala(sayi)));


    }

    //22 //Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.

    public static String asalSayiBul(int[] arr){

        String result="";

     firstloop:   for (int sayi:arr) {
            if ( sayi==2) result+=sayi+" ";
            else if (sayi==0 || sayi==1) {continue firstloop;}

             else {
                for (int i=2; i<sayi; i++){
                    if (sayi%i==0){
                        continue firstloop;
                    }
                }
                result+=sayi+" ";
            }
        }
return result;
    }

    //23 //:Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)

    public static int[] kucuktenBuyugeSirala(int[] arr){

    int depo=0;
    for (int i=0; i<arr.length; i++ ){

        for (int j=i+1; j<arr.length; j++){
            if (arr[i]>arr[j])
            depo=arr[i];
            arr[i]=arr[j];
            arr[j]=depo;
        }
    }
    return arr;
    }









}
