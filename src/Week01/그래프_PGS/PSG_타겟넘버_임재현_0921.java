package Week01.그래프_PGS;

public class PSG_타겟넘버_임재현_0921 {

	class Solution {

		static int answer = 0;

		public int solution(int[] numbers, int target) {

			int sum = 0;
			int idx = 0;
			dfs(numbers, target, sum, idx);

			return answer;
		}

		private void dfs(int[] numbers, int target, int sum, int idx) {

			// 다 돌았으면 target넘버 계산해보고 일치하면 answer + 1
			if (numbers.length == idx) {
				if(target == sum) {
					answer = answer + 1;
				}
				return;
			}

			dfs(numbers, target, sum + numbers[idx], idx+1);
			dfs(numbers, target, sum - numbers[idx], idx+1);

		}
	}
}
