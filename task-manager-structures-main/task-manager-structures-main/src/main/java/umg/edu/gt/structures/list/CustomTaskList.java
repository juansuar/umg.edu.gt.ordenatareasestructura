package umg.edu.gt.structures.list;

import java.util.ArrayList;
import java.util.List;

public class CustomTaskList<T> {

    private final List<T> internalList;

    public CustomTaskList() {
        this.internalList = new ArrayList<T>();
    }

    public void add(T element) {
        internalList.add(element);
    }

    public T get(int index) {
        if (index >= 0 && index < internalList.size()) {
            return internalList.get(index);
        }
        return null;
    }

    public void remove(int index) {
        if (index >= 0 && index < internalList.size()) {
            internalList.remove(index);
        }
    }

    public List<T> getAll() {
        return new ArrayList<T>(internalList);
    }

    public int size() {
        return internalList.size();
    }

    public boolean isEmpty() {
        return internalList.isEmpty();
    }

    public void clear() {
        internalList.clear();
    }
}
