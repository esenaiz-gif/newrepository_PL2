import java.util.*;

public class task10_ArrayToList {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(list);
    }
}
