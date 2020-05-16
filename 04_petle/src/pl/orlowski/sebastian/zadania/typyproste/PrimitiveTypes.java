package pl.orlowski.sebastian.zadania.typyproste;

import pl.orlowski.sebastian.zadania.ArrayFactory;
import pl.orlowski.sebastian.zadania.Loops;

import java.util.Scanner;

/*W tej sekcji znajdują się głównie zadania, które wymagają znajomości klasy Scanner opisanej w artykule dotyczącym typów prostych.

        Jeśli w klasie Human użyłeś typów prostych zamień je na odpowiadające im klasy (int => Integer),
        Napisz program, który pobierze od użytkownika liczbę całkowitą, a następnie wyświetli jej binarną reprezentację na ekranie,
        Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy, a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę. Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej do największej liczby,
        Napisz program, który pobierze od użytkownika łańcuch znaków i wyświetli na konsoli jego długość, informację czy jest to palindrom czy nie oraz jego odwróconą wartość.
*/
public class PrimitiveTypes {
    public static Loops loops = new Loops();
    static Scanner input = new Scanner(System.in);

    // Napisz program, który pobierze od użytkownika liczbę całkowitą, a następnie wyświetli jej binarną reprezentację na ekranie,

    public void changeNumberToBinary(int number) {
        if(number <= 0) {
            throw new IllegalArgumentException("Number cannot be zero or less!");
        }
        loops.changeToBinary(number);
    }

    //Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy, a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę. Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej do największej liczby,

    public void arrayWithNNumbers(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("Number cannot be zero or less!");
        }
        ArrayFactory arrayFactory = new ArrayFactory(n);
        int [] tab = arrayFactory.oneDimension();
        for(int i=0;i<tab.length;i++) {
            System.out.print("Please enter number " + (i+1) + ": ");
            int number = input.nextInt();
            tab[i] = number;
        }
        loops.sortArray(tab);
    }

    //Napisz program, który pobierze od użytkownika łańcuch znaków i wyświetli na konsoli jego długość, informację czy jest to palindrom czy nie oraz jego odwróconą wartość.
    public void enterWord(String word) {
        System.out.println("Length of word is equals: " + word.length());
        if(loops.isPalindrom(word)) {
            System.out.println("This word is palindrom");
        }
        else {
            System.out.println("This word isnt palindrom");
        }
        System.out.println("Inverted value: " + loops.reverseAnimal(word));
    }


    public static void main(String[] args) {
    PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        // Napisz program, który pobierze od użytkownika liczbę całkowitą, a następnie wyświetli jej binarną reprezentację na ekranie,
        System.out.println("Please enter number which application will change to binary number");
        primitiveTypes.changeNumberToBinary(input.nextInt());

       // Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy, a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę. Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej do największej liczby,
        System.out.println("Please enter number, this number will represent length of array");
        primitiveTypes.arrayWithNNumbers(input.nextInt());
        System.out.println(input.nextLine());
        System.out.println("Please enter word");
        primitiveTypes.enterWord(input.nextLine());




    }


}
