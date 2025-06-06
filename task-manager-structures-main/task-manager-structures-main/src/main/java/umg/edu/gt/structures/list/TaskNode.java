package umg.edu.gt.structures.list;

public class TaskNode {
    private Long id;
    private String description;
    private boolean completed;
    private TaskNode next;

    public TaskNode(Long id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
        this.next = null;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public TaskNode getNext() {
        return next;
    }

    public void setNext(TaskNode next) {
        this.next = next;
    }
}
