package Week03.DP_PGS;

public class PGS_거스름돈_송시연_1010 {
    private static final int MOD = 1_000_000_007;

    public int solution(int n, int[] money) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int coin : money) {
            for (int amount = coin; amount <= n; amount++) {
                int count = dp[amount] + dp[amount - coin];
                dp[amount] = count % MOD;
            }
        }

        return dp[n];
    }
}
