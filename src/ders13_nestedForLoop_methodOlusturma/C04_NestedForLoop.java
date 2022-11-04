package ders13_nestedForLoop_methodOlusturma;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        Asagidaki sekli yazdiran bir kod hazirlayin
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

         */
//rows=satır, columns=sütun karşınıza çıkar diye:)
        for (int i = 1 ; i<=4 ; i++){//satir sayisi 4
            for (int j = 1 ; j <=6 ; j++){//sutun sayisi 6
                System.out.print("* ");
            }
            System.out.println("");//ic loop bitince alt satira gec
        }
    }
}
