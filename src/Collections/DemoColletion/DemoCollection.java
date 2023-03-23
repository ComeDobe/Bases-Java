package Collections.DemoColletion;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection {
    public static <T> void fromArrayToCollection(T[] arr, List<T> list) {
        for (T element : arr) {
            list.add(element);
        }
    }

    public static void tryWithStrings() {
        String[] arr = {"foo", "bar", "baz"};
        List<String> list = new ArrayList<>();
        fromArrayToCollection(arr, list);
        System.out.println(list);
    }

    public static void tryWithDoubles() {
        Double[] arr = {1.23, 4.56, 7.89};
        List<Double> list = new ArrayList<>();
        fromArrayToCollection(arr, list);
        System.out.println(list);
}
}


