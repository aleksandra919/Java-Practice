package RozneZadania.Other;

import java.util.Scanner;

class UsersArr {
    public static void main(String[] args) {

        String arrUsers[] = new String [3];
        String arrSplited[][] = new String [3][3];
        int userId =1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj 3 imion z nazwiskami");

        for(int i = 0; i < 3; i++) {
            arrUsers[i] = scanner.nextLine();
            arrSplited[i][0]= String.valueOf(arrUsers[i].split(" ")[0]);
            arrSplited[i][1]= String.valueOf(arrUsers[i].split(" ")[1]);
        }

        for (int i = 0 ; i < 3; i++) {
            System.out.println("Uzytkownik " + userId + ": " + "imie: " + arrSplited[i][0] + " ,nazwisko: "+ arrSplited[i][1]);
            userId++;
        }

    }
}
