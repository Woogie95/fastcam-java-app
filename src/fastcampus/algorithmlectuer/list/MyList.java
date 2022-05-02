package fastcampus.algorithmlectuer.list;

public interface MyList<T> {

    void add(T t);

    void insert(int index, T t);

    void clear();

    boolean remove(T t);

    boolean removeByIndex(int index);

    T get(int index);

    int indexOf(T t);

    boolean isEmpty();

    boolean contains(T t);

    int size();
}
