package Week01.그래프_PGS;

import java.util.*;

public class PSG_단어변환_임재현_0926 {

	class Solution {

		public int solution(String begin, String target, String[] words) {

			int answer = 0;
			int length = begin.length();

			Queue<Node> queue = new ArrayDeque<>();

			boolean[] visited = new boolean[words.length];

			queue.offer(new Node(begin, 0));

			while (!queue.isEmpty()) {

				Node node = queue.poll();

				String current = node.word;
				int distance = node.distance;

				for (int i=0; i<words.length; i ++) {

					if (visited[i]) {
						continue;
					}

					String word = words[i];

					int diffCount = 0;

					for(int j=0; j<length; j++) {
						if (word.charAt(j) != current.charAt(j)) {
							diffCount = diffCount + 1;
						}
					}

					if(diffCount==1) {
						if (word.equals(target)) {
							answer = distance+1;
							return answer;
						}
						else {
							queue.offer(new Node(word, distance+1));
							visited[i] = true;
							continue;
						}
					}
				}

			}
			return answer;
		}
	}

	class Node {
		String word;
		int distance;

		Node(String word, int distance) {
			this.word = word;
			this.distance = distance;
		}
	}

}
