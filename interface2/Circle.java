package interface2;


public class Circle implements Figure{

    int circleRadius;

    @Override
    public double getPerimeter() {
        double perimeter = 2 * circleRadius * 3.14;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = circleRadius * 3.14;
        return area;
    }

    @Override
    public String getName() {
        return "Koło";
    }

    //konsruktor
    public Circle (int circleRadious) {
        this.circleRadius = circleRadious;
    }
}
