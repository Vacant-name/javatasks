package leetCode.N70_ClimbingStairs;

public class ClimbingStairs {
    int n = 5;
    int[] count = new int[n + 1];
    int result;

    int solve() {
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i <= n; i++) {
            count[i] = count[i - 1] + count[i - 2];
            result = count[i];
        }

        System.out.println(result);
        return result;
    }
}
