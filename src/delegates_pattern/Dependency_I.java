package delegates_pattern;

/**
Decoupling: It decouples the creation of a dependency from the class that uses it,
 making the code more modular and easier to manage.
Testability: It improves testability by allowing dependencies to be easily mocked or stubbed.
Flexibility: It allows for greater flexibility in changing the behavior of the application
 by simply changing the injected dependencies.
Maintainability: It enhances maintainability by reducing the need for changes
in multiple places when a dependency changes.
Reusability: It promotes reusability of code by allowing different implementations
of a dependency to be used interchangeably.
*/
public class Dependency_I {

    public static void main(String[] args) {

        HpPrintService hpPrintService = new HpPrintService();
        Printer3 printer3 = new Printer3(hpPrintService);
        printer3.executePrint();

    }
}

class Printer3{
    PrintService printService;

    Printer3(PrintService printService){
        this.printService = printService;
    }

    public void executePrint(){
        printService.printDocument();
    }
}

interface PrintService {
    void printDocument();
}

class HpPrintService implements PrintService {
    @Override
    public void printDocument() {
        System.out.println("HpPrintService is printing ..");
    }
}

class EpsonPrintService implements PrintService {
    @Override
    public void printDocument() {
        System.out.println("EpsonPrintService is printing ..");
    }
}

