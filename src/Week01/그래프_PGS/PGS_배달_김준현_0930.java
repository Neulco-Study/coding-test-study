package Week01.그래프_PGS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


// 9월 30일 수요일
// 풀이시간: 1시간
// 다익스트라
public class PGS_배달_김준현_0930 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			int[][] road = {
				{1, 2, 1},
				{2, 3, 3},
				{5, 2, 2},
				{1, 4, 2},
				{5, 3, 1},
				{5, 4, 2}
			}; // 2차원 배열

			int result1 = sol.solution(5, road, 3);
			System.out.println(result1);

		}

		public int solution(int N, int[][] road, int K) {
			int answer = 0;
			List<Node>[] graph = new ArrayList[N + 1];

			for (int i = 1; i <= N; i++) {
				graph[i] = new ArrayList<>();
			}

			for (int[] edge : road) {
				int a = edge[0];
				int b = edge[1];
				int time = edge[2];

				graph[a].add(new Node(b, time));
				graph[b].add(new Node(a, time)); // 양방향 그래프
			}

			int[] dist = new int[N + 1];                // 1번 마을에서 각 마을까지의 최소 시간을 저장하는 배열
			Arrays.fill(dist, Integer.MAX_VALUE);        // 아직 가는 방법을 모르므로 매우 큰 값으로 초기화
			dist[1] = 0;                                // 1번 마을 → 1번 마을은 이동 시간이 0

			PriorityQueue<Node> pq = new PriorityQueue<>(); //현재까지 이동 시간이 가장 짧은 노드부터 꺼내기 위한 우선순위 큐
			pq.offer(new Node(1, 0));            // 1번 마을에서 시작, 이동 시간은 0

			// 다익스트라 시작
			while (!pq.isEmpty()) {
				Node cur = pq.poll();
				if (dist[cur.node] < cur.time)
					continue;

				for (Node next : graph[cur.node]) {            // 현재 마을과 연결되어 있는 모든 도로 확인
					int newTime = cur.time + next.time;        // (1번 → 현재 마을까지 시간) + (현재 마을 → 다음 마을까지 도로 시간)
					if (newTime < dist[next.node]) {            // 더 짧은 경로를 발견했다면
						dist[next.node] = newTime;            // 거리 갱신
						pq.offer(new Node(next.node, newTime)); // pq에 추가
					}
				}
			}

			for (int i = 1; i <= N; i++) {
				if (dist[i] <= K)
					answer++;
			}

			return answer;
		}

		class Node implements Comparable<Node> {
			int node;
			int time;

			public Node(int node, int time) {
				this.node = node;
				this.time = time;
			}

			@Override
			public int compareTo(Node other) {
				return Integer.compare(this.time, other.time);
			}

		}

	}
}
