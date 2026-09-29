import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToDoListDemo {

    public static void main(String[] args) {
        // Create a new ArrayList to hold task strings
        List<String> todoList = new ArrayList<>();

        // --- 1. ADDING TASKS ---
        todoList.add("Buy groceries");
        todoList.add("Complete Java assignment");
        todoList.add("Call the doctor");
        todoList.add("Pay electricity bill");

        System.out.println("Initial To-Do List: " + todoList);

        // --- 2. REMOVING TASKS ---
        // Option A: Remove by index (e.g., index 0 = "Buy groceries")
        todoList.remove(0);

        // Option B: Remove by object value
        todoList.remove("Call the doctor");

        System.out.println("List after removals: " + todoList);
        System.out.println();

        // --- 3. ITERATING OVER THE LIST ---

        // Method 1: Enhanced for-each loop (Most common & readable)
        System.out.println("--- Method 1: Enhanced For-Each Loop ---");
        int taskNum = 1;
        for (String task : todoList) {
            System.out.println(taskNum++ + ". " + task);
        }

        // Method 2: Using Iterator (Safest for removing items during iteration)
        System.out.println("\n--- Method 2: Iterator ---");
        Iterator<String> iterator = todoList.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }

        // Method 3: Lambda with forEach (Java 8+)
        System.out.println("\n--- Method 3: forEach with Lambda ---");
        todoList.forEach(task -> System.out.println("Task: " + task));
    }
}
