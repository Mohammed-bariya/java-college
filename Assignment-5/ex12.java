import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year (e.g., 2023): ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);

        
        System.out.println("\nCalendar for " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault()) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

       
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

  
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

       
        for (int day = 1; day <= maxDayOfMonth; day++) {
            System.out.printf("%3d ", day);

           
            calendar.add(Calendar.DAY_OF_MONTH, 1);

           
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println();
            }
        }

        System.out.println(); 
        scanner.close();
    }
}
