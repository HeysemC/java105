package ders10_stringManipulition;

public class C08_LastIndexOf {
    public static void main(String[] args) {

        String str="Java hafiften beyin yakiyor";

        System.out.println(str.lastIndexOf("a"));//java aramaya sondan baslayacak ve a'yi arayacak
        // ama index'i bastan sayarak verecek 21

        System.out.println(str.lastIndexOf('e'));//aramaya sondan baslayip e'yi arayacak
        // ve son e'nin index'ini bastan sayip index'ini vericek 15

        System.out.println(str.lastIndexOf("java"));//sondan basladim,bastabuldum 1 tane var
        // ama kucuk "j" oldugu icin -1(index)

        System.out.println(str.lastIndexOf("Java"));//0

        System.out.println(str.lastIndexOf("e",14));//bu sefer aramaya 14ten baslayacak(b'den)
        // basa dogru arayacak 11


    }
}
