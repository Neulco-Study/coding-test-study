package BOJ_Week9.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10월 9일 수요일
// 풀이시간 25분
public class 동전1_2293_김준현_1009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] coin = new int[n];
		int[] dp = new int[k + 1]; // dp[i] = i원을 만들 수 있는 경우의 수

		for (int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine()); // 1, 2, 5
		}

		dp[0] = 1;

		for (int i = 0; i < n; i++) {
			for (int j = coin[i]; j <= k; j++) {
				dp[j] += dp[j - coin[i]];
			}
		}
		System.out.println(dp[k]);
	}
}
