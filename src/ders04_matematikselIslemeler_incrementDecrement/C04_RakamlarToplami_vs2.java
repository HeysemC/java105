package ders04_matematikselIslemeler_incrementDecrement;

import java.util.Scanner;

public class C04_RakamlarToplami_vs2 {
    public static void main(String[] args) {


        //kullanicinin girdigi 4 basamakli bir sayinin
        //rakamlar toplamini veren bir kod yaziniz


        //Scanner scan = new Scanner(System.in) ;
        //System.out.println();
        int input = 1453 ; // scanner da yapıp kullanicidan alabilir


        int birlerBasamagi ;
        int rakamlarToplami = 0 ;

        // 1-birler basamagini al
        birlerBasamagi = input % 10 ; // 3
        //2-birler basamagini rakamlar toplamina ekle
        rakamlarToplami = rakamlarToplami + birlerBasamagi ; // 3
        //3-birler basamagindan kurtul
        input = input / 10 ;



        birlerBasamagi = input % 10 ; // 5

        rakamlarToplami = rakamlarToplami + birlerBasamagi ; // 3+5=8

        input = input / 10 ;


        birlerBasamagi = input % 10 ; // 4

        rakamlarToplami = rakamlarToplami + birlerBasamagi ; // 3+5+4=12

        input = input / 10 ;


        birlerBasamagi = input % 10 ; // 1

        rakamlarToplami = rakamlarToplami + birlerBasamagi ; // 3+4+5+1=13

        input = input / 10 ;

        System.out.println("verilen sayinin rakamlar toplami : " + rakamlarToplami );

        // kullanicidan iki int deger alip
        // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");

  int sayi1= scan.nextInt(); // 20
        int sayi2= scan.nextInt(); // 6

       System.out.println(sayi1/sayi2); //  3

       double ondalikliSonuc= (double)(sayi1/sayi2) ; //  (double)(3) ==> 3.0

        System.out.println(ondalikliSonuc); // 3.0

        double dogruSonuc = (double)sayi1 / sayi2; // double / int ==> genis olana gore sonuc verir

       System.out.println(dogruSonuc); // 3.3333333333333335
    }
}





