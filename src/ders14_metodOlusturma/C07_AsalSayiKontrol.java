package ders14_metodOlusturma;

public class C07_AsalSayiKontrol {
    /*
    Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi olup olmadigini kontrol edip,
    sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
     */
    public static void main(String[] args) {
        int sayi=24;
        System.out.println(asalSayiKontrolEt(sayi));//asal degil 23 icin asal
        System.out.println(asalSayiKontrolEt(23));//asal
        System.out.println(asalSayiKontrolEt(567344536)); //asal degil

    }
    public static String asalSayiKontrolEt(int sayi) {
        String sonuc="";

        for (int i = 2 ; i <= (sayi-1) ; i++ ){
            if (sayi%i==0){
                sonuc="asal degil";
                break;
            }
    }
        if (!sonuc.equals("asal degil")){
            sonuc="asal";
        }
        return sonuc;

    }
}







/*
 asal(34);
    }
    public static void asal(int integer)
    {
        int bayrak=0;
        for(int i=2;i<=integer-1;i++)
        {
            if(integer % i == 0)
            {
                bayrak++;
                break;
            }
        }
        if (bayrak==0)
            System.out.println("ASALDIR");
        else
            System.out.println("asal değidir");
    }
 */