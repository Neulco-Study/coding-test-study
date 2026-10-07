package BOJ_Week9.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10월 7일 수요일
// 풀이시간 30분
public class 카드구매하기_11052_김준현_1007 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
		int[] arr = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = 0;
		for (int i = 1; i <= N ; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.max(dp[i], dp[i - j] + arr[j]);
			}
		}
		System.out.println(dp[N]);
	}
}
// 현재 상태를 만드는 마지막 선택이 여러 개라면, 그 선택들을 전부 순회하면서 최적값을 찾는다
/*
 * arr[i] : i장짜리 카드팩 가격
 * dp[i] : i장의 카드를 사기 위한 최대 금액
 * N개의 카드를 갖기 위해 지불해야 하는 최대금액을 출력하는 문제
 */

/*
* 카드 4장을 살 때
* 마지막에 살 수 있는 카드백은
* 1장팩, 2장팩, 3장팩, 4장팩인데 각각을 마지막 선택으로 잡으면
* dp[3] + arr[1], dp[2] + arr[2], dp[1] + arr[3], dp[0] + arr[4]
* 위 4개 중 최대값이 dp[4]가 된다.
* dp[i - j] + arr[j] : 이미 i - j 장을 최적으로 구매했고, 마지막으로 j장짜리 카드팩 하나를 산다
* (i - j) + j = i장
* */