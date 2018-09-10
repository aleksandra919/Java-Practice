package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {

        Potwor potwor = new Potwor(10, 100);

        Szkielet szkielet = new Szkielet(30, 50, "Luk"); // zeby moc stworzyc nowy obiekt z wartosciami nalezy sstowrzyc konstruktor takze w klasie szkielet
        System.out.println(szkielet.predkoscChodzenia);
        //System.out.println(szkielet.typBroni);

        szkielet.atakuj();

        Zombie zombie = new Zombie();

        Potwor potworPolimorfizm = new Szkielet(10,100);
        /*
            POLIMORFIZM
                stworzona jest instancja i szkieleta i potwora
                mozemy wskazywac z pomoca klasy bazowej(potwor) na klasy typu pochodnego(szkielet. zombie) - rodzic wskazuje na dziecko
         */

    }
}
