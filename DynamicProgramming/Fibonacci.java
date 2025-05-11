package DynamicProgramming;

public class Fibonacci {
    // find the fibonacci nth no using Memorization techniques
    public static int fibonacciMemo(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fibonacciMemo(n - 1, dp) + fibonacciMemo(n - 2, dp);
        return dp[n];
    }

    public static int fibonacciMemo(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = 0;
        }
        return fibonacciMemo(n, dp);
    }

    // find the fibonacci nth no using Tabulation techniques
    public static int fibonacciTabu(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciMemo(7));
        System.out.println(fibonacciTabu(7));
    }
}
