package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicadanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {
        //Kullanicidan istedigi kadar sayi alip bir array olusturun
        //Kullanici eleman girisini bitirmek icin 0'a bassin

        Scanner scan=new Scanner(System.in);
        int[] arr={0};
        int girilenSayi=0;

        do {

            System.out.println("Array'e eklemek icin bir tamsayi giriniz"+"\n\t"+
                    "\nBitirmek icin sıfıra basin");
            girilenSayi=scan.nextInt();

            if (arr[0]==0){
                arr[0]=girilenSayi;
            } else if (girilenSayi!=0) {
                arr=C08_ArrayeElemanEklemeMethodu.arrayeElemanEkle(arr,girilenSayi);
            }
        }while (girilenSayi!=0);
        System.out.print(Arrays.toString(arr));
    }
}
