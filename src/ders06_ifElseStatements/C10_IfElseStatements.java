package ders06_ifElseStatements;

public class C10_IfElseStatements {
    public static void main(String[] args) {

        //soru 1- kullanicidan cinsiyetini ve yasini alin,
        //kadin, 60 yas ve uzeri



        char cinsiyet = 'E';
        int yas = 60;
        if (cinsiyet=='E' && yas>=65){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='E'&& yas<65) {
            System.out.println("emekli olmak için" + (65-yas) + "sene calismalisin");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        }

    }
}
