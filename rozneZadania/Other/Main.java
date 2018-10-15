package RozneZadania.Other;

public class Main {
    public static void main(String[] args) {
        Person objectOne = new Person("Ola", 27);
        objectOne.setName("Aleksandra");
        System.out.println(objectOne.getName());

        //tworze nowy objekt
        Animal animalOne = new Animal("blue", 12);
        System.out.println(animalOne.getColor());
        System.out.println(animalOne.getAge());

        animalOne.setAge(14);
        System.out.println(animalOne.getAge());

    }
}
