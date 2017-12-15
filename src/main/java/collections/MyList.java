package collections;

/**
 *
 */
public interface MyList<E> {

    void add(E object);

    E get(int index);

    int size();

    boolean isEmpty();
}
