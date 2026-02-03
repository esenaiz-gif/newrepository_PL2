import java.util.*;

public class task9_ListToArray {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
                "Bishkek", "NYC", "Tashkent"
        ));

        String[] cityArray = cities.toArray(new String[0]);

        System.out.println(Arrays.toString(cityArray));
    }
}
