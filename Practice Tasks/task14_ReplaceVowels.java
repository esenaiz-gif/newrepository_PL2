import java.util.*;

class task14_ReplaceVowels {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Hello", "World"
        ));

        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[AEIOUaeiou]", "*"));
        }

        System.out.println(words);
    }
}
