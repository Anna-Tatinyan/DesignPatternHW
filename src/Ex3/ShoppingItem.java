package Ex3;

public abstract class ShoppingItem extends Element{

    private double price;

    public ShoppingItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
