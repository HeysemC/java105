package ders06_ifElseStatements;

public class C09_IfElseStatements {
    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // sayi negatif ise "gecersiz sayi"
        // tek basamakli ise "rakam"
        // iki basamakli ise "iki basamakli"
        // bunu disindaki sayilar icin "buyuk sayi" yazdirin

       int sayi=1002;
       
       if (sayi<0){
           System.out.println("gecersiz sayi");
       } else if (sayi<10) {
           System.out.println("girdiginiz sayi rakamdir");
       } else if (sayi<100) {
           System.out.println("iki basamakli sayi");
       }else {
           System.out.println("buyuk sayi");
       }


    }
}
