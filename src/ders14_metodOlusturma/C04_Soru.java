package ders14_metodOlusturma;

public class C04_Soru {
    /*
    Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic index’i dahil,
    bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
 - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
 - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */
    public static void main(String[] args) {
        String input="Java ne kadar guzel";
        int basIndexi=5;
        int bitindexi=7;

        kendiSubstringMethodu(input,basIndexi,bitindexi);
        kendiSubstringMethodu("Java",1,3);//av
        kendiSubstringMethodu("Deneme",6,3);//hata vermeli
        kendiSubstringMethodu("Java",6,8);//hata vermeli


    }
    public static void kendiSubstringMethodu(String input, int basIndexi, int bitindexi){
        if (basIndexi> bitindexi){
            System.out.print("Baslangic indexi, bitis indexinden buyuk olamaz ");
        } else if (bitindexi>=input.length()) {
            System.out.print("Bitis indexi String'in sinirlari disinda");
        }else{
            /*
            baslangic ve bitis indexlerine gore baslangic index’i dahil,
            bitis index’i haric olacak sekilde
           aradaki harfleri yazdiran bir method olusturun.
             */

            for (int i=basIndexi ; i<bitindexi ; i++){
                System.out.print(input.charAt(i));
            }
            System.out.println("");
        }

    }



}
