package metody;

public class Methods {
    public static void main(String[] args) {

        getAge();

        String myName = "Aleksandra";
        String showMyName = getName(myName);
        System.out.println(showMyName);

        mathOperation(2,2);

        System.out.println(isNumberEven(3));

        System.out.println(isDivisibleBy3and5(14));

        System.out.println(powerOf3(2));

        System.out.println(sqrt(16));

        System.out.println("mozna zbudowac trojkat?: " + triangle(10,4,9));
    }

    //1.Napisz metodę, która zwróci Twój aktualny wiek
    private static int getAge() {
        return 30;
    }

    //2.Napisz metodę, która zwróci Twoje imię
    private static String getName(String name){
        return name;
    }

    //3.Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn
    private static void mathOperation(int number1, int number2){
        int sum = number1 + number2;
        int diff = number1 - number2;
        int product = number1 * number2;
        System.out.println("Suma to: " + sum);
        System.out.println("Roznica to: " + diff);
        System.out.println("Iloczyn to: " + product);
    }

    //4.Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta
    private static boolean isNumberEven (int number) {
        boolean isEven = (number%2) == 0;
        return isEven;
    }

    //5.Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli metoda jest podzielna przez 3 i przez 5
    private static boolean isDivisibleBy3and5(int number){
       boolean idDivisible = ((number % 3 == 0) && (number % 5 == 0));
           return idDivisible;
    }

    //6.Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi
    private static double powerOf3(int number){
        return Math.pow(number,3);
    }

    //7.Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
    private static double sqrt(int number){
        double wynik =  Math.sqrt(number);
        return wynik;
    }

    //8.Napisz metodę, która jako argument przyjmie trzy liczby.
    //Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    private static boolean triangle(int a, int b, int c){
        int max = 0;
        int sum = a+b+c;
        if (a > b)
        {
            if (a > c)
                {max = a;}
            else
                {max = c;}
        }
        else
        {
            if (b > c)
                {max = b;}
            else
                {max = c;}
        }

        return (max < sum-max);
    }
}
