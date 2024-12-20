package task5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Solution4 {
        public static void main(String[] args) {
            // Create a Scanner for user input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for their birth year, month, and day
            System.out.print("Enter your birth year (e.g., 1999): ");
            int year = scanner.nextInt();

            System.out.print("Enter your birth month (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter your birth day (1-31): ");
            int day = scanner.nextInt();
            LocalDate currentDate = LocalDate.now();

            // Calculate the year,month and days of birth
            LocalDate dateYear = currentDate.minusYears(year);
            LocalDate dateMonth = currentDate.minusMonths(month);
            LocalDate dateDay = currentDate.minusDays(day);

            //print the age by using DateTime Formatter.
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy");
            DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("MM");
            DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd");

            System.out.println("Your age is: " + dateYear.format(formatter1)+"Years"+","+ dateMonth.format(formatter2)+"Month"+",and"+" "+
                     dateDay.format(formatter3)+"Days");

        }
    }




