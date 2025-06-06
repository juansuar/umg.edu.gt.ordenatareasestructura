package umg.edu.gt.structures;

import umg.edu.gt.structures.stack.CustomStack;
import umg.edu.gt.structures.queue.CustomQueue;
import umg.edu.gt.structures.list.CustomLinkedList;
import umg.edu.gt.structures.tree.CustomBinaryTree;

public class MainTestStructures {
    public static void main(String[] args) {

        // 🔹 Probar la pila (stack)
        System.out.println("🔹 PILA (STACK)");
       CustomStack<String> stack = new CustomStack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Elemento arriba de la pila: " + stack.peek());
        System.out.println("Elemento sacado de la pila: " + stack.pop());
        System.out.println("Elemento arriba ahora: " + stack.peek());
        System.out.println();

        // 🔹 Probar la cola (queue)
        System.out.println("🔹 COLA (QUEUE)");
        CustomQueue<String> queue = new CustomQueue<String>();

        queue.enqueue("Uno");
        queue.enqueue("Dos");
        queue.enqueue("Tres");
        System.out.println("Elemento al frente: " + queue.peek());
        System.out.println("Elemento desencolado: " + queue.dequeue());
        System.out.println("Elemento al frente ahora: " + queue.peek());
        System.out.println();

        // 🔹 Probar la lista enlazada
        System.out.println("🔹 LISTA ENLAZADA");
        CustomLinkedList<String> list = new CustomLinkedList<String>();
        list.add("Carlos");
        list.add("María");
        list.add("Luis");
        System.out.println("Elementos agregados a la lista. (Verifica con debug o método toString)");
        System.out.println();

        // 🔹 Probar el árbol binario
        System.out.println("🔹 ÁRBOL BINARIO");
        CustomBinaryTree<Integer> tree = new CustomBinaryTree<Integer>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        System.out.println("Recorrido en orden del árbol:");
        tree.inOrderTraversal();  // Debes implementar este método en tu árbol
        System.out.println();
    }
}
