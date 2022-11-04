package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArtirma;
import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {

        // verilen bir int array'in elementlerini 2 arttirin
        int[]arr={2,3,4};
        arr=C03_ArrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));

        //arr array'inin elementlerini toplayip sonucu yazdirin
        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr));

        //arr array'inde 10 element olarak olarak var mi?
        C05_ArraydeElemanArama.elemanAra(arr,10);

        //kullanicidan bir deger alarak bir array olusturun
        int[] yeniArr=C06_KullaniciyaArrayOlusturma.arrayOlusturma();
        System.out.println(Arrays.toString(yeniArr));
        //Arrays.sort() method'u array'i Natural Order eder

    }
}
