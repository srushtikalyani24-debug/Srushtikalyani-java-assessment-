import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = sumOfDigits(number);
        System.out.println("Sum of digits: " + result);

        scanner.close();
    }
}
