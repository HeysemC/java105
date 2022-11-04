package ders06_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

       // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.
        // ! eger girilen sayi veya sayilar negatif veya sıfır olursa !


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenarini giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar ucgen degil");
        }

        double not = 50.3;

        if (not>=85){
            System.out.println("Notunuz AA");
        }else if (not>=65){
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Notunuz CC");

        }
    }
}
