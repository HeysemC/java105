package ders11_stringsManipulition;

public class C02_Replace {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.replace('a', 'A'));//JAvA cAndir (gecicidir)

        System.out.println(str.replace(' ','_'));//Java_candir

        System.out.println(str.replace("candir","cok guzeldir"));//Java cok guzeldir

        System.out.println(str.replace(" ",""));//Javacandir

        //String'deki tum a'lari sil
        System.out.println(str.replace("a",""));//Jv cndir

        //Java yerine Hava,candir yerine cok guzel yazdiralim
        System.out.println(str.replace("Java","Hava")
                .replace("candir","cok guzel"));//Hava cok guzel
        //Sadece 1.a'yi A yapin
        System.out.println(str.replaceFirst("a","A"));// JAva candir


    }
}
