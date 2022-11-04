package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        10,11,12 sayilarini toplayan bir while loop olusturalim
         */
        int sayi=10;
        int toplam=0;



        while (sayi<=12){

            toplam+=sayi;

            sayi++;

        }
        /*
        While loop'da 2 problem oluşabilir
        1-once degeri kontrol edip, sonra islem yaptigimizdan
          body'de bir kere daha kontrol etmemiz gerekebilir
        2-yapilan islem sayisindan 1 fazla while bitis sarti kontrol edilir
        3-While loop oncesinde degerleri kontrol edecegimiz bir variable olusturuyorsak
        ona yapacagimiz atamayi dikkatli yapmamiz gerekir
        yanlis deger atamasi,while loop'un calismamasina neden olabilir

         */
    }

}
