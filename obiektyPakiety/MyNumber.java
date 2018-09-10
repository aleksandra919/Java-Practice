package obiektyPakiety;

/*Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
        MyNumber isOdd() - true jeśli atrybut jest nieparzysty,
        MyNumber isEven() - true jeśli atrybut jest parzysty,
        MyNumber sqrt() - pierwiastek z atrybutu,
        MyNumber pow(MyNumber x) - atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
        MyNumber add(MyNumber x) - zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
        MyNumber subtract(MyNumber x) - zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
*/

public class MyNumber {
    int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isOdd(){
        return (number % 2 != 0);
    }

    public boolean isEven(){
        return (number % 2 == 0);
    }

    public double getSqrt(){
        return Math.sqrt(number);
    }

    public double getPower(int x){
        return Math.pow(number, x);
    }

    public double getSum(int x){
        return Math.addExact(number, x);
    }

    public double getSubstract(int x){
        return Math.subtractExact(number, x);
    }


}
