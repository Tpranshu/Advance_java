import java.util.HashSet;

public class program8 {
    public static void main(String[] args) {
        /*
         * HashSet in Java is a collection that is used to store unique values — it does
         * not allow duplicates.
         * 
         * It is based on hashing, which means it stores elements using their hash code
         * for faster access. You can use it when you want to check if something exists
         * or not, without caring about the order of elements.
         * 
         * 
         * Stores only unique elements (no duplicates allowed)
         * No specific order of elements
         * Uses hashing for fast performance
         * 
         */

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate, won't be added
        System.out.println();
        System.out.println(fruits);
        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }
    }
}
