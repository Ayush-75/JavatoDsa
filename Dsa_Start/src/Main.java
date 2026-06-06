public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
    }
}




 class F1{

    final int gears = 5;

    private int age;

    int speed;

    final void mileage(int mileageInKm){
        System.out.println("Mileage of car is "+ mileageInKm+" KM");
    }

    F1(){
        System.out.println(" Creating a F1 car");
    }

    F1(int speed){
        this.speed = speed;
        System.out.println("testing car speed is "+speed);
    }

    void start(){
        System.out.println("its show time");
    }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }else {
            System.out.println("Please enter valid age ");
        }
     }
 }

class RedBull extends F1{

    public static void main(String[] args) {

        RedBull redBull = new RedBull();
        redBull.speed = 269;
        redBull.start();
        System.out.println(redBull.speed);
        redBull.mileage(12);
        redBull.mileage(12);

        redBull.setAge(5);

        RedBull redBull1 = new RedBull(){
          void sing(){}
        };

        Ilia ilia = () -> {
        };

        Kick kick = walk -> walk;

        int steps = kick.Steps(5);

        System.out.println("Steps walked "+steps);


    }

    RedBull(){
        super(295);
        System.out.println("its Redbull team");
    }

    String model = "hyperx";


    void start() {
        SubRedBull subRedBull = new SubRedBull();
        subRedBull.breaking(this);
        super.start();
        System.out.println("mix and match" + model);
    }
}

@FunctionalInterface
interface Ilia{
    void km();
}

interface Kick{
    int Steps(int walk);
}

class SubRedBull{

    void breaking(RedBull redBull){
        System.out.println("breaking at "+ redBull.speed+ " and gear "+ redBull.gears);
    }
}