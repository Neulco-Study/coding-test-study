package Week01.그래프_PGS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PGS_가장먼노드_김준현_0920 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
			int result = sol.solution(6, vertex);
			System.out.println(result);
		}

		public int solution(int n, int[][] edge) {
			ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
			for (int i = 0; i <= n; i++) {
				graph.add(new ArrayList<>());
			}
			for (int[] e : edge) {
				graph.get(e[0]).add(e[1]);
				graph.get(e[1]).add(e[0]);  // 양방향 추가
			}
			int[] distance = new int[n + 1];
			Arrays.fill(distance, -1);
			distance[1] = 0;
			Queue<Integer> queue = new LinkedList<>();
			queue.offer(1);

			while (!queue.isEmpty()) {
				int current = queue.poll();
				for (int next : graph.get(current)) {
					if (distance[next] == -1) {              // 방문 체크 추가
						queue.offer(next);
						distance[next] = distance[current] + 1;
					}
				}
			}

			int maxDistance = 0;
			for (int i = 1; i <= n; i++) {
				maxDistance = Math.max(maxDistance, distance[i]);
			}
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (distance[i] == maxDistance)
					count++;
			}
			return count;
		}
	}
}
