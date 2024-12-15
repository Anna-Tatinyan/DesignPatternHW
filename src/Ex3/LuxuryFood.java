package Ex3;

public class LuxuryFood extends ShoppingItem {

    public LuxuryFood(double price) {
        super(price);
    }

    @Override
    public double accept(Visitor v) {
        return v.calculateVAT(this);
    }
}
