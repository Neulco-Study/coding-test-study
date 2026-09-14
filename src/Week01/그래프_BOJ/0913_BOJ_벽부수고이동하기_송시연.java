package Week01.그래프_BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

/*
 * 백준 2206 - 벽 부수고 이동하기
 * https://www.acmicpc.net/problem/2206
 *
 * 문제 요약
 * 0은 이동할 수 있는 칸, 1은 벽인 N x M 지도에서 (1, 1)부터 (N, M)까지
 * 이동하는 최단 거리를 구한다. 필요한 경우 벽을 최대 한 개까지 부술 수 있다.
 * 이동은 상하좌우로만 가능하며 시작 칸과 도착 칸도 거리에 포함한다.
 *
 * 입력
 * 첫째 줄: N M
 * 다음 N개 줄: 0과 1로 이루어진 지도
 *
 * 출력
 * 최단 거리를 출력한다.
 * 도착할 수 없으면 -1을 출력한다.
 */
class Main {

    private static final int[] DR = {-1, 1, 0, 0};
    private static final int[] DC = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for (int row = 0; row < n; row++) {
            String line = br.readLine();
            for (int col = 0; col < m; col++) {
                map[row][col] = line.charAt(col) - '0';
            }
        }

        System.out.println(bfs(map));
    }

    private static int bfs(int[][] map) {
        int n = map.length;
        int m = map[0].length;

        ArrayDeque<State> queue = new ArrayDeque<>();
        boolean[][][] visited = new boolean[n][m][2];

        // TODO: 시작 상태를 큐에 넣고 BFS로 최단 거리를 구한다.
        // TODO: 같은 칸이라도 벽을 부순 상태와 부수지 않은 상태를 따로 방문 처리한다.

        return -1;
    }

    private static class State {
        private final int row;
        private final int col;
        private final int distance;
        private final int wallBroken;

        private State(int row, int col, int distance, int wallBroken) {
            this.row = row;
            this.col = col;
            this.distance = distance;
            this.wallBroken = wallBroken;
        }
    }
}
