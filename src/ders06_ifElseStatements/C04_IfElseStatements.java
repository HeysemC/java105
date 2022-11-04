package ders06_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if (krk >= 'A' && krk <= 'z'){
            System.out.println("Buyuk harf");
        }else {
            System.out.println("Buyuk harf degil");
        }

        /* ******************************************* */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen bir karakter daha giriniz");
        char krk1 = scan.next().charAt(0);

        if (krk1 >= 'A' && krk1 <= 'z'){
            System.out.println("Buyuk harf");
            } else if (krk1>='a' && krk1<='z') {
            System.out.println("Kucuk harf");
        }else {
            System.out.println("Gecerli harf giriniz");
        }


    }
}
