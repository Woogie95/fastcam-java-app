package fastcampus.algorithmlectuer.stack;

public interface IStack<T> {
    void push(T data);

    T pop();

    T peek();

    int size();

}
