package umg.edu.gt.structures.service;

import umg.edu.gt.structures.tree.CustomBinaryTree;

public class TreeService<T extends Comparable<T>> {

    private final CustomBinaryTree<T> tree;

    public TreeService() {
        this.tree = new CustomBinaryTree<T>();
    }

    public void insert(T value) {
        tree.insert(value);
    }

    public void inOrderTraversal() {
        tree.inOrderTraversal();
    }
}
