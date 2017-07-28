package com.heitian.ssm.foundation.chapter11_Vector.demo11;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

    public static void printQueue(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i + 10));
            priorityQueue.offer(random.nextInt(i + 10));
        }
        printQueue(queue);
        printQueue(priorityQueue);
    }
}
