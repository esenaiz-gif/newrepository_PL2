import java.util.*;

public class task4_RemoveBanana {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Banana", "Apple", "Banana", "Banana", "Banana", "Apple"
        ));

        fruits.removeIf(fruit -> fruit.equals("Banana"));

        System.out.println(fruits);
    }
}
