import java.util.Scanner;
class Largest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = scanner.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.print("1st number is the largest: " + a);
        }
        else if (b > a && b > c) {
            System.out.print("2nd number is the largest: " + b);
        } else {
            System.out.print("3rd number is the largest: " + c);
        }

        scanner.close();
    }
}
