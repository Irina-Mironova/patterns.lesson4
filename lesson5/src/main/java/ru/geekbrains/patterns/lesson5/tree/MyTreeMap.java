package ru.geekbrains.patterns.lesson5.tree;

import ru.geekbrains.patterns.lesson5.iterator.IteratorFactory;
import ru.geekbrains.patterns.lesson5.iterator.IteratorType;

import java.util.*;

public class MyTreeMap<K extends Comparable<K>, V> {
    private Node root; // головной узел
    private IteratorType iteratorType;

    private final IteratorFactory iteratorFactory;


    public MyTreeMap(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }

    public void setIteratorType(IteratorType iteratorType) {
        this.iteratorType = iteratorType;
    }

    private Iterator<Node> createIterator() {
        return iteratorFactory.createIterator(iteratorType, root);
    }

    public void iterator() {
        Iterator<Node> iterator = createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("key == null");
        }
        if (value == null) {
            return;
        }
        root = put(root, key, value);
    }

    private Node put(Node node, K key, V value) {
        if (node == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo((K) node.getKey());
        if (cmp == 0) {
            node.setValue(value);
        } else if (cmp < 0) {
            node.setLeft(put(node.getLeft(), key, value));
        } else {
            node.setRight(put(node.getRight(), key, value));
        }
        return node;
    }

}