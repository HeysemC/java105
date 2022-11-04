package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tam sayiyi giriniz");
        int sayi1= scan.nextInt();


        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        int bos ;

        bos = sayi2 ;

        sayi2 = sayi1 ;

        sayi1 = bos ;

        System.out.println("sayi1'in degeri :"+ sayi1  );

        System.out.println("sayi2'nin degeri :" + sayi2 );






        //kullanıcıdan ikisayı alıp degerlerini değiştirin




        System.out.println("1.tamsayıyı giriniz: ");
        int sayi8=scan.nextInt();

        System.out.println("lutfen 2. tam sayıyı giriniz");
        int sayi9=scan.nextInt();

        int sayi3=sayi8;

        sayi8=sayi9;

        sayi9=sayi3;

        System.out.println("sayı1 :" + sayi8);

        System.out.println("sayı2 :" + sayi9);


    }
}
