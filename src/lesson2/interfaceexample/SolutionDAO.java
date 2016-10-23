package lesson2.interfaceexample;

public class SolutionDAO<T> implements ServiceDB<T> {
    @Override
    public T save(T t) {
        System.out.println("saved");
        return t;
    }

    @Override
    public T update(T t) {
        System.out.println("updated");
        return t;
    }

    @Override
    public void devete(T t) {
        System.out.println("deleted");
    }
}
