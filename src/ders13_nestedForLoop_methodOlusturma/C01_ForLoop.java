package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        String input="Java ne kadar guzel";

        for (int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
        //bakıis acisi
        Scanner scanner=new Scanner(System.in);
        String str =scanner.nextLine();
        for (int i= str.length()-1; i>=0; i--) {
            System.out.println(str.substring(i,i+1));
        }










    }
}
