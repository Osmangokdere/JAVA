package ders27_immitableClases_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman);
        System.out.println(zaman.getDayOfYear()); //115



    }
}
