package Week02.해시_PGS;

import java.util.*;

// 0929 화요일
// 풀이시간: 25분
// hashmap
public class 의상_김준현_0929 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
			int result = sol.solution(clothes);
			System.out.println(result);
		}

		public int solution(String[][] clothes) {
			int answer = 1;

			HashMap<String, Integer> map = new HashMap<>();

			for(int i = 0; i < clothes.length; i++) {
				String category = clothes[i][1];
				map.put(category, map.getOrDefault(category,0) + 1);
			}

			for(int count : map.values()) {
				answer *= (count + 1);
			}
			answer -= 1;

			return answer;
		}
	}
}

/*
## 코테 복습 노트

**프로그래머스 - 의상**

- `HashMap<String, Integer>`: `의상 종류 → 해당 종류의 옷 개수`
- `map.getOrDefault(category, 0) + 1`: 종류별 개수를 세는 빈도수 패턴
- `map.values()`: Key가 필요 없고 각 종류의 개수만 순회할 때 사용
- 각 종류에서 `옷 개수 + 1`개의 선택지가 있음
    - `+1`은 해당 종류를 착용하지 않는 경우
- 종류별 선택은 독립적이므로 경우의 수를 곱함
- 아무것도 입지 않은 경우가 하나 포함되므로 마지막에 `1`
- **판단 기준:** `종류별 개수`를 세어야 한다 → `HashMap + getOrDefault()`
- **경우의 수 판단 기준:** 여러 그룹에서 각각 하나씩 선택하여 조합 → 각 그룹의 선택지 수를 곱하기
- **실수 주의:** `clothes[i][0]`은 의상 이름, `clothes[i][1]`은 의상 종류
- **핵심 교훈:** 개별 데이터 자체보다 **카테고리별 개수**가 중요한 문제에서는 `카테고리 → 개수` 형태로 정보를 압축할 수 있다.


 */