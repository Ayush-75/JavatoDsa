package delegates_pattern;

/**
*
Tight Coupling: The Printer2 class is tightly coupled with the Canon and Brother classes.
* This makes it difficult to extend or modify the code, as changes in the printer classes
* will require changes in the Printer2 class.
Code Duplication: There is duplicated code in the Printer2 class for handling Canon and Brother printers separately.
*  This violates the DRY (Don't Repeat Yourself) principle.
Limited Flexibility: The current implementation restricts the Printer2 class to only work with Canon
*  and Brother printers. Adding support for new printer types would require modifying the Printer2 class.
Initialization Issues: The Printer2 class has two constructors,
*  each initializing only one type of printer. This can lead to confusion and potential runtime
* errors if the wrong constructor is used.
Violation of Single Responsibility Principle: The Printer2 class is responsible for both holding references to
* printer objects and performing print operations. This violates the Single Responsibility Principle,
*  making the class harder to maintain and test.
By using the delegation pattern, these issues can be mitigated,
*  leading to more maintainable, flexible, and scalable code.*/

public class Without_Delegation {
    public static void main(String[] args) {

        Canon canon = new Canon();
        Brother brother = new Brother();

        Printer2 printer2 = new Printer2(canon);
        printer2.printCanon();
    }
}

class Canon implements Task2{
    @Override
    public void print() {
        System.out.println("Canon is printing");
    }
}

class Brother implements Task2{
    @Override
    public void print() {
        System.out.println("Brother is printing");
    }
}

class Printer2{
    Canon canon;
    Brother brother;

    Printer2(Canon canon){
        this.canon = canon;
    }

    Printer2(Brother brother){
        this.brother = brother;
    }

    public void printCanon(){
        if (canon != null){
            canon.print();
        }else {
            System.out.println("Canon printer is not initialized");
        }
    }
    public void printBrother(){
        if (brother != null){
            brother.print();
        }else {
            System.out.println("Brother printer is not initialized");
        }
    }
}

interface Task2{
    public void print();
}
