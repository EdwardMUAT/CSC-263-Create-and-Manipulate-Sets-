import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element, will be ignored

        // Check the size of the HashSet
        System.out.println("Number of unique fruits: " + fruits.size());

        // Check if a specific element is in the HashSet
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        }

        // Remove an element from the HashSet
        fruits.remove("Orange");

        // Print all elements in the HashSet
        System.out.println("Fruits in the HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Convert a list of elements to a HashSet to remove duplicates
        String[] vegetables = {"Carrot", "Potato", "Tomato", "Carrot", "Potato"};
        Set<String> uniqueVegetables = new HashSet<>();
        for (String vegetable : vegetables) {
            uniqueVegetables.add(vegetable);
        }

        System.out.println("Unique vegetables:");
        for (String vegetable : uniqueVegetables) {
            System.out.println(vegetable);
        }
    }
}
