package ders10_stringManipulition;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str="Ahmet hoca ile her sey clear";

        System.out.println(str.indexOf("a")); //9 (ilk a'nın bulundugu index'ini dondurur

        System.out.println(str.indexOf('c')); //8

        System.out.println(str.indexOf("her sey")); //15 blok olarak kabul eder basladigi index'si yazdirir

        System.out.println(str.indexOf("e",9)); //9'dan sonra aramaya basla ve ilk buldugun e'yi

        //13.index'deki e'den bir sonraki e'nin index'ini bulalim
        System.out.println(str.indexOf("e",14)); //16.index'teki e'yi bulur

        //cumlediki 2.c'nin index'ini yazdirin

        int ilkcindex=str.indexOf("c"); //c
        System.out.println(str.indexOf("c",ilkcindex+1)); //23

        System.out.println(str.indexOf("ali")); // index olarak int dondurmesi bekleniyor,
        // eger yoksa java bunu sabitlemis -1 doner


    }
}
