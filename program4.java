public class program4 {
    public static void main(String[] args) {
        /*
         * 
         * A queue in Java is a data structure that follows the First In First Out
         * (FIFO) principle, meaning the first item added is the first one to be
         * removed. Think of it like a line of people; the person who arrives first is
         * served first.
         * 
         */

        java.util.Queue<String> queue = new java.util.LinkedList<>();

        queue.add("Person 1");
        queue.add("Person 2");
        queue.add("Person 3");
        System.out.println();
        System.out.println("Queue: " + queue);

        String servedPerson = queue.poll();
        System.out.println("Served: " + servedPerson);
        System.out.println("Queue after poll: " + queue);

        String nextPerson = queue.peek();
        System.out.println("Next Person: " + nextPerson);
        System.out.println("Queue after peek: " + queue);
    }
}
