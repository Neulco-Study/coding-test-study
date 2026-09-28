package BOJ_Week4.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// 0926 토요일
// 풀이시간: 10분
// hashset
public class 문자열집합_김준현_0928 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashSet<String> set = new HashSet<>();

		for(int i = 1; i <= N; i++) {
			set.add(br.readLine());
		}
		int count = 0;

		for (int i = 0; i < M; i++) {
			String str = br.readLine();

			if(set.contains(str)) {
				count++;
			}
		}
		System.out.println(count);

	}
}

/*
## 코테 복습 노트

**BOJ 14425 문자열 집합**

- `HashSet`: 특정 값의 **존재 여부를 빠르게 확인**할 때 사용
- 처음 N개의 문자열을 `HashSet`에 저장
- 이후 M개의 문자열을 `contains()`로 검사
- `set.add(value)`: 값 저장
- `set.contains(value)`: 값이 존재하는지 확인
- **판단 기준:** 여러 값을 미리 저장해두고 이후 입력들이 **저장된 값에 존재하는지 반복 검사**한다면 `HashSet` 고려
- **실수 주의:** 문자열 문제라고 해서 문자열 알고리즘이 필요한 것은 아님. 무엇을 요구하는지 보고 자료구조를 선택
- **핵심 교훈:** `문자열 존재 여부`도 결국 `존재 여부 탐색` 문제이므로 `HashSet`을 활용할 수 있다.

특히 이번 문제와 바로 전에 푼 **BOJ 1764 듣보잡**을 묶어서 기억하면 좋다.

> **존재 여부 / 교집합 확인 → `HashSet + contains()`**


 */
