package pl.orlowski.sebastian.zadania.zadanie3;
/*Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
        MyNumber isOdd() – true jeśli atrybut jest nieparzysty,
        MyNumber isEven() – true jeśli atrybut jest parzysty,
        MyNumber sqrt() – pierwiastek z atrybutu,
        MyNumber pow(MyNumber x) – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
        MyNumber add(MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
        MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
        A teraz ciekawostka, jeśli rozwiązałeś zadanie 3. to muszę Ci zdradzić, że podobna klasa istnieje w standardowej bibliotece języka Java. Jest to klasa BigInteger/BigDecimal. Oczywiście jej możliwości są dużo bardziej rozbudowane, jednak zasada działania jest podobna.
*/
public class MyNumber {
    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isOdd() {
        return !(number % 2 == 0);
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(number);
    }

    public MyNumber pow(MyNumber pow) {
        return new MyNumber(Math.pow(number, pow.number));
    }

    public MyNumber add(MyNumber otherNumber) {
        return new MyNumber(number + otherNumber.number);
    }

    public MyNumber subtract(MyNumber otherNumber) {
        return new MyNumber(number - otherNumber.number);
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(10);
        MyNumber otherNumber = new MyNumber(12);
        System.out.println(myNumber.subtract(otherNumber).isOdd());
    }
}