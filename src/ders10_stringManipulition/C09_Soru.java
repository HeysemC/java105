package ders10_stringManipulition;

public class C09_Soru {
    public static void main(String[] args) {
        /*
        kullanicidan bir cumle ve bir metin alin,
        cumlede metnin durumuna göre,
        1-cumle metni icermiyor
        2-cumle metni sadece 1 kere iceriyor,
        3-cumle metni birden fazla iceriyor,
        seceneklerinden uygun olani yazdirin
         */
        String cumle1="Java cok guzeldir cok.";
        String metin1="cok";

        int ilkIndex=cumle1.indexOf(metin1);
        int sonIndex=cumle1.indexOf(metin1);

        if (ilkIndex==(-1)){
            System.out.println("cumle metni icermiyor");
        } else if (ilkIndex==sonIndex) {
            System.out.println("cumle metni 1 kere iceriyor");
        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }

    }
}
