package ders08_ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        /*JDK
        J: Java
        D: Devolepment
        K: Kit
        Kullanicidan bir harf alin
        alinan harf J,D,K'dan biri ise yukaridaki kelimeleri yazdirin
        bu harflerden biri degilse "Gecersiz harf" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
       char harf = scan.next().charAt(0);

       switch (harf){
           case 'J':
           case 'j':
               System.out.println("Java");
               break;
           case 'D':
           case 'd':
               System.out.println("Devolepment");
               break;
           case 'K':
           case 'k':
               System.out.println();
               break;
           default:
               System.out.println("Gecersiz harf");
       }
          /*Switch Statements'da
          -long
          -double
          -float
          -boolean
          kullanilamaz
          Switch'in calismasi uygun case'de calismaya baslar,
          caselerde break görene kadar calisir
          Switch'de default görene kadar devam eder
           */








    }
}
