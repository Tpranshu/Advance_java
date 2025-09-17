import java.util.LinkedList;

public class program2 {
    public static void main(String[] args) {
        /*
         * 
         * A linked list in an array is a way to represent a linked list using arrays,
         * where each element stores data and the index of the next element, simulating
         * pointers.
         * 
         */

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println();
        System.out.println("Fruits List: " + fruits);

        fruits.addFirst("Strawberry");
        fruits.addLast("Pineapple");
        fruits.remove("Banana");

        System.out.println("Add Fruits List: " + fruits);
    }
}
