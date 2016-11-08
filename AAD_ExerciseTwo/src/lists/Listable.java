package lists;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public interface Listable<T> {

    void add(T data);

    void remove(int index);

    T get(int index);

    void clear();

    boolean isEmpty();

    int getLength();

    void printAll();

    void insertAt(int index, T data);

}
