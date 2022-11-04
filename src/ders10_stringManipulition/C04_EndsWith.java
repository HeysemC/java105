package ders10_stringManipulition;

public class C04_EndsWith {
    public static void main(String[] args) {

        String str="Java her yerde guzel";

        System.out.println(str.endsWith("guzel")); //true

        System.out.println(str.endsWith("")); //true

        System.out.println(str.endsWith("Java  yer yerde guzel")); //true

        System.out.println(str.endsWith("Java")); //false


    }
}
