package ders14_metodOlusturma;

public class C05_SubstringOlustur {
    public static void main(String[] args) {
        int a =10,b=20;
        //bu iki sayinin carpim sonucunu yeni kod yazmadan konsola yazdirin
        System.out.println(C01_Carpim.capimMetodu(a, b));

        String c="Nasil",d="yani";
        // bu iki String'i aralarinda bir bosluk birakarak yazdirin
        System.out.println(C02_StringConcate.birlestirMethodu(c, d));

        String e="Bu da mi oldu?";
        //e String'ini tersten yazdirin
        System.out.println(C03_StringTerseCevirme.StringiTerseCevir(e));


        //"Bu cumleyi terse cevirin"

        System.out.println(C03_StringTerseCevirme.StringiTerseCevir("Bu cumleyi terse cevirin"));


      String str="Java cok guzel";
      //str'i buyuk harf olarak yazdirin
        str.toUpperCase();// bu "JAVA COK GUZEL" getirir ama yazdirmaz
        System.out.println(str.toUpperCase());






    }
}
