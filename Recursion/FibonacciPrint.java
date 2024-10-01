public class FibonacciPrint {
    // Print fibonacci Squence using recursion
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

    // print fibonacci squence using loop
    public static void printFibo(int a, int b, int n) {
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < (n - 2); i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;
        System.out.println("-------Using recursion to print fibonacci squence -----");
        System.out.println(a);
        System.out.println(b);

        printFib(a, b, n - 2);
        System.out.println("-------Using loop to print fibonacci squence -----");
        printFibo(a, b, n);

    }
}
