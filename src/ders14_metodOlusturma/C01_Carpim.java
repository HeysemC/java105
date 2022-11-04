package ders14_metodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    public static void main(String[] args) {
        //main metod icerisinde kullanicidan iki sayi alin
        //bu iki sayiyi parametre  olarak kabul edip, carpimlarini main metod'a donduren bir metod olusturun
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sati1=scan.nextDouble(),sayi2=scan.nextDouble();
        System.out.println(capimMetodu(sati1,sayi2));//17.0
        double carpimSonucu=capimMetodu(6,2);//12.0
        // yukardaki satir icin carpim metodu calisti ama yazdirmadik

    }
    public static double capimMetodu(double sayi1,double sayi2){
        System.out.println("carpim metod'u calisti");
        return  sayi1*sayi2;
    }


}
