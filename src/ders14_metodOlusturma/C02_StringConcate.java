package ders14_metodOlusturma;

public class C02_StringConcate {
    //verilen iki stringi parametre kabul edip
    //bu iki String'i aralarinda bir bosluk olan tek bir String olacak
    //main method'a donduran bir method olusturun

    public static void main(String[] args) {
        String str1="Java",str2="Candir";


        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("Bu da","oldu"));
        System.out.println(birlestirMethodu("Anladiniz","mi?"));


    }

public static String birlestirMethodu(String str1,String str2){
        return  str1+" "+str2;
}


}
