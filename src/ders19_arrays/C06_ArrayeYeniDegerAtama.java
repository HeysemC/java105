package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayeYeniDegerAtama {
    public static void main(String[] args) {
        String str="Java";
        str="Hava";

        String[] arr1={"Ali","Veli"};
        String[] arr2={"A","B","C"};

        arr1=arr2;
        System.out.println(Arrays.toString(arr1));//[A, B, C]

        /*
        Var olan bir array'in uzunlugu degistirilemez
        AMA
        var olan bir array'e yeni bir array degri atanabilir
        1-var olan bir array'i yeni deger olarak atayabiliriz (arr1=arr2;)

        2-istedigimiz uzunlukta bos yeni bos bir array degeri atayabiliriz(arr1=new String[6];)

        3-yeni olusturulan bir array'e { } icinde deger yazarak atama yapabilirz
        ancak var olan bir array'e yeni deger atamasi icin { } KULLANİLAMAZ (arr1={"g","h"};)
         */
        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null, null]

        //arr1={"g","h"}; olmaz

        int [] arr={3,4,5};

    }
}
