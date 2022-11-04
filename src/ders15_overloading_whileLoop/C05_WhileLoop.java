package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {//tekrar sayisi belli degilse while mantikli
        /*
        Kullanicidan toplanmak uzere sayi alin
        sayilarin toplami 500'e esit veya buyuk olursa

        girilen sayilarin,
        girilen sayilarin toplami yazdirin ve
        "Bu kadar yeter" yazdirin
         */
        Scanner scan=new Scanner(System.in);
       double girilenSayi=0;// 0 atamazsak bazen sorun cikartabilir
        double toplam=0;// 0 atamazsak bazen sorun cikartabilir
        int sayac=0;// 0 atamazsak bazen sorun cikartabilir

        while (toplam<500){
            System.out.println("Toplanmasi icin sayi giriniz");
            girilenSayi=scan.nextDouble();

            toplam+=girilenSayi;
            sayac++;

        }
        System.out.println("Girilen " + sayac + " sayinin toplami : " +
                toplam + " oldu. Bu kadar yeter" );

    }
}
