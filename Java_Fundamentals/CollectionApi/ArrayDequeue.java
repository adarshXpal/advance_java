package CollectionApi;

import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(1);
        adq.offerLast(31);
        adq.offer(55);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() "+adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() "+adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() "+adq);
    }
}
