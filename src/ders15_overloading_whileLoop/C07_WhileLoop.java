package ders15_overloading_whileLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
           /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
         */
        int sayi=5;
        int us=3;//sayi 0 veya 0'dan kucukse hata verdirin prof kod olur
        usHesapla(sayi,us);

    }

    public static void usHesapla(int sayi,int us){

        int sonuc=1;//uslu islemler carpma ile alakali oldugu icin 1 aldik

        while (us>0){
            sonuc *=sayi;
            us--;
        }
        System.out.println(sonuc);
    }
}
