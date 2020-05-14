package pl.orlowski.sebastian.zadania.zadanie1;
////Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć. Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale.
public class Human {
    private int age;
    private int weight;
    private int height;
    private String name;
    private boolean isMale;

    public Human(int age, int weight, int height, String name, boolean isMale) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }
}
