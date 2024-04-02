package Oops.AccessModifier;

public class Teacher {

    public String name;
    // default or package-private
    //Cannot be accessed from outside package
    String degree;
    private int id;

    protected int studentCount;

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.name = "Ayush";
        obj.id = 55;
    }
}
