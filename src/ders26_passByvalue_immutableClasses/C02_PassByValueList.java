package ders26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        //Bir method olusturalim method'da list'teki sayilari 5 artiralim
        // ve method'da list'nin son halini yazdiralim
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        elementleri5Artir(sayilar);

        //method call sonrasi main method icersinde List'i tekrar yazdiralim

        System.out.println("Method call sonrasi main method'da list : " +sayilar);
    }
    public static void elementleri5Artir(List<Integer> sayilar){
        List yenilist=new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i,sayilar.get(i)+5);
        }

        yenilist=sayilar;
        System.out.println(yenilist);

    }
}
