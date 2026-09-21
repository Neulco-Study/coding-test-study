package Week01.그래프_PGS;

public class PGS_순위_송시연_0921 {
    public int solution(int n, int[][] results) {
        boolean[][] win = new boolean[n + 1][n + 1];

        for (int[] result : results) {
            win[result[0]][result[1]] = true;
        }

        for (int mid = 1; mid <= n; mid++) {
            for (int winner = 1; winner <= n; winner++) {
                for (int loser = 1; loser <= n; loser++) {
                    if (win[winner][mid] && win[mid][loser]) {
                        win[winner][loser] = true;
                    }
                }
            }
        }

        int answer = 0;

        for (int player = 1; player <= n; player++) {
            int known = 0;

            for (int other = 1; other <= n; other++) {
                if (win[player][other] || win[other][player]) {
                    known++;
                }
            }

            if (known == n - 1) {
                answer++;
            }
        }

        return answer;
    }
}
