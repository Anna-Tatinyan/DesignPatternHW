package Ex2;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double costs() {
        return 1.2;
    }
}
