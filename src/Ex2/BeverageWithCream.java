package Ex2;

public class BeverageWithCream extends BeverageDecorator {
    public BeverageWithCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double costs() {
        return beverage.costs() + 0.3;
    }
}
