package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {


        // BURASİ ÖNEMLİ İLERDE COOK KULLANICAZ

        /* genis data turundeki bir degeri
        dar data turundeki bir variable'a atamak isterseniz
        java sorumlulugu almamizi ister

        bu sorumlulugu almak icin
        cast edecegimiz deger'in  onune () icerisinde
        cast etmek istedigimiz data turu yazilir

        ancak bu durumda data kayiplari (double'den int'e gecerken virgulden sonrasi silinir)
        veya baskalasim olabilir (int'i byte cevirirsek tekrar tekrar basa döner )
         */

        int sayi = 20 ;
        short sh = (short)sayi ;

        System.out.println(sh); // 20


        double dbl = 23.5 ;

        int say = (int)dbl ;

        System.out.println(say); // 23

         say = 132 ; // int

        byte byt =(byte) say ;
        /* 15 byte sinirlari icersinde byte sinirleri disindaki bir deger yazdirirsak
           verdigimiz degerden sapar (sapmasi ise mod deger gibi calisir )
                                  */

        System.out.println(byt);






    }
}
