package ders26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {

        //Bir method olusturalim method'da yeni bir list'te olusturun
        //list'teye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        //sonra sayilar listesine deger olarak yeni listi atayin ve
        //sayilar listini yazdirin


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        yeniListDegeriAta(sayilar);
        System.out.println("Method call'dan sonra main method'da sayilar list : "+sayilar);

        C02_PassByValueList.elementleri5Artir(sayilar);


    }
    public static void yeniListDegeriAta(List<Integer> sayilar){
        List<Integer> yeniList=new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            yeniList.add(sayilar.get(i)+5);
        }
        sayilar=yeniList;
        System.out.println("Method'da sayilar listesinin son hali : "+sayilar);
    }

}
