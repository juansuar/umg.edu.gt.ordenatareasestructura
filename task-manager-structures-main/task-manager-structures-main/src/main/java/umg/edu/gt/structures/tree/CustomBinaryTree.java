package umg.edu.gt.structures.tree;

public class CustomBinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    public void insert(T value) {
        root = insertRec(root, value);
    }

    private Node<T> insertRec(Node<T> root, T value) {
        if (root == null) {
            root = new Node<T>(value);
            return root;
        }
        if (value.compareTo(root.value) < 0) {
            root.left = insertRec(root.left, value);
        } else if (value.compareTo(root.value) > 0) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(Node<T> root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.value + " ");
            inOrderRec(root.right);
        }
    }

    private static class Node<T> {
        T value;
        Node<T> left, right;

        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
} 
