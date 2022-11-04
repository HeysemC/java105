package ders11_stringsManipulition;

public class C03_ReplaceALL {
    public static void main(String[] args) {
        String str="J1va2 G9uzel5dir8";
        //str'deki sayilari silip metni Java Guzeldir haline donusterlim

        //str.replaceALL() sadece bir harf veya char sequence'i degil
        //genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir

        System.out.println(str.replaceAll("\\d",""));//Java guzeldir

        System.out.println(str.replaceAll("\\D",""));//12958

        String s1="ilk urun fiyati : 1250 tl";
        String s2="ikinci urun fiyati : 1500 tl";
        //iki urunun fiyatini topla
        s1=s1.replaceAll("\\D","");//1250
        s2=s2.replaceAll("\\D","");
        System.out.println(s1+s2);
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//2750
    }
}
