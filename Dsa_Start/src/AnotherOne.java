import java.lang.reflect.Array;
import java.util.*;

public class AnotherOne {

    public static void main(String[] args) {

        Animal a1 = new Animal(1, "Leo", 10);
        Animal a2 = new Animal(5, "Leo", 4);
        Animal a3 = new Animal(7, "Bruno", 5);
        Animal a4 = new Animal(7, "Prasad", 6);
        Animal a5 = new Animal(2, "Justin", 7);
        Animal a6 = new Animal(3, "mario", 7);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);
        dogs.add(a6);

//        dogs.forEach(dog -> System.out.println(dog.name+" = "+dog.age));

        Collections.sort(dogs, new CustomComparator());
        Collections.sort(dogs, (o1, o2) -> o1.name.compareTo(o2.name));
        Collections.sort(dogs, Comparator.comparing(o -> o.name));
        System.out.println(dogs);


        int a[][] = {{5, 7, 8},
                {6, 5, 8, 6, 5},
                {1, 6, 8},
                {1, 7, 9},
        };

//        Arrays.sort(a, (b1, b2) -> {
//            return b1[0] - b2[0];
//        });

        Arrays.sort(a, (r1, r2) -> {

            Arrays.sort(r1);
            Arrays.sort(r2);

            int len = Math.min(r1.length, r2.length);
                for (int i = 0; i < len; i++) {
                    if (r1[i] != r2[i]) {
                        return r1[i] - r2[i];
                    }
                }

                return r1.length - r2.length;

        });

        for (int[] b : a) {
            for (int element : b) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}

class CustomComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}


class Animal implements Comparable<Animal> {

    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}' + "\n";
    }

    @Override
    public int compareTo(Animal o) {
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
}
