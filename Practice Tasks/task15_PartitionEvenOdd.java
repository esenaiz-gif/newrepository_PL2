import java.util.*;

class task15_PartitionEvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6
        ));

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
