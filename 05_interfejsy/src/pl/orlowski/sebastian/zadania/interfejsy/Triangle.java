package pl.orlowski.sebastian.zadania.interfejsy;
//Interfejsy
//Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze od użytkownika:
//długość promienia koła,
//2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
//długość boków prostokąta.
//Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.
public class Triangle implements Figure {
    private double firstSide;
    private double secondSide;
    private double result;

    public Triangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide)/2;
    }

    @Override
    public double getPerimeter() {
        result = Math.pow(firstSide, 2) + Math.pow(secondSide,2);
        result = Math.sqrt(result) + firstSide + secondSide;
        return result;
    }
}
