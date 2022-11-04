package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.reverse());//ridnaC avaJ

        System.out.println("Tersini yazdirdiktan sonra sb1 : "+sb1);//Tersini yazdirdiktan sonra sb1 : ridnaC avaJ

        System.out.println(sb1.insert(0, "."));//.ridnaC avaJ

        System.out.println(sb1);//.ridnaC avaJ

        sb1.reverse();

        StringBuilder sb2 = new StringBuilder("Java Candir.");
        String str = "Java Candir.";

        System.out.println(sb1==sb2);//false(icerik ayni olsa bile)
        System.out.println(sb1==sb1);//true(sadece bir sb kendisi ile karsilastirilirsa true verir)
        //System.out.println(sb1==str);farkli iki data turu == ile karsilastirilamaz
        // kabul bile etmiyor

        System.out.println(sb1.equals(sb2));//false (icerik ayni olsa bile)
        System.out.println(sb1.equals(sb1));//true(sadece bir sb kendisi ile karsilastirilirsa true verir)
        System.out.println(sb1.equals(str));//false(CTE vermez fakat sonuc her zaman false'dur)

        System.out.println(sb1.compareTo(sb2));// 0
        StringBuilder sb3 = new StringBuilder("Hava Candir");
        System.out.println(sb1.compareTo(sb3));//2

        /*
        CompareTo sadece tamamen ayni mi yoksa fakli mi sorusunun cevabini verir
        tamamen ayni ise ==> 0 doner
        farklilik varsa ==> ilk farkli harfi buldugunda,
        farkli harflerin arasinde kac harf oldugunu verir
         */



    }
}
