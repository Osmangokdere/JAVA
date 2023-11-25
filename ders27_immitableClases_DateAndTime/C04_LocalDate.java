package ders27_immitableClases_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih); //2023-04-25

        System.out.println(tarih.minusDays(100)); // 100 gün once
        System.out.println(tarih.minusWeeks(5).minusDays(3));
        System.out.println(tarih.plusMonths(5).plusWeeks(2).plusDays(8)); //ileri gider plus

        System.out.println(tarih.getMonthValue());// kacıncı ay
        System.out.println(tarih.getMonth()); // hangi aydayız
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfYear()); //yılın kacıncı gunu
        System.out.println(tarih.isLeapYear()); //false

        System.out.println(tarih.withYear(1985).withMonth(6).withDayOfMonth(27).getDayOfWeek()); // pazar günü dogmusum :))

        LocalDate date1=LocalDate.of(2011,11,11);
        LocalDate date2=LocalDate.of(2010,11,11);
        System.out.println(date2.isBefore(date1)); //true
        System.out.println(date2.isAfter(date1));// false


    }
}
