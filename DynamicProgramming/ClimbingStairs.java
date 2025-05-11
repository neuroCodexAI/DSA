// Count ways to reach the stair. the person can climb either 1 stair or 2 stair at a time
package DynamicProgramming;

public class ClimbingStairs {

    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {

        int stair = 5;
        System.out.println(stair);
    }
}
