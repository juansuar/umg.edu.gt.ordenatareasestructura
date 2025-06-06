package umg.edu.gt.structures.list;

public class UserTaskList {
    private TaskNode head;
    private int size;

    public UserTaskList() {
        this.head = null;
        this.size = 0;
    }

    public void addTask(Long id, String description) {
        TaskNode newTask = new TaskNode(id, description);
        if (head == null) {
            head = newTask;
        } else {
            TaskNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newTask);
        }
        size++;
    }

    public boolean completeTask(Long id) {
        TaskNode current = head;
        while (current != null) {
            if (current.getId().equals(id)) {
                current.setCompleted(true);
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public TaskNode getHead() {
        return head;
    }
}
