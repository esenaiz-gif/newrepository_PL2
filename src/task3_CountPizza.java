import java.util.*;

public class task3_CountPizza {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>(Arrays.asList(
                "Pizza", "Pizza", "Potato", "Pizza", "Pizza", "Pizza"
        ));

        int count = 0;
        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }

        System.out.println("Pizza count: " + count);
    }
}
