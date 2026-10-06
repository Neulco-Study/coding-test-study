package Week03.DP_PGS;

import java.util.HashSet;
import java.util.Set;

public class PGS_N으로표현_송시연_1006 {
    public int solution(int N, int number) {
        @SuppressWarnings("unchecked")
        Set<Integer>[] dp = new Set[9];

        int repeated = 0;
        for (int count = 1; count <= 8; count++) {
            dp[count] = new HashSet<>();
            repeated = repeated * 10 + N;
            dp[count].add(repeated);

            for (int leftCount = 1; leftCount < count; leftCount++) {
                int rightCount = count - leftCount;
                for (int left : dp[leftCount]) {
                    for (int right : dp[rightCount]) {
                        dp[count].add(left + right);
                        dp[count].add(left - right);
                        dp[count].add(left * right);
                        if (right != 0) {
                            dp[count].add(left / right);
                        }
                    }
                }
            }

            if (dp[count].contains(number)) {
                return count;
            }
        }

        return -1;
    }
}
