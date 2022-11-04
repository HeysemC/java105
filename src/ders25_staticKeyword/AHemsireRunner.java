package ders25_staticKeyword;

public class AHemsireRunner {
    public static void main(String[] args) {
        AHemsire h1=new AHemsire();
        h1.personelIsmi="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="12312312";
        System.out.println(h1);

        AHemsire h2=new AHemsire();
        System.out.println(h2);
        h2.personelIsmi="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="3214344223";
        h2.basHekimIsmi="Yasar Kemal";

        System.out.println("h1 : "+h1);
        System.out.println("h2 : "+h2);

        AHemsire h3=new AHemsire();
        System.out.println("h3 : "+h3);
        h3.hastaneIsmi="Java Hastanesi";

        System.out.println(h2.hastaneIsmi);

        /*
        h2.bashekimIsmi = "Yasar Kemal";
        // static bir variable 'a atama yaptigimiz andan itibaren butun objelerin
        // ilgili degeri degisir  (bashekimIsmi    Yasar Kemal'dir)
         */
    }
}
