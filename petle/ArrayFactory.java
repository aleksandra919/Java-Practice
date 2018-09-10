package petle;

//Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X większą od zera. Klasa powinna mieć metody:
        //int[] oneDimension - zwróci instancję tablicy jednowymiarowej o długości X,
       // int[][] twoDimension - zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
        // metodę zwracającą macierz jednostkową (jedynki “na przekątnej”)

public class ArrayFactory {
    int dimension;


    public ArrayFactory(int dimension) {
        this.dimension = dimension;
    }

    public int[] buildOneDimension(){
        int[] oneDimension = new int[dimension];
        return oneDimension;
        }


    public int[][] buildTwoDimension(){
        int[][] twoDimension = new int[dimension][dimension];
        return twoDimension;
    }

    public int[][] getIndentityMatrix(){
        int[][] identityMatrix = new int[dimension][dimension];

        for(int i = 0; i< dimension; i++) {
            for(int j = 0; j< dimension; j++) {
                if (i == j){
                    identityMatrix[i][j] = 1;
                }
                System.out.print(identityMatrix[i][j]);
            }
            System.out.println();
        }
        return identityMatrix;
    }
}

