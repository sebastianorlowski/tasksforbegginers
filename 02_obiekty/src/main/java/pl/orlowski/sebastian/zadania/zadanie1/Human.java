package pl.orlowski.sebastian.zadania.zadanie1;
////Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć. Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale.
public class Human {
    private Integer age;
    private Integer weight;
    private Integer height;
    private String name;
    private Boolean isMale;

    public Human(Integer age, Integer weight, Integer height, String name, Boolean isMale) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public Boolean isMale() {
        return isMale;
    }
}
