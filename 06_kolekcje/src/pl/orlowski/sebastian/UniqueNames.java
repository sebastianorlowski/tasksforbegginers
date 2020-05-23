package pl.orlowski.sebastian;

import java.util.*;

//Napisz program, który będzie pobierał od użytkownika imiona. Program powinien pozwolić użytkownikowi na wprowadzenie dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie wprowadzanie). Na zakończenie wypisz liczbę unikalnych imion.
//    Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi imienia „-”, następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych imion i wyświetl imię odpowiadającego mu partnera.
public class UniqueNames {
    Set<String> names = new HashSet<>();
    Map<String, String> pair = new HashMap<>();
    static Scanner input = new Scanner(System.in);
    private final String NOMORE = "-";
    String name, name2;

    public void addName() {
        boolean isOn = true;
        while(isOn) {
            System.out.print("Enter name: ");
            name = input.nextLine();
            if(name.equals(NOMORE)) {
                for(String n : names) {
                    System.out.println(n);
                }
                isOn = false;
            }
            else {
                names.add(name);
            }
        }
    }

    public void addPairNames() {
        boolean isOn = true;
        while(isOn) {
            System.out.println("Enter first name ");
            name = input.nextLine();
            if (name.equals(NOMORE)) {
                System.out.println("Enter name which will display to pair ");
                name = input.nextLine();
                System.out.print(pair.get(name));
                isOn = false;
        }
        else {
                System.out.println("Enter second name ");
                name2 = input.nextLine();
                pair.put(name, name2);
            }
        }
    }

    public static void main(String[] args) {
        UniqueNames uniqueNames = new UniqueNames();
        uniqueNames.addPairNames();
    }
}
