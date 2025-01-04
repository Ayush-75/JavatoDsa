package collection_framework.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets_1 {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        HashSet is an implementation of the Set interface that uses a hash table for storage.
//        It does not guarantee any specific order of the elements.

//        Set<Integer> set = new LinkedHashSet<>();
//        LinkedHashSet is an implementation of the Set interface that uses a hash table and a linked list.
//        It maintains the insertion order of the elements.

        Set<Integer> set = new TreeSet<>();
//        TreeSet is an implementation of the Set interface that uses a tree for storage.
//        It guarantees that the elements will be in ascending order.

        set.add(10);
        set.add(2);
        set.add(31);
        set.add(13);
        set.add(21);
        set.add(32);
        set.add(11);
     Set<Integer> set1 = new HashSet<>();

        set.add(23);
        set.add(24);
        set.add(36);
        set.add(72);

        set.addAll(set1);
        set.remove(24);
        System.out.println(set.contains(31));

        System.out.println(set);
    }
}
