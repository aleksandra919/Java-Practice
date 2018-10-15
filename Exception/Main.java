package Exception;
/*
Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe z ktorej chcesz wyliczyc pierwiastek");
        Scanner scanner = new Scanner(System.in);
        double number = 0;

        while (true) {
            try {
                number = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("To nie jest  liczba");
                scanner.next();
            }
         }

         if (number < 0 ) {
             throw new IllegalArgumentException(String.format("Pierwiastek z liczbt %.4f nie istnieje!", number));
         }

        System.out.println(Math.sqrt(number));
    }
}
