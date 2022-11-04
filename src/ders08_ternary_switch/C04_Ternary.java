package ders08_ternary_switch;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        /*Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise “Eskenar ucgen” yazdirin,
         degilse “Eskenar degil” yazdirin.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 kenar uzunlugu girin");
        int kenar1=10;
        int kenar2=12;
        int kenar3=10;

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 && kenar1==kenar2 && kenar2==kenar3 ?
                "Eskenar ucgen ": "Eskenar ucgen degil");




        /*
        5-Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */
        int sayi1=11;
        int sayi2=11;
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);

    }
}
