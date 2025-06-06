package umg.edu.gt.structures.queue;

public class CustomQueue<T> {

    private static final int MAX_SIZE = 100;
    private Object[] elements;
    private int front;
    private int rear;
    private int size;

    public CustomQueue() {
        elements = new Object[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void enqueue(T value) {
        if (isFull()) {
            throw new IllegalStateException("La cola está llena");
        }
        rear = (rear + 1) % MAX_SIZE;
        elements[rear] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T value = (T) elements[front];
        elements[front] = null;
        front = (front + 1) % MAX_SIZE;
        size--;
        return value;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return (T) elements[front];
    }

    public int size() {
        return size;
    }
}
