package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {

    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        System.out.println("doc1입력");
        printQueue.offer("doc1");

        System.out.println("doc2입력");
        printQueue.offer("doc2");

        System.out.println("doc3입력");
        printQueue.offer("doc3");

        System.out.println("출력: "+printQueue.poll());
        System.out.println("출력: "+printQueue.poll());
        System.out.println("출력: "+printQueue.poll());

    }
}
