package umg.edu.gt.structures.service;

import umg.edu.gt.structures.queue.CustomPriorityQueue;

public class PriorityQueueService<T extends Comparable<T>> {

    private final CustomPriorityQueue<T> priorityQueue;

    public PriorityQueueService() {
        this.priorityQueue = new CustomPriorityQueue<>();
    }

    public void enqueue(T value) {
        priorityQueue.enqueue(value);
    }

    public T dequeue() {
        return priorityQueue.dequeue();
    }

    public T peek() {
        return priorityQueue.peek();
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    public boolean isFull() {
        return priorityQueue.isFull();
    }

    public int size() {
        return priorityQueue.size();
    }
}
