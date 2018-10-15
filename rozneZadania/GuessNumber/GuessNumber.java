package RozneZadania.GuessNumber;
/*
1.Napisz program losujacy liczbę z zakresu 0-100. Natepnie program pyta sie uzytkownika, co to za liczba.
Jesli uzytkownik zgadnie to dowiaduje sie ile wykonal prob i jest pytany czy chce dalej grac.
Jesli nie zgadnie to dowiaduje sie czy podana przez niego liczba jest wieksza czy mniejsza od wylosowanej
*/


import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int counter = 0;
        boolean newGame = true;
        Random random = new Random();
        int randomNumber = random.nextInt(100); //losuje liczbę z zakresu od 0 do n-1;

        //to be removed after checking code
        System.out.println("Wylosowana liczba " + randomNumber);

        do {
            if (counter == 0) {
                System.out.println("Podaj liczbe z zakresu 0-100 jaka zostala wylosowana");
            }
            Scanner scanner = new Scanner(System.in);
            int userNumber;

            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();

                counter++;

                boolean isNumberCorrect = (userNumber == randomNumber);

                if (!isNumberCorrect) {
                    if(userNumber > 100 || userNumber < 0) {
                        System.out.println("Twoja lliczba nie jest z zakresu 0-100");
                    }
                    else if (userNumber > randomNumber) {
                        System.out.println("Twoja liczba jest wieksza niz wylosowana liczba. Probuj dalej");
                    } else {
                        System.out.println("Twoja liczba jest mniejsza niz wylowowana liczba. Probuj dalej");
                    }

                } else {
                    System.out.println("Liczba prob: " + counter + ". Jesli chcesz grac dalej wpisz 1");
                    String replay = scanner.next();

                    if (replay.equals("1")) {
                        newGame = true;
                        counter = 0;
                        randomNumber = random.nextInt(100);
                        System.out.println("Nowa wylosowana liczba " + randomNumber);
                    } else {
                        newGame = false;
                    }

                }
            } else {
                System.out.println("To nie jest liczba!");
            }
        } while (newGame);
        System.out.println("Dzieki za gre!");
    }


}



