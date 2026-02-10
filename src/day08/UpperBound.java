import java.util.*;

class UpperBound {
    public static double addList(List<? extends Number> list) {
        double ans = 0;
        for (Number i : list) {
            ans += i.doubleValue();
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> intList;
        intList = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Int List" + addList(intList));

        List<Double> doubleList;
        doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 1.2d, 2.3d, 3.5d);
        System.out.println("Double List" + addList(doubleList));
    }
}
