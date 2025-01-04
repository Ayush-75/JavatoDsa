package collection_framework;

import java.util.*;

public class Learn_List {
    public static void main(String[] args) {


        // ArrayList is dynamic in size, allows duplicate elements, maintains insertion order, and provides random access.

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(51);
        list.add(52);
        list.add(53);
        list.add(54);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        // by default, it will remove on the basis of index
//        list.remove(2);
        // if you pass an object, it will remove that object
//        list.remove(Integer.valueOf(54));
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();

        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(53);
        list2.add(4);

        // add all the element from list2 to list
//        list.addAll(list2);
        // remove all duplicate element from list2 present in list (intersection element)
//        list.removeAll(list2);
        // keep element which are present in both list
//        list.retainAll(list2);
//        list.clear();

        Object a[] = list.toArray();
        for (Object e:a){
            Integer temp = (Integer) e;
            System.out.println(temp);
        }

        System.out.println(list);
    }
}
