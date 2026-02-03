import java.util.*;

class task11_CommonCountries {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>(Arrays.asList(
                "Japan", "Kyrgyzstan", "Afghanistan", "France"
        ));
        ArrayList<String> c2 = new ArrayList<>(Arrays.asList(
                "Germany", "Afghanistan", "Kyrgyzstan", "Japan"
        ));

        ArrayList<String> common = new ArrayList<>(c1);
        common.retainAll(c2);

        System.out.println(common);
    }
}
