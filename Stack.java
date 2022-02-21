/**
 * Created by LAB on 1/24/2022.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}
