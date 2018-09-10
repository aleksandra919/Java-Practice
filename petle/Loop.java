package petle;


import java.util.Arrays;

public class Loop {

    // Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10
    public static void getNumbersFrom20to10(){
        for(int i= 20; i>=10; i--){
            System.out.println(i);
        }
    }
    // Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.
    public static void getNumbersFrom10to20(){
        for(int i =10; i<=20; i++){
            System.out.println(i);
        }
    }

    // Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40
    public static void getOddNumbers(){
        for(int i = -10; i<=40; i++){
            if(i%2 != 0){
                System.out.println(i);
            }

        }
    }
    //Przerób pętlę z zadania trzeciego na pętlę while
    public static void getNumbersLoopWhile(){
        int i = -10;
        while(i<40){
            if(i%2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
    public static int getSumOfArray(int[] arr){
        int sum = 0;

        for(int index: arr){
            sum += index;
        }
        return sum;
    }

    //Przerób funkcję z zadania piątego tak, żeby metoda przymowała tablicę dwuwymiarową typu int[][].
    public static int getSumOfArray2(int[][] arr2) {
        int sum = 0;

        for(int i = 0; i< arr2.length; i++){
            for(int j=0; j< arr2.length; j++) {
                sum += arr2[i][j];
            }
        }
        return sum;
    }

    //Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X
    public static void displayNumbersToX(int x){
        for(int i = 0; i<=x; i++){
            System.out.println(i);
        }
    }
    // Przerób powyzsza metodę na while
    public static void displayNumberToXWhileLoop(int x){
        int i =0;
        while(i <= x){
            System.out.println(i);
            i++;
        }
    }

    //Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry
    // (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),

    public static void divideAndReverseNumber (int number){
        while (number > 0) {
            System.out.println(number % 10);
            number = number / 10;
        }
    }

    //Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.
    // Na przykład “pies” przekształci w “seip”

    public static void reverseString(String word) {
        String[] splittedWord = word.split("(?!^)");
        for(int i = word.length()-1; i >= 0; i--){
            System.out.print(splittedWord[i]);
        }
    }
    public static void reverseString2(String word2) {
        String reverse = new StringBuffer(word2).reverse().toString();
        System.out.println(reverse);
    }

    //Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem.
    // Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie

    public static boolean isPalindrom(String string)
    {
        String reverse = new StringBuffer(string).reverse().toString();
        return reverse.equals(string);
    }

    //Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”
    public static void getNumbersAndDisplay(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    // Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do największej liczby.
    // Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.
    public static void sortArray(int[] numbers) {
        Arrays.sort(numbers);
        for(int number: numbers) {
            System.out.print(number);
        }
    }
}
