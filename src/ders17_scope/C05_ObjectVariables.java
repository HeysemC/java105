package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {
    public static void main(String[] args) {

        /*C03 class'imdaki instance variable'lara nasil ulasabilirim
        instance variable'larin diger adi obje variable'laridir
        instance variable'lara obje uzerinden ulasabiliriz

        */


        C03_ObjectVariables pers1=new C03_ObjectVariables();
        System.out.println(pers1.personelIsmi);//Isim girilmedi
        System.out.println(pers1.personelYasi);//0 deger atanmadigi icin
        pers1.personelIsmi="Suleyman";
        pers1.personelYasi=35;
        pers1.personelTelefonu="454545455677";
        System.out.println(pers1.personelIsmi);//Suleyman
        System.out.println(pers1.personelYasi);//35

        C03_ObjectVariables pers2=new C03_ObjectVariables();
        pers2.personelIsmi="Latife";
        pers2.personelYasi=32;
        pers2.personelTelefonu="33437457465586";


        System.out.println(pers1.personelIsmi);//Suleyman
        System.out.println(pers2.personelIsmi);//Latife

        C03_ObjectVariables pers3=new C03_ObjectVariables();
        pers3.personelIsmi="Heysem";
        pers3.personelYasi=30;
        pers3.personelTelefonu="23479867654";

        System.out.println(pers1.personelYasi);//35
        System.out.println(pers2.personelYasi);//32
        System.out.println(pers3.personelYasi);//30

        //static variables'ler varsa herkeze var (ay dede gibi)
        //object variables'lar objeye vardir (evin lambasi)

    }
}
