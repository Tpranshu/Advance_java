import java.util.HashMap;

public class program7 {
    public static void main(String[] args) {
        /*
         * 
         * Hashing in Java is a way to quickly find or store data using a special
         * function called a **hash function**. This function turns a value (like a name
         * or number) into a small number called a **hash code**. That code helps Java
         * decide where to keep the data in memory. Hashing is used in things like
         * **HashMap** and **HashSet** to make searching, adding, or removing data much
         * faster. If two values get the same hash code, Java has ways to handle that,
         * so the data doesn't get mixed up.
         * 
         */

        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Pranshu", 55);
        ages.put("Tiwari", 30);
        ages.put("Aman", 22);
        System.out.println();
        System.out.println("Pranshu's age: " + ages.get("Pranshu"));

        if (ages.containsKey("Aman")) {
            System.out.println("Aman is in the map.");
        }

        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old.");
        }
        /*
         * ages.keySet() --> This method returns a set of all the keys (names in this case)
         * ages.get(name) --> This method retrieves the value (age) associated with the given key (name)
         * 
         * ages.keySet() --> ye function keys ko return krta hai. (is case me names)
         * ages.get(name) --> ye function value ko return krta hai jo key se judi hai. (name se judi age)
         */
    }
}
