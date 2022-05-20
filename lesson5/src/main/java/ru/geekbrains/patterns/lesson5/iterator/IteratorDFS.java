package ru.geekbrains.patterns.lesson5.iterator;

import ru.geekbrains.patterns.lesson5.tree.Node;

import java.util.Iterator;
import java.util.Stack;

public class IteratorDFS implements Iterator<Node> {
    Node node;
    Stack<Node> stack;

    public IteratorDFS(Node root) {
        this.node = root;
        stack = new Stack<>();
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.empty();
    }

    @Override
    public Node next() {
        Node node = stack.pop();

        if (node.getRight() != null) {
            stack.push(node.getRight());
        }
        if (node.getLeft() != null) {
            stack.push(node.getLeft());
        }
        return node;
    }
}
