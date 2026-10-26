package Week01.힙_PGS;

// https://school.programmers.co.kr/learn/courses/30/lessons/138477
import java.util.*;

public class PGS_명예의전당_송시연_1022 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            pq.offer(score[i]);

            if(pq.size() > k) {
                pq.poll();
            }

            answer[i] = pq.peek();
        }

        return answer;
    }
}
