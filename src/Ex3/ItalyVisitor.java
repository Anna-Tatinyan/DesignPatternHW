package Ex3;

public class ItalyVisitor implements Visitor {
    @Override
    public double calculateVAT(LuxuryFood luxuryFood) {
        return luxuryFood.getPrice() * 0.22;
    }

    @Override
    public double calculateVAT(Food food) {
        return food.getPrice() * 0.01;
    }
}
