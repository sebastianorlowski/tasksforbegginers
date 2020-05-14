package pl.orlowski.sebastian.zadania;// Metody w języku Java
//Napisz metodę, która zwróci Twój aktualny wiek.
//Napisz metodę, która zwróci Twoje imię,
//Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
//Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
//Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
//Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
//Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy (poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże),
//Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.


public class Main {
    int age;
    String name;
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    //Napisz metodę, która zwróci Twój aktualny wiek.
    public int getAge() {
        age = 24;
        return age;
    }

    //Napisz metodę, która zwróci Twoje imię,
    public String getName() {
        name = "Sebastian";
        return name;
    }

    //Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
    public void resultOfTwoNumbers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        System.out.println("Suma " + (firstNumber + secondNumber));
        System.out.println("Różnica " + (firstNumber - secondNumber));
        System.out.println("Iloczyn " + (firstNumber * secondNumber));
    }

    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
    public boolean isEven(int firstNumber) {
        this.firstNumber = firstNumber;
        return firstNumber % 2 == 0;
    }

    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
    public boolean ifIsDiv3And5(int firstNumber) {
        this.firstNumber = firstNumber;
        return firstNumber % 3 == 0 && firstNumber % 5 == 0;
    }

    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    public double resultToPow3(int firstNumber) {
        this.firstNumber = firstNumber;
        return Math.pow(firstNumber, 3);
    }

    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy (poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże),
    public double resultToSqrt(int firstNumber) {
        this.firstNumber = firstNumber;
        return Math.sqrt(firstNumber);
    }

    //Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    public boolean isRectangularTriangle(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        double a = Math.pow(firstNumber, 2);
        double b = Math.pow(secondNumber, 2);
        double c = Math.pow(thirdNumber, 2);
        if(a > b && a > c) {
            return a == b + c;
        }
        else if (b > a && b > c) {
            return b == a + c;
        }
        else if (c > a && c > b) {
            return c == a + b;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getAge());
        System.out.println(main.getName());
        main.resultOfTwoNumbers(20,10);
        System.out.println(main.isEven(4));
        System.out.println(main.ifIsDiv3And5(30));
        System.out.println(main.resultToPow3(11));
        System.out.println(main.resultToSqrt(11));
        System.out.println(main.isRectangularTriangle(6, 3, 4));
    }
}