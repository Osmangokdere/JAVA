package ders27_immitableClases_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1985,06,27);
        Period gecenSure=Period.between(dogumGunu,bugun);
        System.out.println(gecenSure); //P37Y9M18D
        System.out.println(gecenSure.getYears());//37


    }
}
