import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> prices = new Hashtable<>();

        // Add key-value pairs
        prices.put("banana", 100);
        prices.put("apple", 200);
        prices.put("guava", 60);

        // Retrieve and print value for "banana"
        System.out.println("Price of banana: " + prices.get("banana"));

        // Remove "apple"
        prices.remove("apple");

        // Clear all entries
        prices.clear();
    }
}
 