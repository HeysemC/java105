package ders10_stringManipulition;

public class C10_IsEmpty {
    public static void main(String[] args) {

        String str="";

        System.out.println(str.isEmpty()); // true

        str="   ";
        System.out.println(str.isEmpty()); //false cunku karakter var

        System.out.println(str.isBlank()); //true

        str="x";

        System.out.println(str.isEmpty()); //false (isEmpty bosluklari kabul etmez)

        System.out.println(str.isBlank()); //false (isBlank boşluklari kabul eder)
    }
}
