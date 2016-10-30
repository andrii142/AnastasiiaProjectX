package datastructures;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("kiev");
        queue.add("test");
        //queue.add("kiev");

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.element());



    }
}
