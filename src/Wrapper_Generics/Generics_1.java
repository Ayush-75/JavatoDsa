package Wrapper_Generics;

public class Generics_1 {

    public static void main(String[] args) {

        Dog<String> dog = new Dog<>("String");
        Dog<Integer> dog1 = new Dog<>(5);

        System.out.println(dog1.getId());
    }
}

class Dog<E> {
    E id;

    public Dog(E id) {
        this.id = id;
    }

    E getId() {
        return id;
    }
}

class GenericMethod {

    public static void main(String[] args) {

//        printData("Hello");
        printData(5);

        GenericMethod genericMethod = new GenericMethod();
          String word = genericMethod.<Integer>convertToString(55);

          if (word instanceof String){
              System.out.println("int is converted into string "+word);
          }else {
              System.out.println("not instance");
          }

    }

    // bounded generics
    static <E extends Number> void printData(E data){
        System.out.println(data);
    }

    public <V> String convertToString(V word){
        return word.toString();
    }
}
