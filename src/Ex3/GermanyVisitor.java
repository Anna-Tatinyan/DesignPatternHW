package Ex3;

public class GermanyVisitor implements Visitor {
    @Override
    public double calculateVAT(LuxuryFood luxuryFood) {
        return luxuryFood.getPrice() * 0.19;
    }

    @Override
    public double calculateVAT(Food food) {
        return food.getPrice() * 0.07;
    }
}
