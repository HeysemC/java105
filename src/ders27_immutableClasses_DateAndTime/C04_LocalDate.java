package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();

        System.out.println(tarih);//bulundugumuz gunun tarihini verir 2022-10-29

        System.out.println(tarih.minusDays(100));//2022-07-21
        System.out.println(tarih.minusWeeks(5).minusDays(3));

        System.out.println(tarih.plusMonths(5).plusWeeks(2)
                           .plusDays(3));

        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfYear());

        System.out.println(tarih.isLeapYear());


    }
}
