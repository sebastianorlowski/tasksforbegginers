package pl.orlowski.sebastian.zadania.interfejsy;
//Interfejsy
//Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze od użytkownika:
//długość promienia koła,
//2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
//długość boków prostokąta.
//Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.
public class Circle implements Figure {
    private final double pi = 3.14;
    private double radius;

    //Pole = pi * promien^2 ; obwód 2pi*r

    public Circle(double radius)  {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return pi * (Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
