package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu
        ve elementlerini alip array’i olusturan
        ve bize donduren bir method olusturun.
         */
        int[] kullaniciArrayi=arrayOlusturma();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }

    public static int[] arrayOlusturma(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Olusturulacak array'in boyutunu giriniz");

        int length=scan.nextInt();

        int[] kullaniciArrayi=new int[length];

        for (int i = 0; i < length; i++) {

            System.out.println("array'e eknelecek bir sayi giriniz");
            kullaniciArrayi[i]=scan.nextInt();
        }
        return kullaniciArrayi;
    }
}
