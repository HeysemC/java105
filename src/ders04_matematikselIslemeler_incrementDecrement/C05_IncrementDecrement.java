package ders04_matematikselIslemeler_incrementDecrement;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi = 10 ;
        // bu sayiyi 3 artiralim ve yazdiralim

        sayi = sayi + 3 ;


        System.out.println(sayi); // 13

        sayi += 3 ;

        System.out.println(sayi); // 16


        int s = 10 ;

        // bu sayiyi 1 artirin

          // 1-yol
        s = s + 1 ;
        System.out.println(s); // 11

          // 2-yol
        s+= 1 ;
        System.out.println(s); // 12

        // 3-yol
        s++ ;
        System.out.println(s); // 13

        // 4-yol
         ++s ;
        System.out.println(s); // 14

        int t = 10 ;
        // bu sayinin degeri 1 eksiltelim

        //1-yol
         t = t-1 ; // 9

         //2-yol
         t -=1 ;// 8

         //3-yol
         t-- ; // 7

         //4-yol
         --t ; // 6

        System.out.println(t);


    }
}
