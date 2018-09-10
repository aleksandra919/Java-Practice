package interface;

/**
 * Created by c321147 on 2018-06-21.
 */
public class Multiplication implements Computation {
    @Override
    public double compute(double argument1, double argument2){
        return argument1 * argument2;
    }
}
