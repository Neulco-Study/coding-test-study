package BOJ_Week4.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

// 0928 월요일
// 풀이시간: 20분
// hashset
public class 듣보잡_김준현_0928 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		List<String> answer = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			String name = br.readLine();

			if (set.contains(name)) {
				answer.add(name);
			}
		}
		Collections.sort(answer);

		System.out.println(answer.size());
		for (String s : answer) {
			System.out.println(s);
		}
	}
}

// hashmap
// public class 듣보잡_김준현_0928 {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int N = Integer.parseInt(st.nextToken());
// 		int M = Integer.parseInt(st.nextToken());
//
// 		HashMap<String, Integer> map = new HashMap<>();
// 		for (int i = 1; i <= N + M; i++) {
// 			String name = br.readLine();
// 			map.put(name, map.getOrDefault(name, 0) + 1);
// 		}
//
// 		List<String> answer =new ArrayList<>();
// 		StringBuilder sb = new StringBuilder();
//
// 		for(Map.Entry<String, Integer> entry: map.entrySet()) {
// 			if(entry.getValue() == 2) {
// 				answer.add(entry.getKey());
// 			}
// 		}
// 		Collections.sort(answer);
//
// 		sb.append(answer.size()).append('\n');
//
// 		for (String s : answer) {
// 			sb.append(s).append("\n");
// 		}
//
// 		System.out.println(sb);
//
// 	}
// }


/*
<코테 복습 노트>
BOJ 1764 듣보잡
- HashMap<String, Integer>: 이름 → 등장 횟수를 저장
- getOrDefault(key, 0) + 1: 각 이름의 등장 횟수를 셀 때 활용
- 두 명단에 모두 등장한 사람은 빈도수가 2
- Map.Entry: Key와 Value를 함께 확인해야 할 때 사용
- Collections.sort(list): 문자열을 사전순으로 정렬
- answer.size(): 정답을 리스트에 모았다면 별도의 count 변수가 필요 없음
- 많은 출력은 StringBuilder로 모아서 한 번에 출력
- 판단 기준: 값별 등장 횟수/빈도수를 관리해야 한다면 HashMap + getOrDefault()를 고려
- 실수 주의: HashMap은 정렬된 순서를 보장하지 않으므로 문제에서 사전순 출력을 요구하면 별도로 정렬해야 함
- 핵심 교훈: 두 집합의 공통 원소를 찾는 문제는 HashMap으로 빈도수를 세는 방법도 있고, HashSet을 이용해 존재 여부를 검사하는 방법도 있다.

유사 문제 추천
- 🟢 프로그래머스 - 완주하지 못한 선수 — HashMap + 빈도수. 이번에 사용한 getOrDefault()를 그대로 연습하기 좋아.
- 🟢 BOJ 10816 - 숫자 카드 2 — HashMap + 빈도수. 각 숫자가 몇 번 존재하는지 반복 조회하는 연습.
- 🟡 LeetCode 242 - Valid Anagram — HashMap / 빈도수. 두 문자열의 문자 빈도를 비교하는 연습.
- 🟡 LeetCode 1 - Two Sum — HashMap. 빈도수가 아니라 Key → Value 빠른 조회라는 해시의 다른 활용법을 연습하기 좋아.
- 🔴 LeetCode 49 - Group Anagrams — HashMap + 문자열. 어떤 값을 Map의 Key로 만들어 그룹화할지 생각하는 연습.

 */