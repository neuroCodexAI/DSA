// Count ways to reach the stair. the person can climb either 1 stair or 2 stair at a time
package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    // Using recursion
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return countWays(n - 1) + countWays(n - 2);
    }

    // using Memoization
    public static int climbStairs_helper(int n, int[] ways) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (ways[n] != -1) {
            return ways[n];
        }

        ways[n] = climbStairs_helper(n - 1, ways) + climbStairs_helper(n - 2, ways);
        return ways[n];
    }

    public static int climbStairs(int n) {
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);

        return climbStairs_helper(n, ways);
    }

    public static void main(String[] args) {

        int stair = 5;
        System.out.println(countWays(stair));

        System.out.println(climbStairs(stair));

    }
}
