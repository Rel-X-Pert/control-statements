import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println("The entered number is EVEN");
        } else {
            System.out.println("The entered number is ODD");
        }

        scanner.close();
    }
}
