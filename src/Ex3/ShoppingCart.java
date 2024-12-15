package Ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShoppingCart extends Element {

    private final Collection<ShoppingItem> items = new ArrayList<ShoppingItem>();

    public void addItem(ShoppingItem item) {
        items.add(item);
    }

    public Collection<ShoppingItem> getItems() {
        return Collections.unmodifiableCollection(items);
    }

    @Override
    public double accept(Visitor v) {
        double result = 0;
        for (ShoppingItem item : items) {
            result += item.accept(v);
        }
        return result;
    }
}
