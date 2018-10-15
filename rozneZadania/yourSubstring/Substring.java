package RozneZadania.yourSubstring;


public class Substring {
    String string;
    int a;
    int b;

    public Substring( String string, int a, int b) {
        this.string = string;
        this.a = a;
        this.b = b;
    }
    public String makeYourSubstring () {

        if (a >4) {
            throw new IllegalArgumentException("wrong number");
        }

        return string.substring(a, b);
    }

}

