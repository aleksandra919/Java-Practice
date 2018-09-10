package interface2;

/*
Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię).
    Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure.
    Napisz program, który pobierze od użytkownika:
    - długość promienia koła
    - długości boków trójkąta prostokątnego (boki przy kącie prostym),
    - długość boków prostokąta.
Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int circleRadius;
        int triangleSideLenghtA;
        int triangleSideLenghtB;
        int rectangleSideLenghtA;
        int rectangleSideLenghtB;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj  wymiary kola");
        circleRadius = scanner.nextInt();

        System.out.println("Podaj dwa wymiary trojkata");
        triangleSideLenghtA = scanner.nextInt();
        triangleSideLenghtB = scanner.nextInt();

        System.out.println("Podaj dwa wymiary prostokata");
        rectangleSideLenghtA = scanner.nextInt();
        rectangleSideLenghtB = scanner.nextInt();

        Circle circle = new Circle(circleRadius);
        Triangle triangle = new Triangle(triangleSideLenghtA,triangleSideLenghtB);
        Rectangle rectangle = new Rectangle(rectangleSideLenghtA, rectangleSideLenghtB);


        Figure [] figure = {circle,triangle, rectangle};

        for(Figure element: figure) {
            System.out.println("Figura: " + element.getName()  + ". Pole tej figury wynosi: " + element.getPerimeter() + ". Obwód figury wynosi: " + element.getArea());
        }
    }
}
