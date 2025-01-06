package collection_framework.comparator_comparable;

import org.jetbrains.annotations.NotNull;

public class Animal implements Comparable<Animal>{
        int age;
        String name;
        int weight;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    Animal(int age, String name, int weight){
            this.age = age;
            this.name = name;
            this.weight = weight;
        }

    @Override
    public String toString() {
        return "Animal{" +
                "age="+age +
                ", name='" + name + '\''+
                ",weight="+ weight +
                '}'+"\n";
    }

    @Override
    public int compareTo(@NotNull Animal o) {
            if (this.age == o.age){
                return this.name.compareTo(o.name);
            }
        return this.age - o.age;
    }
}

