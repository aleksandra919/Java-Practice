package RozneZadania.Other;


public class TemperatureCheck {
    public static void main(String[] args) {
        int temp1 = 10;

       if ( isTemperaturePositiv(temp1)) {
            System.out.println("dodatnia");
        }
        else {
            System.out.println("ujemna");
        }
    }
/**
 * {
 * temp: 23,
 * j:c,
 * data:2018.08.29:20:12:00
 * }
 */
    private static boolean isTemperaturePositiv(double temperature){
        return temperature > 0;
    }

    private static boolean isInRange(double temperature){
        Boolean ret = true;

        if(temperature < 0) {
            ret=false;
        } else if(temperature > 30) {
            ret = false;
        }

        return ret;
    }


    private static boolean isInRange2(double temperature){
        if(temperature < 0) return false;

        if(temperature > 30) return false;

        return true;
    }
}
