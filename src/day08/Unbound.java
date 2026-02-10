import java.util.*;

class Unbound{
    public static void print(List<?> list){
        for (Object i : list) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,3,4,5,6,7,8};

        List<Integer>list = Arrays.asList(arr);
        

    }
}