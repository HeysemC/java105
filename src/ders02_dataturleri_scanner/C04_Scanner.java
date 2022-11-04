package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        // Soru : kullanicidan ismini alip buyuk harflerle yazdirin

        //1.adim : scan objesi olusturma
        Scanner scan = new Scanner(System.in) ;

        //2.adin : kullaniciya ne istedigimizi yazdirma
        System.out.println("Lütfen adinizi giriniz");

        /*3.adim : kullanidan istedigimiz bilginin turune uygun bir variable olusturup
                   scanner method'larindan uygun olanini kullanarak alinan degeri
                   variable'a atayalim                 */
        String kullaniciAdi = scan.next() ;

        // Buyuk harfle yazdirma
        System.out.println(kullaniciAdi.toUpperCase());


    }

}
