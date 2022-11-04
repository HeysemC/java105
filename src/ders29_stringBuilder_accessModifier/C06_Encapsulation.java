package ders29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    /*
    Buyuk projelerde data'yi gorme(read) veya data'yi degistirme(write)
    yetkilerini birbirinden bagimsiz olarak duzenlemek istenebilir

    Access modifier ile class uyelerine baska class'lardan erisim sinirlandirilabilir
    ANCAK
    ulasilabilen datayi hem okuma hem yazma yazilabilirken
    ulasilamayan data ne okunabilir ne de degistirebilir

    gercek hayattaki ihtiyaclari dusunuldugunde
    Javaya yetki sinirlamayi uyarlamak istersek

    -Eger okuma ve yazma yetkisini birlikte vermek veya vermemek soz konusu ise
    access modifier kullanilir

    -Eger okuma ve yazma yetkileri birbirinden ayrilacaksa
    o zaman access modifier yeterli olmaz
    Encapsulation(getter ve setter method'lari) kullanilmalidir.
     */

    //get ve set daha onceki java obhelerinde karsimiza cikmisti

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        //sayilar.get(1)=10;okumaya izin var yazmaya yok
        //get okumaya izin var ama deger atamaya yani yazmaya yok

        //System.out.println(sayilar.set(1));set varsa MUTLAKA deger atamalisin
        //okumaya izin yok!!!
    }
}
