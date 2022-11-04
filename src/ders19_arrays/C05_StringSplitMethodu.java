package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {

        String str="Java gercekten cok cok guzel";

        //verilen String'te kaç tane e harfi oldugunu bulunuz
        String[] eArrayi=str.split("e");//5 verdi ama 4 sonuc cunku 5 element olusturdu
        System.out.println(Arrays.toString(eArrayi));
        System.out.println(eArrayi.length);
        System.out.println("Metindeki e sayisi : " + (eArrayi.length-1));


        String [] arrVirgul=str.split(",");
        System.out.println(Arrays.toString(arrVirgul));

        String [] arrSpace=str.split(" ");
        System.out.println(Arrays.toString(arrSpace));

        //2.yontem
        //String'i "" ile split yaparak karakterlerine ayiralim

        String[] arrHiclik=str.split("");
        System.out.println(Arrays.toString(arrHiclik));
        //[J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]

        int sayac=0;
        //bir loop ile tum karakterleri kontrol edelim

        for (int i = 0; i < arrHiclik.length; i++) {
            if (arrHiclik[i].equals("e")){
                sayac++;
            }

        }
        System.out.println("Metindeki e sayisi : "+ sayac);


    }
}
