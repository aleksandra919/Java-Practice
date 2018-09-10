package interface;

import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;


        if (main.shouldMultiply()) {
            computation = new Multiplication();

        }
        else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {



        System.out.println("Wpisz 1 jesli chcesz wykonac mnozenie lub 2 jesli chcesz wykonac dodawanie ");

        int operation = scanner.nextInt();
        return (operation == 1);
    }

    private double getArgument() {
        System.out.println("Podaj liczbe");
        double number = scanner.nextDouble();
        return number;
    }
}
