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

    public boolean isWorkDay(){
        return true;
    }
    public boolean isWeekEnd(){
        return true;
    }


    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(MONDAY.ordinal()); //порядковый номер
        System.out.println(Arrays.toString(WeekDays.values()));

        WeekDays day = WeekDays.FRIDAY;
        day = WeekDays.valueOf("WEDNESDAY");
        System.out.println(WeekDays.valueOf("WEDNESDAY").ordinal());
        System.out.println(WeekDays.values()[2]);
    }
}
