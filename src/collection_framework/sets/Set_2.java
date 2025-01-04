package collection_framework.sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Set_2 {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(25,"Ayush"));
        studentSet.add(new Student(25,"Ayush"));
        studentSet.add(new Student(25,"Ayush"));

        System.out.println(studentSet);
    }
}

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}

/**
 * Yes, exactly! When you don't override the equals and hashCode methods in a Java class,
 * the default implementations from the Object class are used. Here's a quick summary of the differences:
 *
 * Without Overriding equals and hashCode
 * equals(Object o): The default implementation in the Object class checks for reference equality using
 * the == operator. This means two objects are considered equal only if they point to the same memory location.
 * hashCode(): The default hashCode method returns a distinct integer for each object based on memory address.
 * This can lead to different hash codes even for objects that are logically the same.

 * With Overriding equals and hashCode
 * Custom equals(Object o): You can define logical equality by comparing object fields
 * (e.g., rollNo in the Student class).
 * Custom hashCode(): You can generate a consistent hash code based on relevant fields
 * (e.g., rollNo in the Student class). Objects that are considered equal by equals should have the same hash code.
 */
