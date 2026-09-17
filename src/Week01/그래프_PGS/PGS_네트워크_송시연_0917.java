package Week01.그래프_PGS;

// 9월 17일 목요일
// dfs
// 방문하지 않은 컴퓨터에서 DFS를 시작할 때마다 네트워크의 개수를 증가시킨다.
public class PGS_네트워크_송시연_0917 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			int[][] computers1 = {
				{1, 1, 0},
				{1, 1, 0},
				{0, 0, 1}
			};
			int[][] computers2 = {
				{1, 1, 0},
				{1, 1, 1},
				{0, 1, 1}
			};

			System.out.println(sol.solution(3, computers1));
			System.out.println(sol.solution(3, computers2));
		}

		public int solution(int n, int[][] computers) {
			boolean[] visited = new boolean[n];
			int answer = 0;

			for (int i = 0; i < n; i++) {
				if (!visited[i]) {
					dfs(i, computers, visited);
					answer++;
				}
			}

			return answer;
		}

		void dfs(int current, int[][] computers, boolean[] visited) {
			visited[current] = true;

			for (int next = 0; next < computers.length; next++) {
				if (computers[current][next] == 1 && !visited[next]) {
					dfs(next, computers, visited);
				}
			}
		}
	}
}
