package ders11_stringsManipulition;

public class C05_Repeat_Trim {
    public static void main(String[] args) {
        String str="java  guzeldir \n";

        /*
        java  guzeldir
java  guzeldir
java  guzeldir
java  guzeldir

         */
        System.out.println(str.repeat(4));
        //java  guzeldir java  guzeldir java  guzeldir java  guzeldir
        str="   Java guzeldir   " ;

        System.out.println(str.length());//19

        str=str.trim();
       //trim basindaki sondaki  spaceleri siler
        System.out.println(str);//Java guzeldir
        System.out.println(str.length());//13
    }
}
