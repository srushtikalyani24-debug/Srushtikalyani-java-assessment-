import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        System.out.print("Reversed Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
