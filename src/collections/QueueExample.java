package collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
//        queue.offer("Marcin");
//        queue.offer("Mateusz");
//        queue.offer("Łukasz");
//
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
////        System.out.println(queue.peek());
//        System.out.println(queue.element());
//
//        System.out.println(queue);

//        Deque<String> deque = new LinkedList<>();
//        deque.offer("Marcin");
//        deque.offer("Mateusz");
//        System.out.println(deque);
//
//        deque.offerFirst("Basia");
//        deque.offerLast("Maciek");
//
//        System.out.println(deque);
//
//        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());
//
//        System.out.println(deque);

//        Stack<String> strings = new Stack<>();
//        strings.push("1");
//        strings.push("2");
//        strings.push("3");
//        System.out.println(strings);
//        System.out.println(strings.pop());
//        System.out.println(strings.pop());
//        System.out.println(strings.pop());

        PriorityQueue<Animal> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Animal("Burek", 5));
        priorityQueue.offer(new Animal("Pimpek", 7));
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());


    }
}
