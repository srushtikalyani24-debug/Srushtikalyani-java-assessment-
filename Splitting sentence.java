import java.util.Scanner;

public class SentenceRebuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        
        StringBuilder rebuilt = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            rebuilt.append(words[i].toUpperCase());
            if (i < words.length - 1) {
                rebuilt.append("-");
            }
        }

        System.out.println("Rebuilt Sentence: " + rebuilt.toString());

        scanner.close();
    }
}
