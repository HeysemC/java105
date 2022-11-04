package ders10_stringManipulition;
import java.util.Scanner;
public class C07_Soru {
    public static void main(String[] args) {
        /*
        kullanicidan bir cumle ve bir metin alin,
        cumlede metnin durumuna göre,
        1-cumle metni icermiyor
        2-cumle metni sadece 1 kere iceriyor,
        3-cumle metni birden fazla iceriyor,
        seceneklerinden uygun olani yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle yaziniz");
        String cumle=scan.nextLine();
        System.out.println("bir metin yazin");
        String metin=scan.nextLine();
         int sonuc=cumle.indexOf(metin);
         int sonuc1=cumle.lastIndexOf(metin);
                      if (sonuc<0){
                          System.out.println("cumle metni icermiyor");
                      } else if (sonuc>0 && sonuc1==sonuc ) {
                          System.out.println("cumle metni sadece 1 kere iceriyor");
                      } else if (sonuc1>sonuc) {
                          System.out.println("cumle metni birden fazla iceriyor");
                      }else {
                          System.out.println("hatali");
                      }
        System.out.println("\n\t");

        String cumle1="Java cok guzeldir cok.";
        String metin1="cok";
        if (!cumle1.contains(metin1)){
            System.out.println("metni icermiyor");
        }else {
            int ilkIndex=cumle1.indexOf(metin1); //5
            int ikinciIndex=cumle1.indexOf(metin1,ilkIndex+1); // ya -1 olacak ya da bir index
            if (ikinciIndex==(-1)){
                System.out.println("metni 1 kere iceriyor");
            }else {
                System.out.println("metni birden fazla iceriyor");
            }

        }

    }

}
