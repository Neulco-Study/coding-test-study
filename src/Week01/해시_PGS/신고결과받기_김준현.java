package Week01.해시_PGS;

import java.util.HashSet;

public class 신고결과받기_김준현 {

	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			String[] id_list = {"muzi", "frodo", "apeach", "neo"};
			String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
			int k = 2;

			//            String[] id_list = {"con", "ryan"};
			//            String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
			//            int k = 3;

			sol.solution(id_list, report, k);
		}

		public int[] solution(String[] id_list, String[] report, int k) {
			int[] answer = new int[id_list.length];

			// 1. 중복 제거
			HashSet<String> reportSet = new HashSet<>();
			for(String rep : report)
				reportSet.add(rep);


			// 2.


			// 3.


			// 4.
			return answer;
		}
	}

}

// 1. 중복 제거
// HashSet을 사용하여 report의 중복된 정보를 제거한다.

// 2. 신고자 목록
// Hash로 각 사용자를 신고한 사람들의 목록을 관리한다.

// 3. 신고한 사용자
// 정지된 사용자를 신고한 사용자에게 알려주고, 이 정보를 Hash로 정리