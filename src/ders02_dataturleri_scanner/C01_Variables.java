package ders02_dataturleri_scanner;

public class C01_Variables {
    public static void main(String[] args) {
        int okulNo = 885 ;

        System.out.println(okulNo); // 885

        System.out.println("okulNo"); // bu bize " " icersini yazdirir

        System.out.println("okulNo : " + okulNo ); // okulNo : 885


        /* İNT yazdıktan sonra deger verildikten sonra bir daha yazmamiza gerek yok (hata verir)

         */

          okulNo=976;

        System.out.println("yeni okul no :" + okulNo);


        /* Pratik bir bilgi vereyim arkadaslara. Degisken adini yazip nokta koyup sout yazip tab tusunu
        kullanabilirsiniz. okulNo.sout + tab tusu

         System.out.println(okulNo);

         */

         int not2 = 60 ;

         not2 = not2 + 10 ; //  bu satir matematiksel olarak yanlistir ancak java'ya göre dogrudur

        System.out.println(not2);

        // java yukaridan asagiya ve sagdan sola calisir

        double bankadakiParam = 1000 ;

        bankadakiParam = bankadakiParam + 100 ;

        bankadakiParam = bankadakiParam - 200 ;

        System.out.println(bankadakiParam); // 900


        



    }
}
