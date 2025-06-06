package umg.edu.gt.structures.queue;

public class CustomPriorityQueue<T extends Comparable<T>> {

    private static final int MAX_SIZE = 100;
    private Object[] elements;
    private int size;

    public CustomPriorityQueue() {
        elements = new Object[MAX_SIZE];
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

        int i;
        for (i = size - 1; i >= 0; i--) {
            T current = (T) elements[i];
            if (current.compareTo(value) > 0) {
                elements[i + 1] = elements[i]; // mover hacia adelante
            } else {
                break;
            }
        }
        elements[i + 1] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T result = (T) elements[0];
        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
        return result;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return (T) elements[0];
    }

    public int size() {
        return size;
    }
}
