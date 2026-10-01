package BOJ_Week4.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 0929 화요일
// 풀이시간: 25분
// hashmap
public class 패션왕신해빈_김준현_0929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int type = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < type; i++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();

			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String category = st.nextToken();

				// category가 몇 번 나왔는지 저장
				map.put(category, map.getOrDefault(category, 0) + 1);
			}
			int answer = 1;
			for (int count : map.values()) {
				answer *= (count + 1); // 각 종류의 (옷 개수 + 안 입는 경우)를 곱하기
			}
			answer -= 1; // 아무것도 안 입은 경우 하나 제거

			sb.append(answer).append("\n"); // 결과 출력
		}
		System.out.println(sb);

	}
}
