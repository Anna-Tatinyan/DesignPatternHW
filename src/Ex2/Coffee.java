package Ex2;


public class Coffee extends Beverage {

    public Coffee() {
        description = "House Blend Coffee";
    }

    @Override
    public double costs() {
        return 1.1;
    }
}
