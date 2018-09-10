//Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
// Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.

package obiektyPakiety;
//klasa
public class Rectangle {
    private int length;
    private int width;

    //konstruktor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }



    //metoda
    public int getSquare() {
        return width*length;
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getDiagonal() {
        return Math.sqrt(length ^ 2 * width ^ 2);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

