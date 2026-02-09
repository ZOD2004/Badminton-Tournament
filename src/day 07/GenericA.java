package day07;

public class GenericA<T> {
	
    T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    
    //can invoke methods defined in the bounds by extending
    public <A extends Number, B extends Number> double add(A a, B b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException();
        }
        return a.doubleValue()+b.doubleValue();
    }
}
