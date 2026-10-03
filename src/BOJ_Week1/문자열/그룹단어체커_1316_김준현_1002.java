package BOJ_Week1.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10월 2일 금요일
// 풀이시간: 20분
public class 그룹단어체커_1316_김준현_1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String str = br.readLine();

			boolean[] visited = new boolean[26]; // 알파벳이 이전에 등장했는지 체크 배열
			boolean isGroupWord = true; // 현재 단어가 그룹 단어인지 체크 변수

			char prev = str.charAt(0); // 첫 글자를 먼저 저장
			visited[prev - 'a'] = true; // 이미 등장한 문자로 체크 설정

			for (int j = 1; j < str.length(); j++) {
				char cur = str.charAt(j);

				if (prev != cur) { // 현재 문자가 이전 문자와 달라졌다면, 이 문자가 과거에 나온적 있는지 확인
					if (visited[cur - 'a']) {
						isGroupWord = false;
						break;
					}

					visited[cur - 'a'] = true;
					prev = cur;
				}
			}

			if (isGroupWord) {
				count++;
			}
		}

		System.out.println(count);
	}
}
