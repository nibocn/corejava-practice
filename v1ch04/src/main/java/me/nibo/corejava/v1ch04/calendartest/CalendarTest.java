package me.nibo.corejava.v1ch04.calendartest;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * CalendarTest
 * @author NiBo
 */
@SuppressWarnings({ "PMD.UseUtilityClass" })
public class CalendarTest {

    @SuppressWarnings({ "PMD.SystemPrintln", "PMD.UnusedFormalParameter" })
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();

        // set to start of month
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.printf("----------- %s ---------\n", date.getMonth().name());
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print(" ");
        }

        int month = date.getMonthValue();
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
