package Ex1;

public class CollectionIteratorImpl extends CollectionImpl implements CollectionIterator {

    public CollectionIteratorImpl(String[] elements) {
        super(elements);
    }

    @Override
    public boolean hasNext() {
        return hasMoreElements();
    }

    @Override
    public String next() {
        return nextElement();
    }
}
