package RozneZadania.Other;
import java.util.Scanner;

public class Metody {
    //TABLICZKA MNOZENIA
    public static void multiplication(int x, int y)
    {
        for(int i= 1; i <= x; i++)
        {
            if( i == 3 )
                break;
            for(int j = 1; j <= y; j++)
            {
                if( j == 4)
                    break;
                System.out.print(i*j + "  ");
            }
            System.out.println();
        }
    }

    //WYSWIETLA CIAG CYFR DLUGOSCI PODANEJ PRZEZ UZYTKOWNIKA
    public static void ElementsArr()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow n");

        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    //DODAWANIE LICZB Z PODANEJ TABLICY - [ENHANCED FOR]
    public static int tabSum (int [] tab)
    {
        int sum = 0;
        for(int value: tab)
        {
            sum += value;
        }
        System.out.println(sum);
        return sum;

    }
}