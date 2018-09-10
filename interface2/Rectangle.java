package interface2;


public class Rectangle implements Figure{

    int retangleSideLenghtA;
    int retangleSideLenghtB;

    @Override
    public double getPerimeter() {
        double perimeter = retangleSideLenghtA * retangleSideLenghtB;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = 2 * (retangleSideLenghtA + retangleSideLenghtB);
        return area;
    }

    @Override
    public String getName() {
        return "Prostokąt";
    }

    public Rectangle(int retangleSideLenghtA, int retangleSideLenghtB) {
        this.retangleSideLenghtA = retangleSideLenghtA;
        this.retangleSideLenghtB = retangleSideLenghtB;
    }
}
