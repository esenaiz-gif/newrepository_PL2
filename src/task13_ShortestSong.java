import java.util.*;

class task13_ShortestSong {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>(Arrays.asList(
                "Umbrella", "Love on the Brain", "Loud", "Talk that Talk"
        ));

        String shortest = songs.get(0);

        for (String s : songs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        System.out.println(shortest);
    }
}
