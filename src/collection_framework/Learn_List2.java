package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Learn_List2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println(list.get(1));

        list.set(1,6);
        list.add(1,7);

        list.remove(3);

        // if an element is not present in a list, it will return -1
        System.out.println(list.indexOf(5));

        // lastIndexOf returns the index of the last occurrence of the specified element in the list.
        // Unlike indexOf, which returns the index of the first occurrence.

        System.out.println(list.lastIndexOf(5));

        System.out.println(list);

    }
}
