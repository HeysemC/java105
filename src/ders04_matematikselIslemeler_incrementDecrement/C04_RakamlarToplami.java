package ders04_matematikselIslemeler_incrementDecrement;

import java.util.Scanner;

public class C04_RakamlarToplami {


    public static void main(String[] args) {

        // kullanicinin girdigi 4 basamakli bir sayinin
        // rakamlar toplamini veren bir kod yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int input=scan.nextInt();

        int birlerBasamagi;
        int rakamlarToplami = 0 ;

        // 1- birler basamagini al
        birlerBasamagi = input % 10;

        // 2- birler basamagini rakamlar toplamina ekle
        rakamlarToplami = rakamlarToplami +birlerBasamagi;

        // 3- birler basamagindan kurtul
        input = input/10;


        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami +birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami +birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami +birlerBasamagi;
        input = input/10;


        System.out.println("verilen sayinin rakamlar toplami : " + rakamlarToplami);

        int input1 = 1453 ;

        int birlerBasamagi1;
        int rakamlarToplami1=0;

        // 1- birler basamagini al
        birlerBasamagi1 = input1 % 10; // 3
        // 2- birler basamagini rakamlar toplamina ekle
        rakamlarToplami1 = rakamlarToplami1 +birlerBasamagi1; // 3
        // 3- birler basamagindan kurtul
        input1 = input1/10; // 145


        birlerBasamagi1 = input1 % 10; // 5
        rakamlarToplami1 = rakamlarToplami1 +birlerBasamagi1; // 8
        input1 = input1/10; // 14

        birlerBasamagi1 = input1 % 10; // 4
        rakamlarToplami1 = rakamlarToplami1 +birlerBasamagi1; // 12
        input1 = input1/10; // 1

        birlerBasamagi1 = input1 % 10; // 1
        rakamlarToplami1 = rakamlarToplami1 +birlerBasamagi1; // 13
        input1= input1/10; // 0


        System.out.println("verilen sayinin rakamlar toplami1 : " + rakamlarToplami1);
    }
}
