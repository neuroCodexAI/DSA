
// Print number 1 to Nth no.
import java.util.*;

public class Number_Print {
    public static void print_number_n_to_1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print_number_n_to_1(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        print_number_n_to_1(n);
    }
}
