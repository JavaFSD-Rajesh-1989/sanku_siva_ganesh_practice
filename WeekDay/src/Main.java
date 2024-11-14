import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        for (Day day : Day.values()) {
            System.out.println(day + " - " + day.getDayType());
        }

        System.out.print("\nEnter a day to check if it's a weekend : ");
        String dayToCheckInput = sc.next().toUpperCase();
        Day dayToCheck = Day.valueOf(dayToCheckInput);
        System.out.println( dayToCheck.isWeekend());

        
        System.out.print("\nEnter the first day for comparison : ");
        String day1Input = sc.next().toUpperCase();
        Day day1 = Day.valueOf(day1Input);

        System.out.print("Enter the second day for comparison : ");
        String day2Input = sc.next().toUpperCase();
        Day day2 = Day.valueOf(day2Input);

        int comparisonResult = day1.compareDays(day2);
        if (comparisonResult == 0) {
            System.out.println("\n" + day1 + " and " + day2 + " are the same.");
        } else if (comparisonResult < 0) {
            System.out.println("\n" + day1 + " is earlier in the week than " + day2 + ".");
        } else {
            System.out.println("\n" + day1 + " is later in the week than " + day2 + ".");
        }

        
    }
}
