package ders17_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
        /*
        bir method'un icerisinde olusturulan variable'larin scope'u
        icinde olusturulduklari method'dur
        o method'un disindan ULASILAMAZLAR
         */
//Scope bir variable'in erisebildigi alandir
        /*
        SCOPE:
        1-Local variable'lar;
        ==>Local variable'larin scope'u icersinde olusturulduklari kod blogudur ve
           o blogun disinda kullanilamazlar

         */



        int sayi=10;
        String isim="Ramazan";
        //System.out.println(dogruMu);(method1 de kullanabiliriz

        for (int i = 0; i < 10; i++) {
            String adres="Ankara";
            //bir loop icersinde olusturulan variable'lar sadece o loop icerisinde gecerlidir
        }
        //for loop'un disina ciktigimizda
       // System.out.println(adres); (loop icersinde olusturulan variable'lar disinda kullanilamazlar)

        double pi;//(deger atamadan olusturabilirsiniz ancak kullanamazsiniz)
        // System.out.println(pi);(local variable'lar deger atamadan olusturulabilir ancak KULLANILAMAZ
        // kullanmadan once deger atanmali

    }

    public static void method1(){

        // java icinde bulundugu scoope bakar
        // System.out.println(sayi);
        // isim="tugay";
        boolean dogruMu=true;
    }
}
