package BOJ_Week9.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10월 6일 화요일
// 풀이시간 30분
public class 일로만들기_1463_김준현_1006 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// dp[i] = 숫자 i를 1로 만드는 최소 연산 횟수
		int[] dp = new int[N + 1];

		// 초기값
		dp[1] = 0;

		// 점화식
		for (int i = 2; i <= N; i++) {
			// 1 빼기
			dp[i] = dp[i - 1] + 1;

			// 2로 나누기
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}

			// 3으로 나누기
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}

		}
		// 정답
		System.out.println(dp[N]);

	}
}
