package obiektyPakiety;

//Utwórz klasę Human reprezentującą człowieka,
// musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć.
// Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale.

public class Human {
    private int age;
    private int weight;
    private int height;
    private String name;
    private boolean male;


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

    public boolean isMale(){

        return false;
    }
}
