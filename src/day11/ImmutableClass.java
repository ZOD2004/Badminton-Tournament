package day11;


import java.util.ArrayList;
import java.util.List;

// once obj is created it cannot be changed
public final class ImmutableClass {
    private final String name;
    private final String data;
    public ImmutableClass(String name, String data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }
}

