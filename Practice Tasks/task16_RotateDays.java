import java.util.*;

class task16_RotateDays {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));

        Collections.rotate(days, 2);

        System.out.println(days);
    }
}
