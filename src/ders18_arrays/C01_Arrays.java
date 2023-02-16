package ders18_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        //Arrays 2 sklde olusturabilir
        int[] arr1={2,4,6,8,10};
        //array'in bir elementine ulasmak ve update etmek istersek
        System.out.println(arr1[2]);//6
        System.out.println("3.index : "+arr1[3]);//8


        arr1[3]=20;

        System.out.println("3.index yeni deger :"+arr1[3]);//artık 8'i degil yeni atanan 20'yi verir

        System.out.println(arr1.length);//5

        //son elementi yazdirin

        System.out.println(arr1[arr1.length-1]);//10

        //array'in tum elementlerini yazdirin

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        //array'in uzunlugu sonradan degistirilemez
        //eger array'de olmayan bir index'e atama yapmak isterseniz
        //ArrayIndexOutBoundsException
        //bu hata CTE(Compile Time Error) degil
        //Run time error'dur

       // arr1[5]=35;
        int[] dizi1={1,2,3};

        int[] dizi2=dizi1; dizi1[1]=200;

        System.out.println(Arrays.toString(dizi1));

        System.out.println(Arrays.toString(dizi2));

    }
}
