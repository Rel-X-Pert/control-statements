import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.print(year + " Is a leap year");
        } else {
            System.out.print(year + " Is a leap NOT year");
        }
        scanner.close();
    }
}
