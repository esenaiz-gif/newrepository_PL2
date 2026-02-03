import java.util.*;

public class task8_RemoveAnimalDuplicates {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList(
                "Panda", "Panda", "Cat", "Cat", "Dog", "Cat", "Duck"
        ));

        HashSet<String> unique = new HashSet<>(animals);
        ArrayList<String> result = new ArrayList<>(unique);

        System.out.println(result);
    }
}
