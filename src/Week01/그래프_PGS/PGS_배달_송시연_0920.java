package Week01.그래프_PGS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PGS_배달_송시연_0920 {
    private static final int INF = 1_000_000_000;

    public int solution(int N, int[][] road, int K) {
        List<Node>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] r : road) {
            int a = r[0];
            int b = r[1];
            int cost = r[2];

            graph[a].add(new Node(b, cost));
            graph[b].add(new Node(a, cost));
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[1] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cur.cost > dist[cur.idx]) {
                continue;
            }

            for (Node next : graph[cur.idx]) {
                int newCost = dist[cur.idx] + next.cost;

                if (newCost < dist[next.idx]) {
                    dist[next.idx] = newCost;
                    pq.offer(new Node(next.idx, newCost));
                }
            }
        }

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) {
                count++;
            }
        }

        return count;
    }

    private static class Node implements Comparable<Node> {
        private final int idx;
        private final int cost;

        private Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.cost, other.cost);
        }
    }
}
