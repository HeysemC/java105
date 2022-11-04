package ders05_concatenation_operatorler;

public class C02_LogicalOperators {
    public static void main(String[] args) {

        int a = 20 ;
        int b = 30 ;
        System.out.println(a>b && b>0 && a>0); // direk false yazdirir tek false tüm islemi false yapar

        boolean sonuc = 3*a <= 2*b && a>10 && b>20 ; // hepsi true ise true
        System.out.println(sonuc);

        // 2- OR (veya) Operatoru ||

        int c = 10 ;
        int d = 15 ;

        System.out.println(a>b || b>0);
        System.out.println(a<=b-5 || a<0);

        boolean e;
        System.out.println(e=15>=d || c<0);

        e= c>=d || 3*c<4*d ;
        System.out.println(e);

        // || isareti toplamaya benzer sonucun 0 olmasi icin tum toplananlar 0 olmali

        /* 3- If Statements 'eger yapısı'
        * Eger iyi calisirsan, sinavi gecersin Calismazsan sonucu bilmiyoruz
        * eger(sart cumlesi belirtec
        * iyi calisirsan(boolean)
        * sinavi gecersi(sart saglanirsa sonuc)  */

        int k = 10 ;
        int l = 20 ;
        if (a>b){System.out.println("a b'den buyuk"); } // sart saglanmadigi icin { } ici gecersiz

        /* if(sart cumlesi belirtec).
        *  a>b(boolean sart).
        *  System.out.println("a b'den buyuk"); (sart saglanirsa sonuc) */




    }
}
