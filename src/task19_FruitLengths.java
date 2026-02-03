import java.util.*;

class task19_FruitLengths {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Banana", "Apple", "Banana", "Banana", "Banana", "Apple"
        ));

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String f : fruits) {
            lengths.add(f.length());
        }

        System.out.println(lengths);
    }
}
