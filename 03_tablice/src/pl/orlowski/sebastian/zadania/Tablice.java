package pl.orlowski.sebastian.zadania;

import javafx.scene.control.Tab;

// Tablice
//Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
//Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności
//Dużo zadań dotyczących tablic wymaga znajmości pętli, dlatego w następnym akapicie znajdziesz więcej interesujących zadań związanych z tablicami.
public class Tablice {

    public Tablice() {

    }

    //Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
    public String[] alphabet() {
        return new String[] {"a", "b", "c", "d", "e"};
    }

    //Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności
    public void threeElementArray() {
        int [] threeElements = {3,5,9};
        System.out.println("Tablica przed");
        for(int j=0;j<threeElements.length;j++) {
            System.out.print(threeElements[j] + " ");
        }
        System.out.println();
        System.out.println("Tablica po ");

        for(int i=threeElements.length-1; i>=0;i--) {
            System.out.print(threeElements[i] + " ");
        }
    }

    public static void main(String[] args) {
        Tablice tablice = new Tablice();
        tablice.alphabet();
        tablice.threeElementArray();
    }

}
