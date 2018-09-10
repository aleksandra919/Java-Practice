package butelka;


import java.util.HashMap;

public class Butelka {

    private double ileLitrow;
    double pojemnosc;

 /*
    Butelka() {
    }
        domyslny konstruktor ---> jesli nie podamy w petli wartosci ileLitrow {new Butelka()}
        to trzeba stworzyc pusty konstruktor,
        bo po stworzeniu jakiegos konstruktora ten domyslny juz znika
   */

    Butelka(double ileLitrow, double pojemnosc){

        this.ileLitrow = ileLitrow; //KONSTRUKTOR
        this.pojemnosc = pojemnosc;
    }


    double getIleLitrkow(){
        return ileLitrow;
    }

    void wlej(double ilosc){
        if(ilosc <= pojemnosc-ileLitrow) {
            ileLitrow += ilosc;
        }
    }

    void odlej(double ilosc){
        ileLitrow -= ilosc;
    }

    void przelej(double ilosc, Butelka gdziePrzelac) {
        double ileMoznaPrzelac = gdziePrzelac.pojemnosc - gdziePrzelac.ileLitrow;
        boolean ileMoznaOdlac = this.ileLitrow >= ilosc;

        if(ileMoznaPrzelac >= ilosc){
            gdziePrzelac.wlej(ilosc);
            if(ileMoznaOdlac) {
                this.odlej(ilosc);
            } else {
                this.odlej(this.ileLitrow);
            }
        } else {
            gdziePrzelac.wlej(ileMoznaPrzelac);
            this.odlej(ileMoznaPrzelac);
        }

    }

    public static void main (String[] args) {

        // Tworzenie butelek- metoda 1
//        Butelka[] butelka = new Butelka[5]; //NULL /OBIEKT
//        butelka[0] = new Butelka(5, 10);
//        butelka[1] = new Butelka(8, 10);
//        butelka[2] = new Butelka(10, 20);

        // Tworzenie butelek - metoda 2
//          for (int i = 0; i < butelka.length; i++) {
//              butelka[i] = new Butelka();
//        }

        //Tworzenie butelek - metoda 3
        HashMap<Integer, Butelka> butelki = new HashMap <Integer, Butelka>();
        butelki.put(1,new Butelka(5,10));
        butelki.put(2,new Butelka(8,10));
        butelki.put(3,new Butelka(10,20));


        butelki.get(1).wlej(3);
        butelki.get(1).przelej(3, butelki.get(2));
        butelki.get(3).przelej(3, butelki.get(1));

        System.out.println(butelki.get(1).getIleLitrkow());
        System.out.println(butelki.get(2).getIleLitrkow());
        System.out.println(butelki.get(3).getIleLitrkow());
    }
}
