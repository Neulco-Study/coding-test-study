package Week01.그래프_PGS;

public class PGS_도넛과막대그래프_송시연_0928 {
	static class Solution {
		public int[] solution(int[][] edges) {
			int[] inGraph = new int[1_000_001];
			int[] outGraph = new int[1_000_001];
			int maxVertex = 0;

			for (int[] edge : edges) {
				int from = edge[0];
				int to = edge[1];

				outGraph[from]++;
				inGraph[to]++;
				maxVertex = Math.max(maxVertex, Math.max(from, to));
			}

			int createdVertex = 0;

			for (int vertex = 1; vertex <= maxVertex; vertex++) {
				if (inGraph[vertex] == 0 && outGraph[vertex] >= 2) {
					createdVertex = vertex;
					break;
				}
			}

			int barCount = 0;
			int eightCount = 0;

			for (int vertex = 1; vertex <= maxVertex; vertex++) {
				if (vertex == createdVertex) {
					continue;
				}

				if (inGraph[vertex] > 0 && outGraph[vertex] == 0) {
					barCount++;
				}

				if (inGraph[vertex] >= 2 && outGraph[vertex] == 2) {
					eightCount++;
				}
			}

			int totalGraphCount = outGraph[createdVertex];
			int donutCount = totalGraphCount - barCount - eightCount;

			return new int[] {
				createdVertex,
				donutCount,
				barCount,
				eightCount
			};
		}
	}
}
