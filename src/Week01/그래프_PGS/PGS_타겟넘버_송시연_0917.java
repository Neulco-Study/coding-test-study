package Week01.그래프_PGS;

// 9월 17일 목요일
// dfs
// 각 숫자를 더하는 경우와 빼는 경우를 모두 탐색한다.
public class PGS_타겟넘버_송시연_0917 {
	static class Solution {
		int answer;

		public static void main(String[] args) {
			Solution sol = new Solution();
			int[] numbers1 = {1, 1, 1, 1, 1};
			int[] numbers2 = {4, 1, 2, 1};

			System.out.println(sol.solution(numbers1, 3));
			System.out.println(sol.solution(numbers2, 4));
		}

		public int solution(int[] numbers, int target) {
			answer = 0;
			dfs(0, numbers, target, 0);

			return answer;
		}

		void dfs(int current, int[] numbers, int target, int sum) {
			if (current == numbers.length) {
				if (sum == target) {
					answer++;
				}
				return;
			}

			dfs(current + 1, numbers, target, sum + numbers[current]);
			dfs(current + 1, numbers, target, sum - numbers[current]);
		}
	}
}
