package umg.edu.gt.structures.stack;

public class CustomStack<T> {
    private static final int MAX_SIZE = 100;
    private final Object[] elements;
    private int top;

    public CustomStack() {
        elements = new Object[MAX_SIZE];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void push(T value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[top];
    }

    // 🔥 Método renombrado a size()
    public int size() {
        return top + 1;
    }
    @SuppressWarnings("unchecked")
public T peekAt(int index) {
    if (index < 0 || index > top) {
        throw new IndexOutOfBoundsException("Índice fuera de rango");
    }
    return (T) elements[index];
}

}
