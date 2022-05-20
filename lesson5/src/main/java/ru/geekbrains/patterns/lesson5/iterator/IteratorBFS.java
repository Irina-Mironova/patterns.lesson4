package ru.geekbrains.patterns.lesson5.iterator;

import ru.geekbrains.patterns.lesson5.tree.Node;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IteratorBFS implements Iterator<Node> {
    Node node;
    Queue<Node> queue;


    public IteratorBFS(Node root) {
        this.node = root;
        queue = new LinkedList<>();
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Node next() {
        Node node = queue.remove();

        if (node.getLeft() != null) {
            queue.add(node.getLeft());
        }

        if (node.getRight() != null) {
            queue.add(node.getRight());
        }

        return node;
    }
}
