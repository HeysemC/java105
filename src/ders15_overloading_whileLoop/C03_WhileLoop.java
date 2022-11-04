package ders15_overloading_whileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {
        /*
        For loop kullanirken
        -baslangic degeri
        -bitis sarti(condition)
        -artis/azalis yontemi
        bunlara ihtiyac cvardi while lopptada benzerlerine ihtiyac var
        for loop bu sartlari otomatik olustururken while loop'a manuel girmemiz gerekcek
         */

        //2 basamakli sayilari aralarinda bir space olacak sekilde yazdirim

        for (int i = 10; i <=99 ; i++) {
            System.out.print(i+" ");

        }

        //while loop ile yaparsak

        System.out.println("");
        int a=10;

        while (a<100){
            System.out.println(a + " ");
            a++; //mutlaka artis azalis miktarini yazmalıyız yoksa sonsuz loop olur
        }









    }

}
