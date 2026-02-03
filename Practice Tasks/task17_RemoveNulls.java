import java.util.*;

class task17_RemoveNulls {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Aisuluu", "Malika", "Akbar", null, "Anara", null, "Karim"
        ));

        students.removeIf(Objects::isNull);

        System.out.println(students);
    }
}
