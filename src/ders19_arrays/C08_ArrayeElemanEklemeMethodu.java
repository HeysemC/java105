package ders19_arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {

        //Verilen bir int array'e istenen bir elementi ekleyip
        //yeni halini bize donduren bir method olusturun

        int[] abc={3,5,8,9};
        int eklenecekSayi=1;
        abc=arrayeElemanEkle(abc,eklenecekSayi);
        System.out.println(Arrays.toString(abc));//[3, 5, 8, 9, 1]

    }
    public static int[] arrayeElemanEkle(int[] eklenecekArray,int eklenecekSayi){

        int[] yeniArr=new int[eklenecekArray.length+1];

        for (int i = 0; i < eklenecekArray.length; i++) {

            yeniArr[i]=eklenecekArray[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekSayi;
        return yeniArr;
    }
}
