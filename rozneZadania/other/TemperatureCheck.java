package rozneZadania.other;

/**
 * Created by c321147 on 2018-06-05.
 */
public class TemperatureCheck {
    public static void main(String[] args) {
        int temp1 = 10;

        isTemperaturePositiv(temp1);
    }

    private static boolean isTemperaturePositiv(double temperature){
        boolean isPositive = temperature > 0;

        if (isPositive) {
            System.out.println("dodatnia");
        }
        else {
            System.out.println("ujemna");
        }
        return isPositive;
    }
}
