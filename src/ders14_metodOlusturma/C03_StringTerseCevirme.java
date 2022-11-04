package ders14_metodOlusturma;

public class C03_StringTerseCevirme {
    //parametre olarak String kabul edip
    //String'in terse cevrilmis haline donduran bir method olusturun
    public static void main(String[] args) {
        String input="java kod yazdikce ogrenilir";
        System.out.println(StringiTerseCevir(input));

    }
    public static String StringiTerseCevir(String input) {
        String tersStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {

            tersStr = tersStr + input.charAt(i);
        }
          return tersStr;
    }
}

