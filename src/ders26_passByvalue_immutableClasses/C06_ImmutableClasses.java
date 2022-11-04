package ders26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java guzeldir";

        System.out.println(str.toUpperCase());//JAVA GUZELDIR

        System.out.println(str);//Java guzeldir

        str.toLowerCase();

        System.out.println(str);//Java guzeldir

        //String immutable oldugu icin method ile yapilan degisiklikler
        //String'i kalici olarak degistirmez
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);
        System.out.println(harfler);//[B]

        //Ancak List ve Array mutable olduklarin icin
        // method ile yapilan degisiklikler kalici olur

    }
}
