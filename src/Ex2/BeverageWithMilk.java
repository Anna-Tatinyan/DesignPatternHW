package Ex2;

public class BeverageWithMilk extends BeverageDecorator {
    public BeverageWithMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double costs() {
        return beverage.costs() + 0.15;
    }
}
