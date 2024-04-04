package Oops.Nested_Inner_class;

public class OuterClass {

    String outerField = "outerField";
    static String staticOuterField = "static outer field";

    class InnerClass{
        void accessMember(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class staticNestedClass{
        void accessMember(OuterClass outerClass){
            //Cannot make a static reference to the non-static
            //field outerField
            //To fix this error, access outerField through an object reference
            System.out.println(outerClass.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner Class");
        System.out.println("-------------");
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClassObject= new OuterClass().new InnerClass();
        innerClassObject.accessMember();

        System.out.println("\nstatic nested class:");
        System.out.println("--------------");
        staticNestedClass staticNestedClass = new staticNestedClass();
        staticNestedClass.accessMember(outerClass);

        System.out.println("\nTop level Class:");
        System.out.println("--------------------");
        TopLevelClass topLevelClass = new TopLevelClass();
        topLevelClass.accessMembers(outerClass);

    }
}
class TopLevelClass {

    void accessMembers(OuterClass outer) {
        // Compiler error: Cannot make a static reference to the non-static
        //     field OuterClass.outerField
        // System.out.println(OuterClass.outerField);
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
