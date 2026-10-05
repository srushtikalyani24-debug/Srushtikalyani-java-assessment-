import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-5, 5, -1, 2, -2, 3};

        HashSet<Integer> set = new HashSet<>();
        
        for (int n : arr) {
            set.add(Math.abs(n));
        }

        System.out.println(set.size());
    }
}
