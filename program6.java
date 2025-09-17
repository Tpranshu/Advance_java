public class program6 {
    public static void main(String[] args) {
        /*
         * 
         * A priority queue in Java is a data structure that stores elements based on
         * their priority rather than their insertion order. Elements with higher
         * priority are served before those with lower priority. If two elements have
         * the same priority, they are served according to their order in the queue.
         * 
         */

        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println();
        System.out.println("Priority Queue: " + priorityQueue);

        int highestPriority = priorityQueue.poll();
        System.out.println("Removed (highest priority): " + highestPriority);
        System.out.println("Priority Queue after poll: " + priorityQueue);

        int nextHighest = priorityQueue.peek();
        System.out.println("Next Highest Priority: " + nextHighest);
        System.out.println("Priority Queue after peek: " + priorityQueue);
    }
}
