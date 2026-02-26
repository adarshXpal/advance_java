package CollectionApi;

import java.util.Queue;
import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // try {
        // queue.element();
        // } catch (RuntimeException e) {
        // System.out.println("Hey the queue is Empty");
        // }
        queue.offer(12);
        queue.add(8); // if not added it would just throw an exception
        queue.offer(41);
        queue.offer(72);
        queue.offer(90);
        queue.offer(11);

        System.out.println(queue);
        // Iteration through Iterator
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println("Through Iterator: " + it.next());
        }

        queue.poll();
        queue.remove(); // if queue is empty it would throw an exception
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element()); // it would throw an exception if queue is empty
        System.out.println("Size of the queue is: " + queue.size());
        Boolean flag = queue.add(3);
        System.out.println("The value of flag is: " + flag);
    }
}
