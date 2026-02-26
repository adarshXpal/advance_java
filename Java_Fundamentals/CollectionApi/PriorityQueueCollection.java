package CollectionApi;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) throws RuntimeException {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //MIN Heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Max Heap
        pq.offer(23);
        pq.offer(45);
        pq.offer(87);
        pq.offer(930);
        pq.add(12);
        System.out.println(pq);
        pq.poll();

        //same methods provide as provided for the queue 

    }
}
