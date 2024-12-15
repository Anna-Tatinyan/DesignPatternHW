package Ex1;

public class Client {

    public static void main(String[] args) {
        CollectionImpl c = new CollectionImpl(new String[]{"elem1", "elem2"});

// We can directly use the class Ex1.CollectionImpl to list all elements
// but we want to use the UI!

// UI is expecting a Ex1.CollectionIterator.
// TODO How can we use a Ex1.CollectionImpl object in the UI?
        CollectionIterator collectionIterator = new CollectionIteratorImpl(new String[]{"elem1", "elem2"});

        CollectionUI ui = new CollectionUI();
        ui.showCollection(collectionIterator);
    }
}