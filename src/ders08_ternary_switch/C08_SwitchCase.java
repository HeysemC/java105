package ders08_ternary_switch;

public class C08_SwitchCase {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.
        int ayNo=12;

        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilk bahar");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("son bahar");
                break;
            default:
                System.out.println("Gecersiz ay no");
        }
    }
}
