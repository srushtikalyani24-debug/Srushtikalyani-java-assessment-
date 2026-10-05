import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));

        
        list.removeFirst();
        list.removeLast();
        list.remove(0);

        System.out.println(list);
    }
}
