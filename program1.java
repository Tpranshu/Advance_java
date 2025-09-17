import java.util.ArrayList;

public class program1 {
    public static void main(String[] args) {

/*  
        An ArrayList in Java is like a resizable array.
        Imagine a list that can grow or shrink as needed.
        You can add, remove, or access items easily.
        It stores elements in order, just like a regular array.
        But unlike arrays, you don’t need to know the size ahead of time.
        
*/

/*

**********************************TABLE******************************************
| Feature          | Array                                              | ArrayList                                           |
| ---------------- | -------------------------------------------------- | --------------------------------------------------- |
| **Size**         | Fixed size (cannot change)                         | Dynamic size (can grow/shrink)                      |
| **Syntax**       | `int[] arr = new int[5];`                          | `ArrayList<Integer> list = new ArrayList<>();`      |
| **Type support** | Can store **primitive types** (like `int`, `char`) | Stores **objects only** (e.g., `Integer`, `String`) |
| **Performance**  | Faster (more efficient)                            | Slightly slower (extra features)                    |
| **Flexibility**  | Less flexible                                      | More flexible (more methods)                        |
| **Methods**      | No built-in methods for add/remove                 | Has built-in methods like `add()`, `remove()`       |
| **Part of**      | Core Java                                          | Part of **Collection Framework**                    |

*/


        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println();
        System.out.println("Colors List: " + colors);

        colors.set(1, "Purple");
        colors.remove("Blue");
        colors.add("Orange");

        System.out.println("Updated Colors List: " + colors);
    }
}

