
package obiektyPakiety;

public class Main {
    public static void main(String[] args) {

        // nowy obietk
        Rectangle rect1 = new Rectangle(2,3);

        System.out.println(rect1.getSquare());
        System.out.println(rect1.getPerimeter());
        System.out.println(rect1.getDiagonal());

        MyNumber number1 = new MyNumber(5);
        System.out.println(number1.isOdd());
        System.out.println(number1.isEven());
        System.out.println(number1.getSqrt());
        System.out.println(number1.getPower(2));
        System.out.println(number1.getSum(4));
        System.out.println(number1.getSubstract(3));

    }
}
