import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class task1_MergeBooks {
    public static void main(String[] args) {
        ArrayList<String> books1 = new ArrayList<>(Arrays.asList
                ("And the Mountains Echoed", "A Thousand Splendid Suns", "The Kite Runner"));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList
                ("The First Teacher", "Jamila", "The Day Lasts More than a Hundred Years"));

        HashSet<String> merged = new HashSet<>();
        merged.addAll(books1);
        merged.addAll(books2);

        System.out.println(merged);
    }
}