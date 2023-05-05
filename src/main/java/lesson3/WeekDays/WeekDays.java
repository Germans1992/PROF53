package lesson3.WeekDays;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;

public enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    // 1 уровень сложности: 1. Добавить в перечисление WeekDays функции boolean isWorkDay()
// и boolean isWeekEnd(), возвращающие, соответственно, является ли день рабочим или выходным
//
    public boolean isWorkDay() {
      return ordinal() < 5;
    }

    public boolean isWeekEnd() {
        return ordinal() == 5 || ordinal() == 6;
    }


    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(MONDAY.ordinal()); //порядковый номер
        System.out.println(Arrays.toString(WeekDays.values()));

        WeekDays day = WeekDays.FRIDAY;
        day = WeekDays.valueOf("WEDNESDAY");
        System.out.println(WeekDays.valueOf("WEDNESDAY").ordinal());
        System.out.println(WeekDays.values()[2]);

        System.out.println(day.isWorkDay());
        System.out.println(day.isWeekEnd());
    }
}
