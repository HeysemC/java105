package ders26_passByvalue_immutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {
        //verilen bir array'in elementlerini 5 arttirip
        //sonra yazdiran bir method olusturn

        int[] arr={3,4,5};
        elemenetleri5artir(arr);
        elemenetleri5artir(arr);
        elemenetleri5artir(arr);

        System.out.println("Method call'dan sonra main method icinde arr : "
                           +Arrays.toString(arr));
    }
    public static void elemenetleri5artir (int[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));
    }
}
