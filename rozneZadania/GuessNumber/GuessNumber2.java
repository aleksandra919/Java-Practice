//package RozneZadania.GuessNumber;
///*
//1.Napisz program losujacy liczbę z zakresu 0-100. Natepnie program pyta sie uzytkownika, co to za liczba.
//Jesli uzytkownik zgadnie to dowiaduje sie ile wykonal prob i jest pytany czy chce dalej grac.
//Jesli nie zgadnie to dowiaduje sie czy podana przez niego liczba jest wieksza czy mniejsza od wylosowanej
//*/
//
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Random;
//import java.util.Scanner;
//
//public class GuessNumber2 {
//    public static void main(String[] args) {
//
//        int counter = 0;
//        int userNumber = -1;
//        Random random = new Random();
//        int randomNumber = random.nextInt(100); //losuje liczbę z zakresu od 0 do n-1;
//        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
//
//        //to be removed after checking code
//        System.out.println("Wylosowana liczba " + randomNumber);
//        boolean newGame = true;
//
//        while (newGame) {
//            System.out.println("Podaj liczbe z zakresu 0-100 jaka zostala wylosowana");
//            try {
//                userNumber = Integer.parseInt(odczyt.readLine());
//                counter++;
//            } catch (Exception e) {
//                System.out.println("Niepoprawne dane! " +
//                        "\n Podaj liczbe z zakresu 0-100 jaka zostala wylosowana");
//            }
//            newGame = userNumber == -1 ? true : false;
//        }
//        boolean isNumberCorrect = (userNumber == randomNumber);
//
//        if (!isNumberCorrect) {
//            if (userNumber > randomNumber) {
//                System.out.println("Twoja liczba jest wieksza niz wylosowana liczba. Probuj dalej");
//            } else {
//                System.out.println("Twoja liczba jest mniejsza niz wylosowana liczba. Probuj dalej");
//            }
//            newGame = true;
//        } else {
//            System.out.println("Liczba prob: " + counter + ". Jesli chcesz grac dalej wpisz 1");
//            Scanner replay = new Scanner(System.in);
//
//            if (replay.equals("1")) {
//                counter = 0;
//                newGame = true;
//            } else {
//                newGame = false;
//                System.out.println("Dzieki za gre!");
//            }
//
//        }
//    }
//}
//
//
//
//
