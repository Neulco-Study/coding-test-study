package BOJ_Week10.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10월 13일(화)
// 풀이시간: 10분
public class N과M_15649_김준현_1013 {

	static int N, M;
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb= new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		visited = new boolean[N + 1];

		backtrack(0);
		System.out.print(sb);
	}

	private static void backtrack(int depth) {
		if (depth == M) {
			for (int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;			  // 1. 방문처리
				arr[depth] = i;				  // 2. arr[depth]에 숫자 저장
				backtrack(depth + 1); // 3. 다음 단계 재귀 호출
				visited[i] = false; 	     // 4. 방문 상태 복구
			}
		}
	}
}
