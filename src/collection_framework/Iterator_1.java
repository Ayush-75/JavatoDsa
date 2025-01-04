package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Guava");
        fruits.add("Apple");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("fruits are "+fruits.get(i));
        }
        System.out.println("===================================================");

        for (String fruit : fruits) {
            System.out.println("fruits are " + fruit);
        }

        System.out.println("===================================================");
        Iterator<String> fe = fruits.iterator();
        while (fe.hasNext()){
            System.out.println("iterator "+fe.next());
        }
        System.out.println("===================================================");
        Iterator<String> fe1 = fruits.listIterator();
        while (fe1.hasNext()){
            System.out.println("list iterator "+fe1.next());
        }
        System.out.println("===================================================");
        Iterator<String> fe2 = fruits.listIterator(2);
        while (fe2.hasNext()){
            System.out.println("list iterator from specified index "+ fe2.next());
        }
        System.out.println("===================================================");
        List<String> fe3 = fruits.subList(2,4);
            System.out.println("subList "+ fe3);
        }
    }

