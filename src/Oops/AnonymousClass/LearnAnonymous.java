package Oops.AnonymousClass;

import Oops.abstraction.LearnAbstract;

public class LearnAnonymous {

    class InnerClass extends OuterClass {
    }

//    OuterClass outerClass = new OuterClass() {
//        public void sing() {
//            System.out.println("OuterClass class method");
//        }
//
//        @Override
//        public void outerMethod() {
//
//        }
//    };

    SuperInterface obj = new SuperInterface() {
        @Override
        public void interfaceMethod() {
            System.out.println("Interface anonymous class ");
        }
    };

    SuperInterface obj1 = ()->{

    };

    WakeAble wakeAble = (int steps) -> {
        System.out.println("Waked "+steps+" steps");
        return steps;
    };

    public static void main(String[] args) {
        LearnAnonymous anonymous = new LearnAnonymous();
//        anonymous.outerClass.sing();
//        anonymous.obj.interfaceMethod();

        OuterClass outerClass = new OuterClass() {
            public void sing() {
                System.out.println("OuterClass class method");
            }

            @Override
            public void outerMethod() {
                sing();
                System.out.println("Outer method inside anonymous");
            }
        };

        WakeAble obj = steps -> steps;
        System.out.println("waked with obj "+obj.walks(500));

        outerClass.outerMethod();

        anonymous.obj.interfaceMethod();

        anonymous.wakeAble.walks(50);


    }

}

class OuterClass {

    public void outerMethod() {
        System.out.println("Outer class method ");
    }
}

// function interface will work only if its has only one method
@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();
}
@FunctionalInterface
interface WakeAble{
    int walks(int steps);
}

@FunctionalInterface
interface HowManyMethods{

    void say();
    default void track(){
        System.out.println("track in functional interface");
    }
    default void track2(){
        System.out.println("track2 in functional interface");
    }

    static void track3(){
        System.out.println("track3 in functional interface");
    }
}

