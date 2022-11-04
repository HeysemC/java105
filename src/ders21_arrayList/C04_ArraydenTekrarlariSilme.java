package ders21_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        /*
        verilen bir array'deki tekrar eden sayilari
        bir kere olacak sekilde array'i duzenleyin
         */
        int[] arr={1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        //bu soruyu array'le yapmak cok zor
        //bunun yerine bu array'in elemanlarini tek tek inceleyip,
        //tekrarsiz olanlari bir list'e atalim
        //en son o list'deki elementleri iceren bir array olusturup,
        //yeni array'i eski array'e deger olarak atayalim

        List<Integer> tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }

        }

        System.out.println("tekrarsiz liste : "+tekrarsizListe);
        //en son o list'deki elementleri array'e atamak gerekir
        //bunun icinn once array'e yeni ve bos bir array degeri atayalim
        //sonra list'de elementleri array'e tasiyalim

        arr=new int[tekrarsizListe.size()];//[0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsizListe.get(i);

        }
        //array istenen hale geldi

        System.out.println("Array'in tekrarsiz hali : "+ Arrays.toString(arr));
    }
}
