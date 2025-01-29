package delegates_pattern;

// delegates
// The delegate pattern allows an object to delegate one or more tasks to a helper object.
// This pattern helps in achieving separation of concerns, code reusability, and flexibility in code design.
// lose coupling
public class Delegation_Pattern {
    public static void main(String[] args) {

        Hp hp = new Hp();      // Create an instance of Hp
        Epson epson = new Epson();  // Create an instance of Epson
        Printer printer = new Printer(hp);  // Printer delegates the task to Hp
        printer.print();  // Calls print method on Printer, which delegates to Hp

        Task printer1 = new Hp();
        printer1.print();
    }
}

class Printer implements Task {

    Task printer;  // Reference to an instance of Task

    // Constructor that sets the Task instance
    Printer(Task printer) {
        this.printer = printer;
    }

    // Implementation of Task's print method that delegates the actual printing task to the delegate
    @Override
    public void print() {
        printer.print();  // Delegates the call to the actual Task implementation
    }
}

interface Task{
    public void print();
}
class Hp implements Task{
    @Override
    public void print() {
        System.out.println("Hp is printing ..");
    }
}

class Epson implements Task{
    @Override
    public void print() {
        System.out.println("Epson is printing ..");
    }
}
