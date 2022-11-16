package ders36_checedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {



        FileInputStream fis=new FileInputStream("src/ders36_checedExceptions/Deneme.txt");

        FileOutputStream fos=new FileOutputStream("src/ders36_checedExceptions/Deneme.txt");

        //Java ile pc'deki bir dosyaya ulaşmak istersek
        //FileInputStream class'indan obje olusturup
        //o obje araciligi ile dosyayikullanabiliriz

        //fis olustururken ulasmak istedigimiz dosyanin
        //dosya yolunu parametre olarak girmeliyiz

        /*
        Checked exception olusturma ihtimali olan kodlari yazdıgımızda
        java compile time orada bir hata oldugunu gorur
        ve kodun altini kirmizi olarak cizer

        bu durumda kirmizi cizgiyi kaldirmak icin 2 yontem vardir
        1-exception'i try catch blogu ile handle etmek
        2-Java'ya sorun ihtimalinin farkinda olgumuzu ama kodumuza guvendigimizi
          ve calismaya etmesini istedigimizi spylemek
          bunun

         */
    }
}
