package collection_framework.comparator_comparable;

import java.util.*;

public class Learn_Comp {

    public static void main(String[] args) {
        Animal a1 = new Animal(5,"Leo",10);
        Animal a2 = new Animal(2,"Bruno",4);
        Animal a3 = new Animal(3,"Rio",5);
        Animal a4 = new Animal(6,"Justin",7);
        Animal a5 = new Animal(6,"mario",7);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);

        // sorting on the basis of comparable override in animal class
        Collections.sort(dogs);

        // implement custom comparator interface function as anonymous class
//        dogs.sort(new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return 0;
//            }
//        });

//        Collections.sort(dogs, new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return 0;
//            }
//        });

        // created custom class that implements comparator interface
//        Collections.sort(dogs,new CustomComparator());

        System.out.println(dogs);
        dogs.sort(new CustomComparator());
        System.out.println(dogs);

        // lambda expression of comparator on the basis of name
//        dogs.sort((o1, o2) -> o1.name.compareTo(o2.name));
        dogs.sort(Comparator.comparing(o -> o.name));
//        dogs.sort(Comparator.comparing(Animal::getAge));
        // you also do chaining like if age is equal then compare on the basis of name
        dogs.sort(Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));

//        dogs.sort((d1,d2)-> {
//            return 0;
//        });
        System.out.println(dogs);
    }
}

class CustomComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
//        return o1.weight - o2.weight;
        // Using Integer.compare to avoid overflow issues with subtraction
        return Integer.compare(o1.weight,o2.weight);
    }
}