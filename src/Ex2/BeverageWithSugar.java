package Ex2;

public class BeverageWithSugar extends BeverageDecorator {
    public BeverageWithSugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double costs() {
        return beverage.costs() + 0.1;
    }
}
