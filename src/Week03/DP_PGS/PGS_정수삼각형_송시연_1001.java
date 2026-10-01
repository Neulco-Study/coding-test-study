package Week03.DP_PGS;

public class PGS_정수삼각형_송시연_1001 {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[] dp = new int[n];
        dp[0] = triangle[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == i) {
                    dp[j] = dp[j - 1] + triangle[i][j];
                } else if (j == 0) {
                    dp[j] += triangle[i][j];
                } else {
                    dp[j] = Math.max(dp[j - 1], dp[j]) + triangle[i][j];
                }
            }
        }

        int answer = 0;
        for (int value : dp) {
            answer = Math.max(answer, value);
        }
        return answer;
    }
}
