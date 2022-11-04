package ders11_stringsManipulition;

public class C01_NullPointer {
    public static void main(String[] args) {
        String str1="";
        //str1'e deger atanmistir
        System.out.println(str1);//hiclik
        System.out.println(str1.concat("Java"));//Java

        String str2;
        //str2 olusturuldu ama deger atanmadi
        //System.out.println(str2);
        //str2'ye deger atanmadigi icin yazdirilamaz,CTE verir
       // System.out.println(str2.concat("java"));
        //degeratanmadigi icin metod'la kullanilamaz

        str2="Java guzeldir";
        System.out.println(str2);//Java guzeldir
        System.out.println(str2.concat("."));//Java guzeldir.

        String str3=null;//str3'e deger atanmamistir
        //null pointer ile javaya deger atamadigimizin farkinda oluyoruz

        System.out.println(str3);//null isaretledigini yazdirir

        //System.out.println(str3.concat("java"));  //NullPointerException


        System.out.println(str3+"Java");//nullJava normal toplamada yazdirir

        System.out.println(str3.toUpperCase());//NullPointerException








    }
}
