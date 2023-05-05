package lesson3.date;

public class MyDate {
    private int year, month, day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public void add(int days) {
        int daysLeft = days;
        int currentDay = day;
        int currentMonth = month;
        int currentYear = year;
        while (daysLeft > 0) {
            int daysLeftCurrentMonth = daysInMonth(month, year) - currentDay;
            if (daysLeftCurrentMonth >= daysLeft) {
                currentDay += daysLeft;
                daysLeft = 0;
            } else {
                daysLeft -= (daysLeftCurrentMonth + 1);
                currentDay = 1;
                if (currentMonth == 12) {
                    currentMonth = 1;
                    currentYear++;
                } else {
                    currentMonth++;
                }
            }
        }
        year = currentYear;
        month = currentMonth;
        day = currentDay;
    }

    private int daysInMonth(int month, int year) {

        switch (month) {
            case 2: {
                if (isLeapYear(year))
                    return 29;
                else return 28;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                return 30;
        }
    }

        private boolean isLeapYear ( int year){
            if (year % 400 == 0)
                return true;
            if (year % 100 == 0)
                return false;
            return year % 4 == 0;
        }
    }

