package ders29_stringBuilder_accessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        System.out.println(zaman.format(dtf1));//04/13/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d:MMM:YY");
        System.out.println(zaman.format(dtf2));//4:Nov:22

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d.MMMM.YYYY EEEE");
        System.out.println(zaman.format(dtf3));//4.November.2022 Friday

    }
}
