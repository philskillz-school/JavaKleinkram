import java.util.Scanner;

public class Datum
{
    int isLeapYear(int year) {
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

    public Datum()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie das Jahr ein:");

        ;
        System.out.println("Geben Sie den Monat ein:");
        int month = s.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Untültiger Monat");
            return;
        }
        int monthDays = GetMonthDays(year, month);
        System.out.println("Geben Sie den Tag ein (1-" + monthDays + ")");
        int day = s.nextInt();
        if (day < 1 || day > monthDays) {
            System.out.println("Untültiger Tag");
            return;
        }
        System.out.println("Gültiges Datum.");
    }

    public static void main(String[] args) {
        new Datum();
    }
}
