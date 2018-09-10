package dziedziczenie.potwory;

public class Szkielet extends Potwor{

    String typBroni; //tworzymy typBroni tylko w szkielecie

    public void atakuj(){

        super.atakuj(); // mozemy wywolac to co jest w bazowej metodzie i dodatkowo inne rzeczy nadpisane w tej metodzie
        /*
            dodatkowe metody atakujace dla Szkieleta
        */

        System.out.println("Metoda atakuj z klasy Szkielet"); //metoda z klasy potwor jest nadpisana(override)
    }

    public Szkielet(){
        System.out.println("Domyslny konstruktor szkielet");
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc) { //jesli nie chcemy zeby zawsze obiekt byl z typem broni, mozna stworzyc kolejny konstruktor
        super(predkoscChodzenia, zywotnosc);
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni){
    /*
        zamiast przypisania wartosci mozemy przekazac je do rodzica/superkonstruktora
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
    */
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
    }
}
