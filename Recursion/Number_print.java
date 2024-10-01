
// Print number 1 to Nth no.
import java.util.*;

public class Number_Print {
    // print number N to 1 number
    public static void print_number_n_to_1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print_number_n_to_1(n - 1);
    }

    // print number 1 to number
    public static void print_number_1_to_N(int n) {
        if (n == 0) {
            return;
        }
        print_number_1_to_N(n - 1);
        System.out.println(n);
    }

    // Print table of Nth number
    public static void table(int n, int m) {
        if (m == 10) {
            System.out.println(n * m);
            return;
        }
        System.out.println(n * m);

        table(n, m + 1);
    }

    // Print sum of first n natural number
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    // Calculate factorial for Nth.
    public static int calFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * calFact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("------------Print 1 to Nth no----------------");
        print_number_1_to_N(n); // print 1 to 5;
        System.out.println("------------Print Nth to 1 no----------------");
        print_number_n_to_1(n); // print 5 to 1;
        System.out.println("------------Print Nth no table ----------------");
        table(n, 1); // print table of 5;
        System.out.println("----Print sum of first n natural number --------");
        printSum(1, n, 0);
        System.out.println("------------Calculate factorial for Nth.----------------");
        System.out.println(calFact(n));
    }
}
