import java.util.*;

class task18_SecondLongestMovie {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "La Belle Personne", "Scarface", "Casino", "GoodFellas"
        ));

        movies.sort(Comparator.comparingInt(String::length).reversed());

        System.out.println(movies.get(1));
    }
}
