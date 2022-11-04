package ders17_scope;

public class C02_ClassLevelVariables {

    //Scope variable'ler nereye ulasabilir nerede bulunabilirler
    //static bir grubtur static'lere gidebilir ?(class level variable'ler atama yapmadan da kullanilabilir

    //Class variable'lar method'larin disinda olusturulur
    // (boyle bir kural yok ama genel kullanim en ustte olusturulmalidir.)
    static String hastaneIsmi="Yildiz hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi="Isim girilmedi";
    String personelIsmi="Isim girilmedi";
    String personelTelefonu="Telefon girilmedi";
    int personelYasi;

    public static void main(String[] args) {
        System.out.println(hastaneIsmi);//Yildiz hastanesi
        System.out.println(basHekimIsmi);//null (bu deger hos karsilanmaz,bunu icin deger atamasinda fayda vardir)
        //System.out.println(personelIsmi);static olmadigi icin static main method'da kullanilamaz
        /*
        Class level variable'lara deger atamasi yapilmamis olursa
        Java bu variable'lara data turune gore
        default olarak tanimlanan degerleri atar
        default degerler:
        sayisal variable'lar: 0
        boolean: false
        char: ''
        objeler (String dahil): null
         */

    }

    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        //System.out.println(personelIsmi);

    }
//static variable'ler her yere gidebilir ve class level variabler ?
    public void method2(){
        System.out.println(hastaneIsmi);//Yildiz hastanesi
        hastaSayisi++;
        System.out.println(personelIsmi);//Isim girilmedi
        System.out.println(personelYasi);//0 cunku deger girilmedigi icin 0'dir

    }

}
