package ders25_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {
        double fiyat=100;

        indirimUygula(fiyat);
        System.out.println(indirimUygula(fiyat));//90
        System.out.println(indirimUygula(fiyat));//90
        System.out.println(indirimUygula(fiyat));//90

        System.out.println(fiyat);//100
    }

    private static double indirimUygula(double fiyat) {
        //%10 indirm yapsin

        fiyat=fiyat*0.9;//fiyata atama yaptık kalici olarak 90 oldu
        return fiyat;
    }
}
