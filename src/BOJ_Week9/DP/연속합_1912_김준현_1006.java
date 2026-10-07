package BOJ_Week9.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 10월 6일 화요일
// 풀이시간 30분
public class 연속합_1912_김준현_1006 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n]; // dp[i]는 i번째까지의 최대 연속합
		// 반드시 i번째 숫자를 포함하고, i번째에서 끝나는 연속 부분 수열의 최대 합

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		int answer = dp[0]; // 배열 전체에서 발견한 최대 연속합

		for (int i = 1; i < n; i++) {
			// 이전 연속합에 현재 숫자를 더할까? 아니면 현재 숫자부터 새롭게 시작할까?
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]); // i번째에서 끝나는 최대 연속합
			answer = Math.max(answer, dp[i]); // answer 와 dp[i] 중 더 큰 값으로 answer 갱신
		}
		System.out.println(answer);
	}
}
