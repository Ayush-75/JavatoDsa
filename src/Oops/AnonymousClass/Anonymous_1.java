package Oops.AnonymousClass;

public class Anonymous_1 {

    OuterClass_1 outerClass = new OuterClass_1(){
        public void sing(){}

        @Override
        void outerMethod() {
            super.outerMethod();
        }
    };

    // anonymous
    SuperInterface_1 obj = new SuperInterface_1() {
        @Override
        public void interfaceMethod() {

        }

    };

    SuperInterface_1 obj1 = () -> {
        System.out.println("In lambda expression");
    };

    public static void main(String[] args) {
        Anonymous_1 anonymous = new Anonymous_1();
        anonymous.obj.interfaceMethod();
//        anonymous.outerClass.sing();
        anonymous.obj1.interfaceMethod();

        Walkable walkable = (int steps) -> {
            System.out.println("Walked for "+steps+" steps");
            return steps;
        };
        Walkable walkable2 = (steps) -> 2*steps;

        walkable.walks(50);
        int steps = walkable2.walks(50);
        System.out.println("walked doubled "+steps);

    }
}

class OuterClass_1{
    void outerMethod(){

    }
}

@FunctionalInterface
interface Walkable{
    int walks(int steps);
}

@FunctionalInterface
interface SuperInterface_1{
    void interfaceMethod();
}

