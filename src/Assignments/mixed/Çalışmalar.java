package Assignments.mixed;

import java.util.Scanner;

public class Çalışmalar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       // star(4);
        //obob(11,121);


//        for (int i=1; i<21; i++){
//            System.out.println(+i+" Merhaba Dunya ");        // 20 defa merhabe dünya
//        }

//            for (int i=0; i<100; i++){                // 100 e kadar o lan sayıalr
//                System.out.println(i);
//            }

//        for (int i=15; i<100; i++){            // 15 ile 100 arası
//            System.out.println(i);
//        }

//        for (int i=100; i>0; i--){      // sayıları tersten yazdırma
//            System.out.print( i+" " );
//        }

//        for (int i=0; i<100; i+=2){         // çift sayıları yazdırma
//            System.out.println(i);
//        }

//        for (int i=0; i<100; i++){            // tek sayılari yazdırma
//            if (i%2==1){
//                System.out.println(i);
//            }
//        }


//            int faktoriyel=1;
//            for (int i=6; i>=1; i--){                       // faktoriyel
//            faktoriyel*=i;
//            System.out.println(" 6! =" +faktoriyel);
//
//        }

//        int sonuc=1;
//        for (int i=0; i<20; i++){                // küpünü alma
//            sonuc=i*i*i;
//            System.out.println(i+ " nin kupu:" sonuc);
//
//        }


//        for ( int i=23; i<50; i++){           //    fahrenheit derece cevirme
//            int c=i;
//            int fahrenheit= (int) (c*1.8)+32;
//            System.out.println(i+ " in fah degeri = "+fahrenheit);



//        System.out.print(" Lutfen bir kelime giriniz");                 // kelime yazdırma
//        String kelime=scan.nextLine();
//        System.out.print(" lutfen kac defa yazdirmak istediginizi giriniz");
//        int kez=scan.nextInt();
//
//        for (int i=0; i<kez; i++){
//            System.out.println(i+" "+kelime);
//        }


//        System.out.print(" Lutfen bir 0 ile 1000 arasinda bir sayi degeri giriniz:    ");
//        int sayi=scan.nextInt();
//        int sonuc=0;
//        for (int i=0; i<=sayi; i++){                                      // sayi araligini toplama
//            sonuc=sonuc+i;
//
//
//        }
//        System.out.println(sayi+" a kadar olan toplami "+sonuc);



//        System.out.print(" Lutfen bir 0 ile 1000 arasinda bir sayi degeri giriniz:    ");
//        int sayi=scan.nextInt();
//        int tekSayilar=0;
//        int ciftSayiilar=0;
//        for ( int i=0; i<=sayi; i++){
//            if (i%2==1){                                        // tek ve çift sayiların toplami
//                tekSayilar+=i;
//
//            }else if (i%2==0){
//             ciftSayiilar+=i;
//            }
//
//        }
//        System.out.println(" tek sayilar =" + tekSayilar);
//        System.out.println(" cift sayilar =" + ciftSayiilar);



//        System.out.print(" Lutfen taban kuvvetini giriniz:    ");
//        int taban=scan.nextInt();
//        System.out.print(" Lutfen ust kuvvetini giriniz:    ");
//        int ust=scan.nextInt();
//        int sonuc=1;                                                     // taban ve ust çarpımını alma
//        for (int i=0; i<ust; i++){
//            sonuc=sonuc*taban;
//
//        }
//        System.out.println(sonuc);




//        int sayi=9;
//        for (int i=1; i<=10; i++){                                   // 9 sayısının çarpım tablosu
//
//            System.out.println(i+" x 9 = "+ i*sayi);
//        }
//


//        for (int a=0; a<10; a++){
//            System.out.print(a);
//            if (a==10){
//                System.out.println(a);
//                break;
//            }
//            //for (int j=0; j<1; j++){
//                System.out.print("-");
//            }



        }






        public static void star(int satir) {

            for (int i = 0; i < satir; i++) {
                for (int j=5; j>i; j--){
                    System.out.print(" ");
                }
                for (int j=0; j<i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

        public static int obob(int num1, int num2){

            int obob, ekok, min;
            min= num1<num2 ? num1 : num2;
            obob=1;

            for (int i=min; i>0; i-- ){

                if ((num2%i==0) && (num2%i==0)){
                    obob=i;
                    System.out.println(num1+" ve "+num2+ " sayilarinin ekoku =" +obob);
                    break;
                }
            }
            return min;






        }











    }



