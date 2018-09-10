package metody;

public class Methods2 {
    public static void main(String[] args) {

        Test a = new Test(); //OBIEKT
        a.wypisz();

        int wynik = a.dodaj(10,20);
        System.out.println(wynik);

        double wynikDzielenie = a.dzielenie(4,2);
        System.out.println(wynikDzielenie);

        double wynikMatematyka = Matematyka.dodawanie(10,20);
        System.out.println(wynikMatematyka);
    }
}

    class Test { //KLASA

        void wypisz(){ //METODA
            System.out.println("test");
        }
        int  dodaj(int a, int b){
            return 5;
        }
        double dzielenie (int a, int b) {
            if( b == 0)
                return 0;
            return a/b;
        }
    }

