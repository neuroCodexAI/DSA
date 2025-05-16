package DynamicProgramming;

public class Knapsack_0_1 {

    public static int knapsack(int[] val, int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            // include
            int ans = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // exclude

            int ans2 = knapsack(val, wt, W, n - 1);

            return Math.max(ans, ans2);
        } else {
            return knapsack(val, wt, W, n - 1);
        }
    }

    // Using the Memorization techniques
    public static int knapsack_memo(int[] val, int[] wt, int W) {
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        return knapsack_cal_memo(val, wt, W, val.length, dp);
    }

    private static int knapsack_cal_memo(int[] val, int[] wt, int W, int n, int[][] dp) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            // include
            int ans_inc = val[n - 1] + knapsack_cal_memo(val, wt, W - wt[n - 1], n - 1, dp);

            // Exclude
            int ans_exc = knapsack_cal_memo(val, wt, W, n - 1, dp);

            dp[n][W] = Math.max(ans_inc, ans_exc);
            return dp[n][W];

        } else {

            dp[n][W] = knapsack_cal_memo(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        System.out.println(knapsack(val, wt, W, val.length));
        System.out.println(knapsack_memo(val, wt, W));
    }
}
