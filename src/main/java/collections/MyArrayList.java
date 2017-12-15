package collections;

import java.util.Arrays;

import static com.google.common.base.Preconditions.checkArgument;

/**
 *
 */
public class MyArrayList<E> implements MyList<E> {

    public static final int DEFAULT_SIZE = 16;
    private E[] elements;
    private int index = 0;

    public MyArrayList(int size) {
        checkArgument(size > 0);
        this.elements = (E[]) new Object[size];
    }

    public MyArrayList() {
        this(DEFAULT_SIZE);
    }

    @Override
    public void add(E object) {
        ensureCapacity();
        elements[index++] = object;
    }

    private void ensureCapacity() {
        if (index >= elements.length) {
            this.elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    @Override
    public E get(int index) {
        checkArgument( index >=0 && index < size());
        return elements[index];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
