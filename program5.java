import java.util.ArrayDeque;

public class program5 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.addFirst(5);
        deque.addLast(15);
        // deque.removeFirst();
        // deque.removeLast();
        System.out.println();
     
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
