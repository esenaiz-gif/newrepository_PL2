import java.util.*;

class task12_RemoveEvenLength {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Malika", "Nadin", "Aigul", "Kiki", "Nur"
        ));

        names.removeIf(name -> name.length() % 2 == 0);

        System.out.println(names);
    }
}
