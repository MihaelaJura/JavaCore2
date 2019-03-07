package Task2;

import Task8.GraphicObject;

import java.util.Scanner;

public class Circle extends GraphicObject {
    int radius;

    public Circle() {
    }

    public Circle(int radius) {

        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public static void main(String[] args) {
        int radius;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter circle radius:");
            radius = input.nextInt();
        } while (radius < 0);
        Circle circle = new Circle(radius);

        System.out.println("Area:" + circle.getArea());
        System.out.println("Area abstract method:" + circle.abstractArea());
        System.out.println("Perimeter:" + circle.getPerimeter());


    }

    @Override
    public double abstractArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

