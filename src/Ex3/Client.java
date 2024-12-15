package Ex3;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Food(2));
        cart.addItem(new Food(3));
        cart.addItem(new LuxuryFood(4));
        cart.addItem(new LuxuryFood(5));
        Visitor germanyVisitor = new GermanyVisitor();
        System.out.println(cart.accept(germanyVisitor));
        Visitor italyVisitor = new ItalyVisitor();
        System.out.println(cart.accept(italyVisitor));
    }
}
