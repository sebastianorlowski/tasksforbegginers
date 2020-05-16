package pl.orlowski.sebastian.zadania.interfejsy;

import java.util.Scanner;

//Interfejsy
//Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze od użytkownika:
//długość promienia koła,
//2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
//długość boków prostokąta.
//Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.
public class Main {
    static Figure[] figures = new Figure[3];
    static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.print("Enter length of circle radius: ");
        figures[0] = new Circle(input.nextInt());

        System.out.print("Enter 2 lengths of rectangle: ");
        figures[1] = new Rectangle(input.nextInt(), input.nextInt());

        System.out.print("Enter 2 length of triangle: ");
        figures[2] = new Triangle(input.nextInt(), input.nextInt());

        for(Figure f : figures) {
            System.out.println(f.getName());
            System.out.println("Perimeter " + f.getPerimeter());
            System.out.println("Area: " + f.getArea());
            System.out.println();
        }


    }
}
