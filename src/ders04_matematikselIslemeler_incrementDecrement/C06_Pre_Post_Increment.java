package ders04_matematikselIslemeler_incrementDecrement;

public class C06_Pre_Post_Increment {

    public static void main(String[] args) {

        int a = 10 ;

        // a variable'nin degerini yazdirip, sonra a'nin degerini bir artirin

        System.out.println("a : " + a); // 10
        a++ ; // a artik 11 ama konsolda gorunmedi

        int b = 10 ;
        // b variable'nin degerini bir artirip, sonra yazdirin

        b++ ;
        System.out.println("b : " + b); // 11

        // bu islemi daha pratik yapalim
        int c = 10 ;
        // c variable'nin degerini yazdirip,sonra c'nin degerini bir artirin ( kısa yol )

        System.out.println("c :" + c++ );

        int d = 10 ;
        // d variable'nin degerini bir artirip, sonra yazdirin

        System.out.println("d :" + ++d ); // 11


/*
        c++ veya ++d'yi yazdirma veya atama isleminde kullanirsaniz
        c++'e post increment denir o satir (27) icin once islemi yapar sonra artirma yapar

        ++d'ye ise pre increment denir, once artirma yapip sonra islemi yapar

        islemin oldugu satirin bir alt satirina gecildiginde
        c'de d'de bir artmistir
 */



    }
}
