package ders09_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {

        String str = "Uzunkavaklaraltindayataruyumazoglu";
        //karakter sayisini bize dondurur
        System.out.println(str.length()); // 34

        // son karakteri yazdirin
        System.out.println(str.charAt(33)); // u

        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek icin kullanilir

        // sondan 3.karakteri yazdirin
        System.out.println(str.charAt(str.length()-3)); // g
    }
}
