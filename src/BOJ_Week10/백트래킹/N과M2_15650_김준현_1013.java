package BOJ_Week10.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10/13(화)
// 조합
// 풀이시간 : 15분
public class N과M2_15650_김준현_1013 {

	static int N;
	static int M;
	static int[] arr;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
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

		for (int i = start; i <= N; i++) { // 중복 방지를 위해 start부터 검색
			arr[depth] = i;
			backtrack(i + 1, depth + 1);
		}

	}
}
