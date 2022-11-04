package ders26_passByvalue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {
        double fiyat=100;

        indirimUygula(fiyat);
        System.out.println(indirimUygula(fiyat));//90
        System.out.println(indirimUygula(fiyat));//90
        System.out.println(indirimUygula(fiyat));//90

        System.out.println(fiyat);//100

        fiyat=indirimUygula(fiyat);

        System.out.println("Indirim uygulanmis yeni fiyat : "+fiyat);//90

    }
    /*
    Kodlarimizin anlasilir olmasi icin main method'dan diger method'lara
    parametre olarak gonderdigimiz variable'lar icin ayni isimli variable
    olusturmayi TERCIH EDERIZ

    Java method'lar arasi gecis yaparken variable'i degil
    variable'in value'sunu pass eder

    Bu Java'nin Pass By Value'yu tercih etmesinden kaynaklaniyor

    Eger method'un icersinde yaptiginz degisikligin main method
    icinde gecerli olmasini isterseniz
    main method icersinde
    fiyat=indirimUygula(fiyat);

    atamasini yapabiliriz.
     */

    private static double indirimUygula(double fiyat) {
        //%10 indirm yapsin

        fiyat=fiyat*0.9;//fiyata atama yaptık kalici olarak 90 oldu
        return fiyat;
    }
}
