package dziedziczenie.potwory;

public class Potwor {

    public double predkoscChodzenia = 10; //trzeba zrobic publiczne zeby miec dostep z klasy dziedziczenie
    public double zywotnosc;

    void atakuj(){
        /*
            bazowe insrukcje atakuj
         */
        System.out.println("Metoda atakuj z klasy potwor");
    }

    public Potwor() {
        System.out.println("Domyslny konstruktor klasy Potwor");
    }

    public Potwor(double predkoscChodzenia, double zywotnosc){
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Niedomyslny konstruktor z klasy potwor");
    }
}


