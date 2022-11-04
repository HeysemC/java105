package ders04_matematikselIslemeler_incrementDecrement;

public class C08_Pre_Post_Increment {
    public static void main(String[] args) {

        int x = 3 ; // 3

        int y = 2 * ++x ; // once artir sonra islem yap ( java x=4 , y=8)

        int z = 5+ y-- ;  // once islem sonra eksilt ( javada z=13 , y=7 )

        System.out.println(x+y+z);


    }
}
