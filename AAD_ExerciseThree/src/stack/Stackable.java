package stack;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public interface Stackable<T> {
    /**
     *
     * @param data
     */
    void push(T data);

    /**
     *
     * @return
     */
    T pop();

    /**
     *
     * @return
     */
    T peek();

    /**
     *
     * @return
     */
    int getSize();

    /**
     *
     * @return
     */
    boolean isEmpty();

    /**
     *
     */
    void clear();

    /**
     *
     */
    void print();
}
