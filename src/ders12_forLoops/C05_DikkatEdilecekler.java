package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {
        /*
        sonsuz loop
        for(int i=0; i>-10;i++)[
        System.out.print(i);
        }
         */
        /*
        ilk deger icin bitis sarti true olmuyorsa
        for body'si hic devreye giremez
         */
        for (int i=0; i>10; i++){
            System.out.println(i);
        }
        /*
        bir loop'u sonunu beklemeden bitirmek  istersek

        ==>kullanicinin verdigi bir sayiyinin asal olup olmadigini bulun

         */
        int sayi=100;
      //  int bayrak=0;

        boolean bayrak=false;


        for (int i=2 ; i<=sayi-1  ; i++){

            if (sayi%i==0){
                //askimiz bitti(her hangi bir boleni varsa biter for bady'si)
                bayrak=true;//bu sart
               // bayrak++;
               break;//sart degil

            }
        }
        System.out.println(bayrak);
        if (bayrak){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }

    }
}
