package ders04_matematikselIslemeler_incrementDecrement;

public class C07_Pre_Post_Increment {

    public static void main(String[] args) {

        int a = 10 ;

        int b = a++ ; // once islem sonra artirma ( " = " islem )

        int c = ++b ; // once artir sonra islem

        System.out.println("a :" + a + ",b : " +b +",c :" + c);



        a = 20 ; // 20


        b = ++a ; // once artir sonra islem yap b = 21


        c = a++ ; // once islem sonra artirma c = 21

        System.out.println("a :" + a + ", b : " +b +", c :" + c);




        a = 30 ;

        System.out.println(a++); // once islem sonra artir konsolda 30 javada 31

        System.out.println(--a); // once eksilt sonra islem (konsolda 30 javada 30)

        System.out.println(a--); // once islem sonra eksilt (kolsolda 30 javada 29)

        System.out.println(a);  // islem (konsolda 29 javada 29)





    }
}
