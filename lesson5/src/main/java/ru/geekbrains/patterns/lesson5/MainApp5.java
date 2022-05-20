package ru.geekbrains.patterns.lesson5;

import ru.geekbrains.patterns.lesson5.iterator.IteratorFactory;
import ru.geekbrains.patterns.lesson5.iterator.IteratorType;
import ru.geekbrains.patterns.lesson5.tree.MyTreeMap;


public class MainApp5 {
    public static void main(String[] args) {

        IteratorFactory iteratorFactory = new IteratorFactory();

        MyTreeMap myTreeMap = new MyTreeMap<Integer, Integer>(iteratorFactory);
        myTreeMap.put(20, 20);
        myTreeMap.put(7, 7);
        myTreeMap.put(35, 35);
        myTreeMap.put(4, 4);
        myTreeMap.put(9, 9);
        myTreeMap.put(6, 6);
        myTreeMap.put(31, 31);
        myTreeMap.put(40, 40);
        myTreeMap.put(38, 38);
        myTreeMap.put(28, 28);
        myTreeMap.put(52, 52);

        System.out.println("Обход в глубину:");
        myTreeMap.setIteratorType(IteratorType.DFS);
        myTreeMap.iterator();

        System.out.println("Обход в ширину:");
        myTreeMap.setIteratorType(IteratorType.BFS);
        myTreeMap.iterator();

    }
}