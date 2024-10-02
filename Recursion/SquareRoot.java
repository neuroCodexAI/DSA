public class SquareRoot {
    // Print x^n (stack height = n)
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPower1 = calcPower(x, n - 1);
        return x * xPower1;
    }

    // Print x^n (with stack height = logn )
    public static int calcPowerLog(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcPowerLog(x, n / 2) * calcPowerLog(x, n / 2);
        } else {
            return calcPowerLog(x, n / 2) * calcPowerLog(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        // stack height = n
        System.out.println(calcPower(x, n));
        // stack height = logn
        System.out.println(calcPowerLog(x, n));
    }
}
