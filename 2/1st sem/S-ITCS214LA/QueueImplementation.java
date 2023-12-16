import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation {
    static class IntegerComparator implements Comparator<Integer> {
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? 1 : -1;
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);

        System.out.println("Queue of integers:\n");
        while (!integerQueue.isEmpty())
            System.out.println(integerQueue.poll());
        System.out.println();

        integerQueue = new PriorityQueue<>(new IntegerComparator());
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);
        System.out.println("Queue of integers, but in descending order:\n");
        while (!integerQueue.isEmpty())
            System.out.println(integerQueue.poll());
    }
}