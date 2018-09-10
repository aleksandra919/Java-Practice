package tablice;

import java.util.Arrays;


public class Tables {

    //1.Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę
    public static int getTableSum(int a, int b) {
        int[] table2 = new int[2];
        int sum = 0;
        table2[0] = a;
        table2[1] = b;

        for(int i = 0; i< table2.length; i++) {
            sum += table2[i];
        }
        return sum;
    }

    //2.Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę
    public static int getMax(int a, int b, int c){
        int array[] = new int[]{a,b,c};
        int max = Arrays.stream(array).max().getAsInt();
        return max;
    }

    //3.Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu
    public static char[] getCharFromAlpha() {
        char[] alpha = new char[5];

        for (int i = 0; i < 5; i++) {
            alpha[i] = (char)(97 + i);
        }
        return alpha;
    }

    //4.Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności
    public static int[] getReverseArray(int a, int b, int c){
        int array[] = new int[]{a,b,c};
        int reverseArray[] = new int[3];
        int j = 0;
            for(int i = array.length-1; i>= 0; i--){
                reverseArray[j] = array[i];
                j= j+1;
            }
        return reverseArray;
    }
}
