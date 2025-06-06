package umg.edu.gt.structures.service;

import umg.edu.gt.structures.stack.CustomStack;

public class StackService<T> {

    private final CustomStack<T> stack;

    public StackService() {
        this.stack = new CustomStack<T>();
    }

    public void push(T value) {
        stack.push(value);
    }

    public T pop() {
        return stack.pop();
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int size() {
        return stack.size(); // ✅ corrección aquí
    }
}
