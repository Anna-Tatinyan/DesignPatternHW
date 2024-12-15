package Ex1;

public class CollectionUI {

    public void showCollection(CollectionIterator collectionIterator) {
        while (collectionIterator.hasNext()) {
            System.out.println(collectionIterator.next());
        }
    }
}