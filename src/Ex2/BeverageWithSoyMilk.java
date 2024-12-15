package Ex2;

public class BeverageWithSoyMilk extends BeverageDecorator {
    public BeverageWithSoyMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double costs() {
        return beverage.costs() + 0.2;
    }
}
