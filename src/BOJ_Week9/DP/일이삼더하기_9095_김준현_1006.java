package BOJ_Week9.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10월 6일 화요일
// 풀이시간 10분
public class 일이삼더하기_9095_김준현_1006 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[11];

		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		// dp[4] = 7;
		// dp[5] = 13;
		for (int i = 4; i < 11 ; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n]).append("\n");
		}
		System.out.print(sb.toString());
	}
}
