package Week07.스택_큐_PGS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import Week01.그래프_PGS.PGS_가장먼노드_김준현_0920;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class 같은숫자는싫어_김준현_1113 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			int[] arr1 = {1, 1, 3, 3, 0, 0, 1};
			int[] arr2 = {4, 4, 4, 3, 3};
			int[] result1 = sol.solution(arr1);
			int[] result2 = sol.solution(arr2);

			System.out.println(Arrays.toString(result1));
			System.out.println(Arrays.toString(result2));
		}

		public int[] solution(int[] arr) {
			int[] answer = {};

			Deque<Integer> deque = new ArrayDeque<>();

			for (int num : arr) {
				if (deque.isEmpty()) {
					deque.addLast(num);
				} else if (deque.peekLast() != num) {
					deque.addLast(num);
				}
			}

			answer = new int[deque.size()];
			int index = 0;

			for (int num : deque) {
				answer[index++] = num;
			}
			return answer;
		}
	}
}
