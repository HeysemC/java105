package ders08_ternary_switch;

import java.util.Scanner;

public class C05_NestedTernary {
    public static void main(String[] args) {

        /*
        Ornek : Kullanicidan bir tamsayi alin.
 Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
 Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
         */
        Scanner scan = new Scanner(System.in);
        int sayi= scan.nextInt();

        if (sayi>0){

            // cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
            System.out.println(sayi%2==0 ? "Cift sayi" : "Cift sayi degil");
        }else {

           // 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
            System.out.println(sayi<-99 && sayi>-1000 ? "Uc basamakli" : "Uc basamakli degil");
        }
        //Nested Ternary ile cozumu;
String sonuc= sayi>0
        ?
        sayi%2==0 ? "Cift sayi" : "Cift sayi degil"
        :
        sayi<-99 && sayi>-1000 ? "Uc basamakli" : "Uc basamakli degil" ;


        int a= 10;
        int b= 20;
        System.out.println(a>5 ? a>0 ? 100 : 50 : a<20 ? a+5 : a-5);
         System.out.println(b<a ? b>0 ? b+a :b-a : a<10 ? a*5 : b/a);
          System.out.println(a==b ? a > b ? a : b : a<b ? a+b : a-b);






















    }
}
