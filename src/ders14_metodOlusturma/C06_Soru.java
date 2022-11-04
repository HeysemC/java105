package ders14_metodOlusturma;

public class C06_Soru {
    /*
    Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip, isim bosluk soyisim seklinde bize donduren bir method olusturun
 input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz

     */
    public static void main(String[] args) {
        String isim ="OMER", soyIsim="kesen ";

        System.out.println(isimSoyisimDuzenle(isim, soyIsim));//Omer Kesen
        System.out.println(isimSoyisimDuzenle("Heysem", "RENkOğLU"));

    }
    public static String isimSoyisimDuzenle(String isim,String soyIsim){
        String yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
                                               +" " +
                                               soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();
        return yeniIsimSoyisim;
    }
}
