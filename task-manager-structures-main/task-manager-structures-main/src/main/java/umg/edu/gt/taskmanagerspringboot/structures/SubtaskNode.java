package umg.edu.gt.taskmanagerspringboot.structures;

import java.util.ArrayList;
import java.util.List;

public class SubtaskNode {

    private Long id;
    private String name;
    private SubtaskNode parent;
    private List<SubtaskNode> children;

    public SubtaskNode(Long id, String name) {
        this.id = id;
        this.name = name;
        this.children = new ArrayList<SubtaskNode>();
    }

    public void addChild(SubtaskNode child) {
        child.setParent(this);
        children.add(child);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SubtaskNode getParent() {
        return parent;
    }

    public void setParent(SubtaskNode parent) {
        this.parent = parent;
    }

    public List<SubtaskNode> getChildren() {
        return children;
    }
}
