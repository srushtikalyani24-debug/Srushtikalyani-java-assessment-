import java.util.Scanner;

public class StringMethodsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String upperText = text.toUpperCase();
        int length = text.length();
        String substring = text.substring(0, Math.min(length, 5));

        System.out.println("Uppercase: " + upperText);
        System.out.println("Length: " + length);
        System.out.println("Substring: " + substring);

        scanner.close();
    }
}
