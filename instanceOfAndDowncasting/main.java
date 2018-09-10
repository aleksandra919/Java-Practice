package instanceOfAndDowncasting;

public class main {
    public static void main(String[] args) {

        Osoba [] osoba = new Osoba[4]; // to nie jest konstruktor z klasy abstrakcyjnej, zarezerwowanie miejsca
        osoba[0] = new Pracownik ("Ola", "Nowak", 10000);
        osoba[1] = new Student ("Kamil", "Kowalski");

//        osoba[0].pobierzOpis();
//        osoba[1].pobierzOpis();

/*INSTANCE OF
        for(int i = 0; i < osoba.length; i++){
            if(osoba[i] instanceof Osoba)
                osoba[i].pobierzOpis();
            else
                break;
        }
*/

//DOWNCASTING - RZUTOWANIE W DOL
        for(Osoba item: osoba) {
            if(item instanceof Pracownik) {
                ((Pracownik)item).pracuj();
            }
        }
    }
}

    abstract class Osoba {
        String imie;
        String nazwisko;

        //konstruktor
        Osoba( String imie, String nazwisko){
            this.imie = imie;
            this.nazwisko = nazwisko;}

        //abstrakcyjna metoda
        abstract void pobierzOpis();
    }


    class Pracownik extends Osoba {
        double wynagrodzenie;

        //konstruktor
        Pracownik( String imie, String nazwisko, double wynagrodzenie){
            super(imie, nazwisko);
            this.wynagrodzenie = wynagrodzenie;
        }

        @Override
        void pobierzOpis() {
            System.out.println("Pracownik: " + imie + " " + nazwisko);
            System.out.println("Wynagrodzenie: " + wynagrodzenie);
        }

        void pracuj() {
            System.out.println("Pracuje!");
        }
    }


    class Student extends Osoba {

        //konstruktor
        Student( String imie, String nazwisko) {
            super(imie, nazwisko);
        }

        @Override
        void pobierzOpis() {
            System.out.println("Student " + imie + " " + nazwisko );
        }
    }
