package Task3;

import Task2.Circle;

import java.util.Scanner;

public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setData (String n, int a)
    {
        name = n;
        age = a;
    }
    public static int averageAge(Student a, Student b)
    {
        return( a.getAge() + b.getAge())/2;
    }
    public static void main(String[] args) {

        Student student1 = new Student("Human1",20);
        Student student2 = new Student("Human2",40);

        student2.setData("Human3",30);

        System.out.println("The average age is:"+averageAge(student1,student2));
    }
}
