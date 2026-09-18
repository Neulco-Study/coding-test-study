package Week01.그래프_PGS;

import java.util.*;

public class PGS_네트워크_임재현_0918 {

	class Solution {

		int answer = 0;

		public int solution(int n, int[][] computers) {

			int[] visited = new int[n];

			for (int i = 0; i < n; i++) {
				if (visited[i] == 1)
					continue;

				dfs(i, 0, visited, computers);
				answer++;
			}

			return answer;
		}

		private void dfs(int start, int rotate, int[] visited, int[][] computers) {

			visited[start] = 1;

			for (int i = rotate; i < computers[start].length - 1; i++) {
				if (visited[i + 1] == 0 && computers[start][i + 1] == 1) {
					dfs(i + 1, 0, visited, computers);
				}

			}

		}
	}
}
