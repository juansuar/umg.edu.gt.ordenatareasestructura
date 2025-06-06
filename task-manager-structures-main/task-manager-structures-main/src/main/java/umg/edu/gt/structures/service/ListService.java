package umg.edu.gt.structures.service;

import umg.edu.gt.structures.list.CustomLinkedList;

public class ListService<T> {
    private final CustomLinkedList<T> list;

    public ListService() {
        this.list = new CustomLinkedList<T>();
    }

    public void add(T value) {
        list.add(value);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printList() {
        list.printList(); // Este método debe existir en CustomLinkedList
    }
}
