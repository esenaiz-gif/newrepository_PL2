import java.util.*;

public class task6_CheckSublist {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<>(Arrays.asList(
                "Ice Skating", "Basketball", "Football", "Tennis"
                ));

        ArrayList<String> check = new ArrayList<>(Arrays.asList(
                "Football", "Tennis"
        ));

        boolean result = sports.containsAll(check);

        System.out.println(result);
    }
}
