package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan toplanmak uzere tam sayilaralin
        Kullanici 0'a basarsa sayi alma islemini bitirin

        Kullanicinin kac sayi girdigini
        ve bu sayilarin toplaminin kac oldugunu yazdirin

         */
        Scanner scan=new Scanner(System.in);

        int girilenSayi=5;// verilen ilk deger bu soru icin 0 olmamali cunku loop'u bitirmek icin kullanilacak
        // 0 degerini verseydil asagidaki while asamazdi

        int sayac=0;
        int toplam=0;

        while (girilenSayi !=0){
            System.out.println("Lutfen toplamak icin tam sayi girin"+
                    "\nBitirmek icin 0'a basin");
            girilenSayi=scan.nextInt();

            if (girilenSayi !=0){
                sayac++;
                toplam=toplam+girilenSayi;

            }// Cikis koymadik cunke 0 loop'u bitircek

        }
        System.out.println("Girilen "+ sayac + "adet sayinin toplami : "+toplam);







    }
}
