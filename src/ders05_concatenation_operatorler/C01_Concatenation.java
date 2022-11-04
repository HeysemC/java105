package ders05_concatenation_operatorler;

public class C01_Concatenation {

    public static void main(String[] args) {

        // sadece asagida verilen variable'lari kullanarak istenilen degerleri yazdiralim

        String s1 = "Java" ;
        String s2 = "Guzeldir" ;
        String s3 = "" ; // hiclik
        String s4 = " " ; // space, bosluk

        int sayi1 = 4 ;
        int sayi2 = 3 ;

        // "" String'leştirir

        // Java Guzeldir7
        System.out.println(s1+s4+s2+(sayi1+sayi2));

        // Java Guzeldir 12
        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));
        System.out.println(s1+s4+s2+s4+sayi1*sayi2);

        // 7 Java Guzeldir
        System.out.println((sayi1+sayi2)+s1+s4+s2);
        System.out.println(sayi1+sayi2+s1+s4+s2);

        // 34 Java
        System.out.println(s3+sayi2+sayi1+s4+s1);

        // Java7 Guzeldir 43
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);

        // Relational(karsilastirma) "esittir" == , "esit degildir" != demektir java'da
        int b = 15 ;
        int a = 10 ;
        boolean c ;
        System.out.println(c=15==b);

        c=15*a==10*b;

        System.out.println(c);

        System.out.println(a!=b);

        System.out.println(a!=b-5);

        System.out.println(c=15!=b);

        c=15*a!=10*b;
        System.out.println(c);

        /* Logical (Mantiksal) Operators
           1-&&,& (And(ve) Operators (soyut matematik topoloji)  */
        System.out.println(a>b && b>0);

        System.out.println(a<=b-5 && a>b-8);

        System.out.println(c=15>=b && a<0);

        c = a>=b && 3*a<4*b;
        System.out.println(c);

        /* && --> mantikdaki ' ve ' baglaci
           & -->  mantikdaki ' veya ' baglaci */











    }
}
