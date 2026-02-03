import java.util.*;

public class task2_LongestMovie {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "La Belle Personne", "Scarface", "Casino", "GoodFellas"
        ));

        String longest = movies.get(0);

        for (String m : movies) {
            if (m.length() > longest.length()) {
                longest = m;
            }
        }

        System.out.println("Longest movie title: " + longest);
    }
}
