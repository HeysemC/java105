package ders26_passByvalue_immutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {
        String str="Java candir";
        str=str.toUpperCase();

        System.out.println(str);//JAVA CANDIR

        /*
        IMmutable class'lardan olusturulan bir objenin degeri DEGISTIRILEMEZ
        Eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje olusturur,
        ve bu yeni atadiginiz degeri atar

        eski obje bosa cikar ve garbage collector tarafindan silinmeyi bekler
         */
    }
}
