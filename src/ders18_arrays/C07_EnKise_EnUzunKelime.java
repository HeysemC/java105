package ders18_arrays;

public class C07_EnKise_EnUzunKelime {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki
        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
         */

        String[] arr={"Hasan","Omer","Senturk","Omer Faruk"};
        enUzunEnKisaIsimleriYazdir(arr);
    }
    public static void enUzunEnKisaIsimleriYazdir(String[]arr){
        String enUzunKelime=arr[0];
        String enKisaKelime=arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length()>enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }
        }
        System.out.println("En uzun isim : "+enUzunKelime);
        System.out.println("En kisa isim : "+enKisaKelime);
    }
}
