package day11;

@FunctionalInterface
public interface FunInter<T extends Number> {
    public T apply(T a, T b);
}
