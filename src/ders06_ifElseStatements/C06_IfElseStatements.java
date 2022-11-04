package ders06_ifElseStatements;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        int not = 56;

        /*if else statements'da { } kullanmazsak,
         *hem if body'si hem de else body'si icin sadece 1 satir kabul eder.

         * sonraki satirlar if-else ile iliskilendirilmez her durumda calisir (calisiyorsa) */

        if (not >= 50) {
            System.out.println("Sinifi gectin");
            System.out.println("Yazin kafan rahat");
        }else {
            System.out.println("Bu dersten kaldin");


            System.out.println("Yaz okuluna bekleriz :) ");
        }
    }
}
