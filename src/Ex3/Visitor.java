package Ex3;

public interface Visitor {
    double calculateVAT(LuxuryFood luxuryFood);
    double calculateVAT(Food food);
}
