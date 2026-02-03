import java.util.*;

public class task7_RoseIndex {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList(
                "Rose", "Lilac bush", "Iris", "Lotus", "Rose"
        ));

        System.out.println("First index: " + flowers.indexOf("Rose"));
        System.out.println("Last index: " + flowers.lastIndexOf("Rose"));
    }
}
