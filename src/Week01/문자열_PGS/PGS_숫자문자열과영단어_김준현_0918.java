package Week01.문자열_PGS;

public class PGS_숫자문자열과영단어_김준현_0918 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			String s = "one4seveneight";
			int result = sol.solution(s);
			System.out.println(result);
		}

		public int solution(String s) {
			String[] str = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
			for (int i = 0; i < str.length; i++) {
				s = s.replace(str[i], String.valueOf(i));
			}

			return Integer.parseInt(s);
		}
	}
}
