package ders31_inheritance;

public class GCoralla extends FToyata{

    String model="Coralla";
    String uretimYeri="Turkey";

    GCoralla(){
        super();
        System.out.println("Corolla cons. calisti");
    }

    public static void main(String[] args) {
        GCoralla coralla1=new GCoralla();
        System.out.println(coralla1.marka);//Toyota

        /*

         */

    }
}
