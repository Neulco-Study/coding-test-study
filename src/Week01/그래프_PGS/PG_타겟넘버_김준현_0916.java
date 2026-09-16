package Week01.그래프_PGS;

// 9월 16일 화요일 풀이시간 30분
// dfs
// 가능한 모든 선택 조합을 탐색하는 DFS(완전탐색) 문제
public class PG_타겟넘버_김준현_0916 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			int[] numbers1 = {1, 1, 1, 1, 1};
			int[] numbers2 = {4, 1, 2, 1};
			int result1 = sol.solution(numbers1, 3);
			int result2 = sol.solution(numbers2, 4);
			System.out.println(result1);
			System.out.println(result2);
		}

		int[] numbers;
		int target;
		int answer;

		public int solution(int[] numbers, int target) {
			answer = 0;
			this.numbers = numbers;
			this.target = target;

			dfs(0, 0);
			return answer;
		}

		void dfs(int index, int sum) {
			if (index == numbers.length) {
				if (sum == target) answer++;
				return;
			}
			dfs(index + 1, sum + numbers[index]);
			dfs(index + 1, sum - numbers[index]);
		}

	}

}

