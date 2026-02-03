import java.util.*;

class task20_NestedArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> Department1 = new ArrayList<>(Arrays.asList(
                "Aisuluu", "Kamila", "Akbar", "Karim"
        ));
        ArrayList<String> Department2 = new ArrayList<>(Arrays.asList(
                "Aliya", "Anara", "Kanykei", "Malika"
        ));

        departments.add(Department1);
        departments.add(Department2);

        System.out.println(departments);
    }
}
