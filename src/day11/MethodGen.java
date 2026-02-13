package day11;

@FunctionalInterface
public interface MethodGen {
    public <T extends Number> T apply(T a,T b);

}
