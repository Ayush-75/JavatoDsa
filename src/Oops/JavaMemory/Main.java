package Oops.JavaMemory;
public class Main {
    public static void main(String[] args) {
        // Stack: The reference variable 'example' is stored in the stack memory.
        // Heap: The new object of type 'ExampleClass' is stored in the heap.
        ExampleClass example = new ExampleClass();

        // Stack: The primitive type 'int' variable 'x' is stored in the stack memory.
        int x = 10;

        // Stack: The reference variable 'numbers' is stored in the stack memory.
        // Heap: The new array of integers is stored in the heap.
        int[] numbers = new int[5];

        // Calling a method also creates a new block in the stack memory for its execution.
        example.methodExample();
    }
}

class ExampleClass {
    // Heap: Instance variables are stored in the heap as part of their respective objects.
    private int instanceVar = 0;

    public void methodExample() {
        // Stack: The primitive type 'int' variable 'localVar' is stored in the stack memory.
        int localVar = 10;
    }
}