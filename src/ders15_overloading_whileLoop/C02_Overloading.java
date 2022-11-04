package ders15_overloading_whileLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        //method call dedigimde
        carpim(3,4);//method call sirasinda method parantezine yazilanlara argument denir
        carpim(3.4,2);//
    }
//bir classta aynı isim ve aynı signature sahip iki method olmaz



    /*
    method overloading olan class'larda Java hangi methodun calisacagina
    su sekilde karar verir
    1-once method ismine bakar (var mı?)
    2-argument sayisi ile parametre sayisina bakar
    3-parametrelerin ve argumentlerin uyumuna bakar
    4-minumum casting yapacagını secer
     */
    public static void carpim(int sayi1,int sayi2){ // carpim int int
        System.out.println("Iki int sayinin carpimi : " + sayi1*sayi2);
    }
    public static void carpim(int sayi3,int sayi4,int sayi5){ // carpim int int int
        System.out.println("Uc int sayinin carpimi : " + sayi3*sayi4*sayi5);
    }
    public static void carpim(double sayi1,int sayi2) { // carpim double int
        System.out.println("double ve int iki sayinin carpimi : " + sayi1 * sayi2);
    }
    public static void carpim(int sayi1,double sayi2) { // carpim int double
        System.out.println("Int ve double iki sayinin carpimi : " + sayi1 * sayi2);
    }
    public static void carpim(double sayi1,double sayi2) { // carpim double double
        System.out.println("Iki double sayinin carpimi : " + sayi1 * sayi2);
    }
}
