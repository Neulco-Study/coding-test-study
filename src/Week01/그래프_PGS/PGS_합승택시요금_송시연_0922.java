import java.util.*;

class PGS_합승택시요금_송시연_0922 {
    private static final int INF = Integer.MAX_VALUE;
    private List<Edge>[] graph;

    public int solution(int n, int s, int a, int b, int[][] fares) {
        
        graph = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < fares.length; i++) {
            int nodeA = fares[i][0];
            int nodeB = fares[i][1];
            int price = fares[i][2];
            
            graph[nodeA].add(new Edge(nodeB, price));
            graph[nodeB].add(new Edge(nodeA, price));
        }
        
        int[] distanceFromS = dijkstra(s, n);
        int[] distanceFromA = dijkstra(a, n);
        int[] distanceFromB = dijkstra(b, n);
        
        int answer = INF;

        for (int k = 1; k <= n; k++) {
            if (distanceFromS[k] == INF || distanceFromA[k] == INF || distanceFromB[k] == INF) {
                continue;
            }

            int totalPrice = distanceFromS[k] + distanceFromA[k] + distanceFromB[k];

            answer = Math.min(answer, totalPrice);
        }

        return answer;
    }

    public int[] dijkstra(int start, int n) {
        int[] distance = new int[n + 1];
        Arrays.fill(distance, INF);
        
        PriorityQueue<State> queue = 
            new PriorityQueue<>(
            (state1, state2) -> Integer.compare(state1.totalPrice, state2.totalPrice)
        );
        
        distance[start] = 0;
        queue.offer(new State(start, 0));
        
        while(!queue.isEmpty()) {
            State current = queue.poll();
            
            if(current.totalPrice > distance[current.node]) {
                continue;
            }
                
            for(Edge edge : graph[current.node]) {
                int nextPrice = current.totalPrice + edge.price;
                
                if(nextPrice < distance[edge.node]) {
                    distance[edge.node] = nextPrice;
                    queue.offer(new State(edge.node, nextPrice));
                }
            }
        }
        
        return distance;
    }

    public static class Edge{
        int node;
        int price;
        
        Edge(int node, int price){
            this.node = node;
            this.price = price;
        }
    }

    private static class State {
        int node;
        int totalPrice;

        State(int node, int totalPrice) {
            this.node = node;
            this.totalPrice = totalPrice;
        }
    }
}
