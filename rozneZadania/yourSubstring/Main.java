package RozneZadania.yourSubstring;
/*
Napisz program ktory pobiera dwie liczby oraz łańcuch znaków  z wiersza z poleceń
(czyli jako parametry przy wywolaniu programu w konsoli) oraz wyswietla fragment podanego łańcucha,
okreslony wprowadzonymi liczbami. Obsluz wszystkie mozliwe wyjatki, ktore moga wystapic w przypadku zlego zestawu argumentow
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby okreslajace ile znakow ma zostac wyciete ze stringa");
    Substring newSubstring = new Substring ("aaOLAabb", 2,5);
        System.out.println(newSubstring.makeYourSubstring());
    }


}
