package Week01.그래프_PGS;

import java.util.*;

public class PGS_가장먼노드_송시연_0918 {
    public int solution(int n, int[][] edge) {
        List<Integer>[] nodes = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int[] connection : edge) {
            int nodeA = connection[0];
            int nodeB = connection[1];

            nodes[nodeA].add(nodeB);
            nodes[nodeB].add(nodeA);
        }

        Queue<int[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n + 1];

        int maxDistance = Integer.MIN_VALUE;
        int answer = 0;

        queue.offer(new int[]{1, 0});
        visited[1] = true;

        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int node = tmp[0];
            int distance = tmp[1];

            if (maxDistance < distance) {
                maxDistance = distance;
                answer = 1;
            } else if (maxDistance == distance) {
                answer++;
            }

            for (int tmpNode : nodes[node]) {
                if (!visited[tmpNode]) {
                    visited[tmpNode] = true;
                    queue.offer(new int[]{tmpNode, distance + 1});
                }
            }
        }

        return answer;
    }
}
