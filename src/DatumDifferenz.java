import java.util.Scanner;

public class DatumDifferenz
{
    int isLeapYear(int year) {
        if (year < 1500) return 0;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 1;
        return 0;
    }

    int GetMonthDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28 + isLeapYear(year);
            default:
                return -1;
        }
    }

    int LeapYearsUntil(int year, int month, int day) {
        int leapYears = 0;
        for (int y = 0; y <= year; y++) {
            leapYears += isLeapYear(y);
        }

        if (isLeapYear(year) == 1 && month <= 2 && day < 29) {
            leapYears--;
        }
        return leapYears;
    }

    int DaysInYears(int years, int month, int day) {
        return years * 365 + LeapYearsUntil(years, month, day);
    }

    int DaysInMonths(int years, int months, int day) {
        int days = 0;
        for (int m = 1; m <= months; m++) {
            days += GetMonthDays(years, m);
        }
        return days;
    }

    int DateInDaysSinceZero(int year, int month, int day) {
        int days = 0;
        days += DaysInYears(year, month, day);
        days += DaysInMonths(year, month, day);
        days += day;
        return days;
    }

    public DatumDifferenz()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie das Jahr ein:");
        int year1 = s.nextInt();

        System.out.println("Geben Sie den Monat ein:");
        int month1 = s.nextInt();
        if (month1 < 1 || month1 > 12) {
            System.out.println("Untültiger Monat");
            return;
        }

        int month1Days = GetMonthDays(year1, month1);

        System.out.println("Geben Sie den Tag ein (1-" + month1Days + ")");
        int day1 = s.nextInt();
        if (day1 < 1 || day1 > month1Days) {
            System.out.println("Untültiger Tag");
            return;
        }

        System.out.println("Gültiges start Datum.");
        System.out.println();

        System.out.println("Geben Sie das Jahr ein:");
        int year2 = s.nextInt();

        System.out.println("Geben Sie den Monat ein:");
        int month2 = s.nextInt();
        if (month2 < 1 || month2 > 12) {
            System.out.println("Untültiger Monat");
            return;
        }

        int month2Days = GetMonthDays(year2, month2);

        System.out.println("Geben Sie den Tag ein (1-" + month2Days + ")");
        int day2 = s.nextInt();
        if (day2 < 1 || day2 > month2Days) {
            System.out.println("Untültiger Tag");
            return;
        }
        System.out.println("Gültiges end Datum.");

        int days1 = DateInDaysSinceZero(year1, month1, day1);
        int days2 = DateInDaysSinceZero(year2, month2, day2);
        int daysDif = days2 - days1;

        int yearsDif = (int)(daysDif / 365.2421875);
        daysDif -= yearsDif * 365.2421875;

        int monthsDif = (int)(daysDif / 30.4375);
        daysDif -= monthsDif * 30.4375;

        System.out.println(yearsDif + " " + monthsDif + " " + daysDif);
    }

    public static void main(String[] args) {
        new DatumDifferenz();
    }
}
