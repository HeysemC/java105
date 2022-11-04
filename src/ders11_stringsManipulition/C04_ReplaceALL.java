package ders11_stringsManipulition;

public class C04_ReplaceALL {
    public static void main(String[] args) {
        //Kullanicinin girdigi metinde
        //harf disinda kalan tum karakterleri temizleyen bir kod yazin
        //NOT : space silinmemeli
        String input="Ja5+va c.ok, 1*guzel";


        //Sayilari sildik
        input=input.replaceAll("\\d","");//Ja+va cok *guzel

        //Space yerine her hengi bir sayi getirdik(5)
        input=input.replace(" ","5");//Ja+va5cok5*guzel

        //Sayi disindaki karakterleri sildik
        input=input.replaceAll("\\W","");//Java5cok5guzel

        //_ sembolunun yerine "" (hiclik) yazdik
        input=input.replace("_","");

        //Sayi(5) yerine " " (Space) koyduk
        input=input.replaceAll("5"," ");//Java cok guzel

        //virgül,nokta gibi isaretleri sildik
        input=input.replaceAll("\\s+"," ");

        System.out.println(input);


    }
}
