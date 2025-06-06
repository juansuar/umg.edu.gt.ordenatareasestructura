package umg.edu.gt.structures.service;

import umg.edu.gt.structures.queue.CustomQueue;

public class QueueService<T> {
    private final CustomQueue<T> queue;

    public QueueService() {
        this.queue = new CustomQueue<T>();
    }

    public void enqueue(T value) {
        queue.enqueue(value);
    }

    public T dequeue() {
        return queue.dequeue();
    }

    public T peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.isFull();
    }
    public int size() {
    return queue.size();
}

}
