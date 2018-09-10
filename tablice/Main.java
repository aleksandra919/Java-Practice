package tablice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Zad1
        System.out.println(Tables.getTableSum(2, 7));

        //Zad2.
        System.out.println(Tables.getMax(2, 7,3));

        //Zad3.
        char[] array = Tables.getCharFromAlpha(); //obtain the array
        System.out.println(Arrays.toString(array)); //print it

        //Zad4.
        int[] reverseArray = Tables.getReverseArray(2,5,4);
        System.out.println(Arrays.toString(reverseArray));
    }
}
