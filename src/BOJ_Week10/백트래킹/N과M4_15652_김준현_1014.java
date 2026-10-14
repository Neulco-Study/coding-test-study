package BOJ_Week10.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10/14(수)
// 중복조합
// 풀이시간 : 10분
public class N과M4_15652_김준현_1014 {

	static int N, M;
	static StringBuilder sb;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 3
		M = Integer.parseInt(st.nextToken()); // 1
		arr = new int[M];
		sb = new StringBuilder();

		backtrack(1, 0);
		System.out.print(sb);
	}

	private static void backtrack(int start, int depth) {
		if (depth == M) {
			for (int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i <= N; i++) {
			arr[depth] = i;
			backtrack(i, depth + 1); // 중복 선택이 허용되어서 i+1 이 아니라 i부터 탐색
		}
	}

}

