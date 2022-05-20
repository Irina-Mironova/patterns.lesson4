package ru.geekbrains.patterns.lesson5.iterator;

import ru.geekbrains.patterns.lesson5.tree.Node;

import java.util.Iterator;

public class IteratorFactory {
    public Iterator<Node> createIterator(IteratorType type, Node root) {
        Iterator<Node> iterator = null;
        switch (type) {
            case BFS:
                iterator = new IteratorBFS(root);
                break;
            case DFS:
                iterator = new IteratorDFS(root);
                break;
        }

        return iterator;
    }
}
