package lesson2.interfaceexample;

public interface ServiceDB<T> {
    T save(T t);

    T update(T t);

    void devete(T t);
}
