package Ex3;

public class Food extends ShoppingItem {

    public Food(double price) {
        super(price);
    }

    @Override
    public double accept(Visitor v) {
        return v.calculateVAT(this);
    }
}

