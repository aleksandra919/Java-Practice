package RozneZadania.Other;

public class Animal {
    String color;
    int age;

    //konstruktor
    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    //zdefiniowane metody javy - get i set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
