package pl.orlowski.sebastian.zadania;
// Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X. Klasa powinna mieć 2 metody:
////int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
////int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
/*

        Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”),
        Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”,
        Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do największej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.
*/
public class ArrayFactory {

    private int x;

    public ArrayFactory(int x) {
        this.x = x;
    }

    //int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
    public int[] oneDimension() {
        return new int[x];
    }

    //int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
    public int[][] buildTwoDimensions() {
        int[][] array = new int[x][];
        for(int i = 0; i < x; i++) {
            array[i] = new int[x];
        }
        return array;
    }

    //Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”),
    public int[][] unitMatrix() {
        int[][] matrix = buildTwoDimensions();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }


}
