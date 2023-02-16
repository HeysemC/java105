package ders18_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String [] arr={"Ali","Ulus","Nesrin"};

        //Bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");

        }
        System.out.println("");
        //Bu array'i array olarak yazdiralim
        System.out.println(arr);//[Ljava.lang.String;@35f983a6
        // array bir obje oldugundan /non-primitive data oldugundan java referansini yazdirir
        //Array'i array olarak yazdirmak isterseniz Array class'indan yardim almalisiniz
        System.out.println(Arrays.toString(arr));//[Ali, Ulus, Nesrin]

    }
}
