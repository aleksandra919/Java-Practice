package interface2;


import static java.lang.Math.sqrt;

public class Triangle implements Figure {

    int triangleSideLenghtA;
    int triangleSideLenghtB;


    @Override
    public double getPerimeter() {
        double perimeter = 0.5 * triangleSideLenghtA * triangleSideLenghtB;
        return perimeter;
    }

    @Override
    public double getArea() {
        double hypotenuse = sqrt(triangleSideLenghtA^2 + triangleSideLenghtB^2);
        double area = triangleSideLenghtA + triangleSideLenghtB + hypotenuse;
        return Math.floor(area);
    }

    @Override
    public String getName() {
        return "Trójkąt";
    }

    public Triangle(int triangleSideLenghtA, int triangleSideLenghtB) {
        this.triangleSideLenghtA = triangleSideLenghtA;
        this.triangleSideLenghtB = triangleSideLenghtB;
    }
}
