package pl.orlowski.sebastian.zadania;

import java.util.Scanner;

// Pętle i instrukcje warunkowe
//Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
//Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie),
//Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X. Klasa powinna mieć 2 metody:
//int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
//int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
//Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),
//Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument. Na przykład “pies” przekształci w “seip”,
//Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.). System binarny opisałem w osobnym artykule,
//Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie. Może przydać Ci się metoda String#toCharArray
//Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”),
//Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”,
//Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do największej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.
//Chociaż zadania wymagają wiedzy z zakresu podstaw języka Java nie są bardzo łatwe. Na pewno ciekawostką dla Ciebie będzie to, że na przykład zadanie z palindromem czasami trafia się na rozmowach rekrutacyjnych :)
public class Loops {

    public Loops() {
    }

    ////Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
    public void numberOfArraySize(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("X cannot be zero and less!");
        }
        int[] tab = new int[x];
        for (int i = 0; i < x; i++) {
            tab[i] = i;
            System.out.println(tab[i]);
        }
    }

    //Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie),
    public void numberOfArraySizeWhileLoop(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("X cannot be zero and less!");
        }
        int[] tab = new int[x];
        int i = 0;
        while (i < x) {
            tab[i] = i;
            System.out.println(tab[i]);
            i++;
        }
    }

    //Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),
    public void numberReverse(int x) {
        String number = String.valueOf(x);
        char[] tab = number.toCharArray();
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }
    }

    //Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument. Na przykład “pies” przekształci w “seip”,

    public String reverseAnimal(String animal) {
        char[] tab = animal.toCharArray();
        char[] j = new char[animal.length()];
        int x = 0;

        for (int i=tab.length-1; i>= 0; i--) {
            j[x] = tab[i];
            x++;
        }
        String result = "";
        for (char c : j) {
            result += c;
        }
        return result;
    }

    // Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.). System binarny opisałem w osobnym artykule,
    public void changeToBinary(int number) {
        /// 24 -> %2 = 0<-last index, 11000, 24 / 2 = 12 12/ 2 = 6 /2 3 / 2
        String result = "";
        while(number > 0) {
            result += number % 2;
            number /= 2;
        }
        System.out.println(reverseAnimal(result));
    }

    // Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie. Może przydać Ci się metoda String#toCharArray
    public boolean isPalindrom(String word) {
        char[] tab = word.toCharArray();
        String result = "";
        for(int i=tab.length-1;i>=0;i--) {
            result += tab[i];
        }
        return result.equals(word);
    }

    //Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do największej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.

    public void sortArray(int [] tab){
        int temp;
        for(int i=0;i<tab.length-1;i++) {
            for(int j=0;j<tab.length-1;j++) {
                if(tab[j] > tab[j+1]) {
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        for(int i : tab) {
            System.out.print(i + " ");
         }
    }


    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.changeToBinary(141);
        System.out.println(loops.isPalindrom("koło"));
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int count = input.nextInt();
        int number;
        int[] tab = new int[count];
        for(int i=1;i<count+1;i++) {
            System.out.print("Please enter number " + i + " :");
            System.out.println();
            number = input.nextInt();
            tab[i-1] = number;
        }
        System.out.print("Sorted array :");
        loops.sortArray(tab);
    }
}
