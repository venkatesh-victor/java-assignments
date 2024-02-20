import java.util.Scanner;

public class WeekdayName {
    enum Weekday {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weekday number: ");
        int dayNumber = scanner.nextInt();
        Weekday weekday = getWeekday(dayNumber);
        System.out.println("The weekday is: " + weekday);
        scanner.close();
    }

    public static Weekday getWeekday(int dayNumber) {
        switch (dayNumber) {
            case 0:
                return Weekday.SUNDAY;
            case 1:
                return Weekday.MONDAY;
            case 2:
                return Weekday.TUESDAY;
            case 3:
                return Weekday.WEDNESDAY;
            case 4:
                return Weekday.THURSDAY;
            case 5:
                return Weekday.FRIDAY;
            case 6:
                return Weekday.SATURDAY;
            default:
                return null;
        }
    }
}

