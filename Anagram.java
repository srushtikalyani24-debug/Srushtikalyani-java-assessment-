import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println(map.size());
        sc.close();
    }
}
