package Task1;

import Task8.GraphicObject;

import java.util.Scanner;

public class Square extends GraphicObject {
    int sideLength;

    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }


    public int aria() {
        return (sideLength * sideLength);
    }

    public int perimetru() {
        return (sideLength * 4);
    }


    public static void main(String[] args) {
        int width;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter sqauare width:");
            width = input.nextInt();
        } while (width < 0);
        Square square = new Square(width);

        System.out.println("Area:" + square.aria());
        System.out.println("Area abstract method:" + square.abstractArea());
        System.out.println("Perimeter:" + square.perimetru());

    }

    @Override
    public double abstractArea() {
        return (sideLength * sideLength);
    }
}
