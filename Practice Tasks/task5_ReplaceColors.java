import java.util.*;

public class task5_ReplaceColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
                "Blue", "Blue", "Blue", "Golden"
        ));

        Collections.fill(colors, "Black");

        System.out.println(colors);
    }
}
