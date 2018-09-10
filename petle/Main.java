package petle;

public class Main {
    public static void main(String[] args) {
        //Loop.getNumbersFrom20to10();
        //Loop.getNumbersFrom10to20();
        //Loop.getOddNumbers();
        //Loop.getNumbersLoopWhile();

        int [] arr = new int[] {1,2,3,4,7,2};
        //System.out.println(Loop.getSumOfArray(arr));

        int [][] arr2 = {
                {1,1,1},
                {2,2,2},
                {1,1,1},
        };
        //System.out.println(Loop.getSumOfArray2(arr2));

        //Loop.displayNumbersToX(4);
        //Loop.displayNumberToXWhileLoop(2);

        ArrayFactory newArray = new ArrayFactory(3);
       // newArray.buildTwoDimension();
       //newArray.buildTwoDimension();
        newArray.getIndentityMatrix();

        //Loop.divideAndReverseNumber(153);

        //Loop.reverseString("Hello");
        System.out.println();
       // Loop.reverseString2("Magda");

       //System.out.println(Loop.isPalindrom("kajak"));
       //System.out.println(Loop.isPalindrom("cos"));

        int [] numbers = new int[] {1,2,3};
       //Loop.getNumbersAndDisplay(numbers);

        int [] numbersToSort = new int[] {1,9,3,6,4};
        Loop.sortArray(numbersToSort);
    }
}