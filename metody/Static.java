package Metody;

public class Static {
    public static void main(String[] args) {
        Klient osoba1 = new Klient("Ala");
        Klient osoba2 = new Klient("Basia");
        Klient osoba3 = new Klient("Czesia");

        System.out.println(osoba1.id);
        System.out.println(osoba2.id);
        System.out.println(osoba3.id);
    }
}


    //METODA STATYCZNA
    class Matematyka {
        static double dodawanie (double a, double b) {
        return a+b;
        }
    }

    class Klient {
        Klient (String imie) { // konstruktor
            this.imie = imie;
            id = kolejneId;
            kolejneId++;
        }

        String imie;
        int id = 0;
        static int kolejneId = 1;
    }

