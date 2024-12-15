package Ex2;

public class Client {
    public static void main(String[] args) {
        Coffee cf = new Coffee();
        Decaf df = new Decaf();
        Beverage cfWithCreamAndSugar = new BeverageWithCream(new BeverageWithSugar(cf));
        System.out.println(cf.getDescription() + " " + cfWithCreamAndSugar.costs());
        Beverage dfWithCreamAndSugar = new BeverageWithCream(new BeverageWithSugar(df));
        System.out.println(df.getDescription() + " " + dfWithCreamAndSugar.costs());
    }
}
