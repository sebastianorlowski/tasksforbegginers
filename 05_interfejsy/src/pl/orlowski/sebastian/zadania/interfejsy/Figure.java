package pl.orlowski.sebastian.zadania.interfejsy;
//Interfejsy
//Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze od użytkownika:
//długość promienia koła,
//2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
//długość boków prostokąta.
//Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.
public interface Figure {
    double getPerimeter();
    double getArea();
    String getName();
}
