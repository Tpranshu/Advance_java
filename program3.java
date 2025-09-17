public class program3 {
    public static void main(String[] args) {
        /*
         * 
         * A stack in Java is a data structure that follows the Last In First Out
         * (LIFO) principle, meaning the last item added is the first one to be
         * removed. Think of it like a stack of plates; you add and remove plates from
         * the top.
         * 
         */

        java.util.Stack<String> stack = new java.util.Stack<>();

        stack.push("Plate 1");
        stack.push("Plate 2");
        stack.push("Plate 3");
        System.out.println();
        System.out.println("Stack: " + stack);

        String topPlate = stack.pop();
        System.out.println("Removed: " + topPlate);
        System.out.println("Stack after pop: " + stack);

        String peekPlate = stack.peek();
        System.out.println("Top Plate: " + peekPlate);
        System.out.println("Stack after peek: " + stack);
    }
}
