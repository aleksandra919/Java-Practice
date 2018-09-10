package butelka;

class Butelka {
    private double ileLitrow;
    private double pojemnosc;

    //Konstruktor
    Butelka(double ileLitrow, double pojemnosc) {
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
    }

    //Metoda
    double getIleLitrow() {
        return ileLitrow;
    }

    private double getPojemnosc() {
        return pojemnosc;
    }

    boolean wlej(double ilosc)
    {
        if (this.pojemnosc >= (this.ileLitrow +  ilosc))
        {
            this.ileLitrow += ilosc;
        }
        else {
            System.out.println("Nie mozna tyle przelac litrów: " + ilosc);
            return false;
        }

        return true;
    }

    boolean wylej(double ilosc)
    {
        if(ilosc <= ileLitrow)
        {
            this.ileLitrow -= ilosc;
        }
        else
            return false;
        return true;
    }

    //tworze zmienna typu Butelka
    void przelej(double ilosc, Butelka gdziePrzelac)
    {
            if(this.wylej(ilosc))
            {
                if (!(gdziePrzelac.wlej(ilosc)))
                {
                    System.out.println("Mozna przelac litrów: " + (this.pojemnosc - this.ileLitrow -  ilosc));
                }

            }
    }

    public static void main (String[] args){
        Butelka[]  butelka = new Butelka[10];

//        butelka[0] = new Butelka(2, 6 );
//        butelka[1] = new Butelka(8, 12);
//        butelka[2] = new Butelka(10, 20);

        for (int i=0; i<10; i++)
        {
            butelka[i] = new Butelka(i +2, i+ 4 );
        }

        butelka[0].wlej(1);
        butelka[2].przelej(4, butelka[0]);


        System.out.println(butelka[0].getPojemnosc());
        System.out.println(butelka[0].getIleLitrow());

        System.out.println(butelka[2].getPojemnosc());
        System.out.println(butelka[2].getIleLitrow());
    }


}
