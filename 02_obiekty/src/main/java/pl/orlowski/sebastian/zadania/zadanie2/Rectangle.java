package pl.orlowski.sebastian.zadania.zadanie2;

import java.text.DecimalFormat;

// Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość. Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.
public class Rectangle {
    private double firstLength;
    private double secondLength;

    public Rectangle(double firstLength, double secondLength) {
        if((firstLength <= 0) || (secondLength <=0)) {
            throw new IllegalArgumentException("Length cannot be zero or less!");
        }
        this.firstLength = firstLength;
        this.secondLength = secondLength;
    }

    // Zwraca pole prostokąta
    public double fieldOfRectangle() {
        return firstLength * secondLength;
    }

    // Zwraca obwód prostokąta
    public double circuitOfRectangle() {
        return (2 * firstLength) + (2 * secondLength);
    }
    // Zwraca długość przekątnej prostokąta
    public double diagonalOfRectangle() {
        double diagonal = Math.pow(firstLength, 2) + Math.pow(secondLength, 2);
        double value = Math.sqrt(diagonal);
        String str = String.format("%.02f", value);
        str = str.replaceAll(",",".");
        double result = Double.parseDouble(str);
        return result;
    }

    @Override
    public String toString() {
        return "Pole: " + fieldOfRectangle() +
                " Obwod: " + circuitOfRectangle() +
                " Przekatna: " + diagonalOfRectangle();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,9);
        System.out.println(rectangle.toString());
    }

}
