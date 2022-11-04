package ders08_ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a=5;
        //ternary operator tek basina kullanilamaz
        //ternary bize bir sonuc uretir
        //bu sonucu direk yazdirmali veya bir veriable'a atamaliyiz

        String sonuc= a%2==0 ? "cift sayi" : "tek sayi";

        /*
        ternary'nin sonucunu bir veriable'a atayacaksak
        true ve false durumlarinda uretilecek sonucun
        ayni data turune uygun olmasi gerekir.
        aksi halde CTE olusur

        ama ternary'i sout icinde kullanirsak
        sonuclarin data turunun ayni olmasi sart olmaz.
         */

        String sonuc2=a>10 ? "buyuk sayi" : ""+2*a; // CTE(compayn time error) vermemesi icin String'e cevirdik

        System.out.println(a>10 ? "buyuk sayi" : 2*a);




















    }
}
