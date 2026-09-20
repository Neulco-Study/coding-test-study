package Week01.그래프_PGS;

// 9월 15일 월요일 풀이시간 30분
// dfs
// 모든 컴퓨터를 기점으로 DFS를 수행. 이미 방문된 컴퓨터는 건너뜀
// 네트워크의 개수를 반환
public class PGS_네트워크_김준현_0915 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			int[][] computers1 = {
				{1, 1, 0},
				{1, 1, 0},
				{0, 0, 1}
			}; // 2차원 배열
			int[][] computers2 = {
				{1, 1, 0},
				{1, 1, 1},
				{0, 1, 1}
			}; // 2차원 배열
			int result1 = sol.solution(3, computers1);
			int result2 = sol.solution(3, computers2);

			System.out.println(result1);
			System.out.println(result2);
		}

		public int solution(int n, int[][] computers) {
			int count = 0; // 네트워크 개수
			boolean[] visited = new boolean[n];

			for (int i = 0; i < n; i++) {
				if (visited[i]) continue;
				dfs(n, computers, visited, i);
				count++;
			}

			return count;
		}

		void dfs(int n, int[][] computers, boolean[] visited, int cur) {
			visited[cur] = true;

			for (int i = 0; i < n; i++) {
				if (!visited[i] && computers[cur][i] == 1) { // 현재 컴퓨터 cur와 컴퓨터 i가 직접 연결되어 있는지 확인하는 조건
					// "아직 안 갔고 + 현재 노드와 연결돼 있으면 간다."
					dfs(n, computers, visited, i);
				}
			}
		}
	}
}

// !visited[i] → 아직 방문하지 않은 컴퓨터인가?
// computers[cur][i] == 1 → 현재 컴퓨터와 연결되어 있는가?
